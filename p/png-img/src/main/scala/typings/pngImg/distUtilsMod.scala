package typings.pngImg

import typings.pngImg.distTypesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("png-img/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("png-img/dist/utils", "RGBToString")
  @js.native
  def RGBToString: js.Function1[/* rgb */ Color, String] = js.native
  inline def RGBToString(rgb: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBToString")(rgb.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def RGBToString_=(x: js.Function1[/* rgb */ Color, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RGBToString")(x.asInstanceOf[js.Any])
  
  @JSImport("png-img/dist/utils", "stringToRGBA")
  @js.native
  def stringToRGBA: js.Function1[/* string */ String, Color | Null] = js.native
  inline def stringToRGBA(string: String): Color | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToRGBA")(string.asInstanceOf[js.Any]).asInstanceOf[Color | Null]
  inline def stringToRGBA_=(x: js.Function1[/* string */ String, Color | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringToRGBA")(x.asInstanceOf[js.Any])
}
