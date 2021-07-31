package typings.objectAssignDeep

import typings.objectAssignDeep.anon.FnCall
import typings.objectAssignDeep.objectAssignDeepStrings.merge
import typings.objectAssignDeep.objectAssignDeepStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(target: js.Object, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  @scala.inline
  def apply[T, U, V](target: T, source1: U, source2: V): T & U & V = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
  @scala.inline
  def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W]
  
  @JSImport("object-assign-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var arrayBehaviour: replace | merge
  }
  object Options {
    
    @scala.inline
    def apply(arrayBehaviour: replace | merge): Options = {
      val __obj = js.Dynamic.literal(arrayBehaviour = arrayBehaviour.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayBehaviour(value: replace | merge): Self = StObject.set(x, "arrayBehaviour", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait objectAssignDeep extends StObject {
    
    def noMutate(target: js.Object, sources: js.Any*): js.Any = js.native
    def noMutate[T, U](target: T, source: U): T & U = js.native
    def noMutate[T, U, V](target: T, source1: U, source2: V): T & U & V = js.native
    def noMutate[T, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = js.native
    @JSName("noMutate")
    var noMutate_Original: FnCall = js.native
    
    def withOptions(target: js.Any, objects: js.Array[js.Any], options: Options): js.Any = js.native
    def withOptions[T, U](target: T, objects: js.Array[U], options: Options): T & U = js.native
    def withOptions[T, U, V](target: T, objects: js.Tuple2[U, V], options: Options): T & U & V = js.native
    def withOptions[T, U, V, W](target: T, objects: js.Tuple3[U, V, W], options: Options): T & U & V & W = js.native
  }
}
