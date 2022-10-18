package typings.polished

import typings.polished.libTypesColorMod.RgbColor
import typings.polished.libTypesColorMod.RgbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorRgbToColorStringMod {
  
  @JSImport("polished/lib/color/rgbToColorString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: RgbColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(color: RgbaColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[String]
}
