package typings.ol

import typings.ol.colorMod.Color
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorlikeMod {
  
  @JSImport("ol/colorlike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asColorLike(color: Color): ColorLike = ^.asInstanceOf[js.Dynamic].applyDynamic("asColorLike")(color.asInstanceOf[js.Any]).asInstanceOf[ColorLike]
  inline def asColorLike(color: ColorLike): ColorLike = ^.asInstanceOf[js.Dynamic].applyDynamic("asColorLike")(color.asInstanceOf[js.Any]).asInstanceOf[ColorLike]
  
  type ColorLike = String | CanvasPattern | CanvasGradient
}
