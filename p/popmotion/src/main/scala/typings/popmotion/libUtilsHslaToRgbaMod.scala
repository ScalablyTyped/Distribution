package typings.popmotion

import typings.styleValueTypes.libTypesMod.HSLA
import typings.styleValueTypes.libTypesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsHslaToRgbaMod {
  
  @JSImport("popmotion/lib/utils/hsla-to-rgba", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hslaToRgba(hasHueSaturationLightnessAlpha: HSLA): RGBA = ^.asInstanceOf[js.Dynamic].applyDynamic("hslaToRgba")(hasHueSaturationLightnessAlpha.asInstanceOf[js.Any]).asInstanceOf[RGBA]
}
