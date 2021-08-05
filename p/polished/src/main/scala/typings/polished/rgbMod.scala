package typings.polished

import typings.polished.colorMod.RgbColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbMod {
  
  @JSImport("polished/lib/color/rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(value: Double, green: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(value: Double, green: Double, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(value: Double, green: Unit, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(value: RgbColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(value: RgbColor, green: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(value: RgbColor, green: Double, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(value: RgbColor, green: Unit, blue: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
}
