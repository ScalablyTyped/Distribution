package typings.polished

import typings.polished.libTypesColorMod.RgbColor
import typings.polished.libTypesColorMod.RgbaColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorParseToRgbMod {
  
  @JSImport("polished/lib/color/parseToRgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(color: String): RgbColor | RgbaColor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(color.asInstanceOf[js.Any]).asInstanceOf[RgbColor | RgbaColor]
}
