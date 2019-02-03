package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "RenderTexture")
@js.native
class RenderTexture protected ()
  extends pixiDotJsLib.PIXINs.RenderTexture {
  def this(baseRenderTexture: pixiDotJsLib.PIXINs.BaseRenderTexture) = this()
  def this(baseRenderTexture: pixiDotJsLib.PIXINs.BaseRenderTexture, frame: pixiDotJsLib.PIXINs.Rectangle) = this()
}

/* static members */
@JSImport("pixi.js", "RenderTexture")
@js.native
object RenderTexture extends js.Object {
  def create(): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double, height: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double, height: scala.Double, scaleMode: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
  def create(width: scala.Double, height: scala.Double, scaleMode: scala.Double, resolution: scala.Double): pixiDotJsLib.PIXINs.RenderTexture = js.native
}

