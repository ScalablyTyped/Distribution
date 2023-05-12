package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcColorMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def randomCssColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomCssColor")().asInstanceOf[String]
  
  inline def rgb2Hex(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2Hex")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
