package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringGetPreviousMatchingPosMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/getPreviousMatchingPos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPosition(string: String, subString: String, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(string.asInstanceOf[js.Any], subString.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPreviousMatchingPos(text: String, pos: Double, predicate: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMatchingPos")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getPreviousMatchingPos(text: String, pos: Double, predicate: js.Function1[/* char */ String, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousMatchingPos")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
}
