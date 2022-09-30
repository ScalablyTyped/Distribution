package typings.ow

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ow.basePredicateMod.BasePredicate
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchShapeMod {
  
  @JSImport("ow/dist/utils/match-shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exact(`object`: Record[String, Any], shape: Shape): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: Record[String, Any], shape: Shape, parent: String): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: Record[String, Any], shape: Shape, parent: String, isArray: Boolean): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], isArray.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: Record[String, Any], shape: Shape, parent: Unit, isArray: Boolean): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], isArray.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  inline def partial(`object`: Record[String, Any], shape: Shape): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def partial(`object`: Record[String, Any], shape: Shape, parent: String): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  trait Shape
    extends StObject
       with /* key */ StringDictionary[BasePredicate[Any] | Shape]
  object Shape {
    
    inline def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
  }
  
  type TypeOfShape[S /* <: BasePredicate[Any] | Shape */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: ow.ow/dist/utils/match-shape.TypeOfShape<S[K]>}
    */ typings.ow.owStrings.TypeOfShape & TopLevel[S]
}
