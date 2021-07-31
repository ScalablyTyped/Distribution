package typings.mergerino

import org.scalablytyped.runtime.TopLevel
import typings.std.ReadonlyArray
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mergerino", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[S /* <: js.Object */](source: S, patches: MultipleTopLevelPatch[S]*): S = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[S]
  
  type ArrayPatch[T] = ObjectPatch[Record[Double, js.Any]]
  
  @js.native
  trait DeepArray[T]
    extends StObject
       with ReadonlyArray[T | DeepArray[T]]
  
  type DeletePatch = Unit
  
  /* Rewritten from type alias, can be one of: 
    - typings.mergerino.mergerinoBooleans.`false`
    - typings.mergerino.mergerinoNumbers.`0`
    - typings.mergerino.mergerinoStrings._empty
    - scala.Null
    - scala.Unit
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type FunctionPatch[T] = js.Function2[/* val */ T, /* merge */ Merge[T], T]
  
  @js.native
  trait Merge[S /* <: js.Object */] extends StObject {
    
    def apply(source: S, patches: MultipleTopLevelPatch[S]*): S = js.native
  }
  
  type MultipleTopLevelPatch[S /* <: js.Object */] = TopLevelPatch[S] | DeepArray[TopLevelPatch[S]]
  
  type NestedPatch[T] = ObjectPatch[T]
  
  type ObjectPatch[S /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]:? S[K] | mergerino.mergerino.DeletePatch | mergerino.mergerino.FunctionPatch<S[K]> | mergerino.mergerino.NestedPatch<S[K]> | mergerino.mergerino.ArrayPatch<S[K]>}
    */ typings.mergerino.mergerinoStrings.ObjectPatch & TopLevel[js.Any]
  
  type TopLevelPatch[S /* <: js.Object */] = FunctionPatch[S] | ObjectPatch[S] | ArrayPatch[S] | Falsy
  
  trait _Falsy extends StObject
}
