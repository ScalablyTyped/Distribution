package typings.ol

import typings.ol.colorMod.Color
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorlikeMod {
  
  @JSImport("ol/colorlike", "asColorLike")
  @js.native
  def asColorLike(color: Color): ColorLike = js.native
  @JSImport("ol/colorlike", "asColorLike")
  @js.native
  def asColorLike(color: ColorLike): ColorLike = js.native
  
  type ColorLike = String | CanvasPattern | CanvasGradient
}
