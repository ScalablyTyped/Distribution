package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// textures
@JSGlobal("PIXI.BaseRenderTexture")
@js.native
class BaseRenderTexture () extends BaseTexture {
  def this(width: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double, scaleMode: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double, scaleMode: scala.Double, resolution: scala.Double) = this()
  var _canvasRenderTarget: ScalablyTyped.runtime.NumberDictionary[stdLib.WebGLTexture] = js.native
  var _glRenderTargets: ScalablyTyped.runtime.NumberDictionary[stdLib.WebGLTexture] = js.native
  var valid: scala.Boolean = js.native
  def resize(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

