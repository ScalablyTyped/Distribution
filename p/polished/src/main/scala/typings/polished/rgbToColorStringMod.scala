package typings.polished

import typings.polished.colorMod.RgbColor
import typings.polished.colorMod.RgbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rgbToColorStringMod {
  
  @JSImport("polished/lib/color/rgbToColorString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(color: RgbColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(color: RgbaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
