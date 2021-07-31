package typings.polished

import typings.polished.colorMod.RgbColor
import typings.polished.colorMod.RgbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseToRgbMod {
  
  @JSImport("polished/lib/color/parseToRgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(color: String): RgbColor | RgbaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[RgbColor | RgbaColor]
}
