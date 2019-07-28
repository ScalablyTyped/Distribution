package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// textures
@JSGlobal("PIXI.BaseRenderTexture")
@js.native
class BaseRenderTexture () extends BaseTexture {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, scaleMode: Double) = this()
  def this(width: Double, height: Double, scaleMode: Double, resolution: Double) = this()
  var _canvasRenderTarget: NumberDictionary[WebGLTexture] = js.native
  var _glRenderTargets: NumberDictionary[WebGLTexture] = js.native
  var valid: Boolean = js.native
  def resize(width: Double, height: Double): Unit = js.native
}

