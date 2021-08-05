package typings.ow

import org.scalablytyped.runtime.StringDictionary
import typings.ow.basePredicateMod.BasePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchShapeMod {
  
  @JSImport("ow/dist/source/utils/match-shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exact(`object`: StringDictionary[js.Any], shape: Shape): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def exact(`object`: StringDictionary[js.Any], shape: Shape, parent: String): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("exact")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  inline def partial(`object`: StringDictionary[js.Any], shape: Shape): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def partial(`object`: StringDictionary[js.Any], shape: Shape, parent: String): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("partial")(`object`.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  
  trait Shape
    extends StObject
       with /* key */ StringDictionary[BasePredicate[js.Any] | Shape]
  object Shape {
    
    inline def apply(): Shape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Shape]
    }
  }
}
