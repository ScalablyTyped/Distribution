package typings.ol.webglRenderTargetMod

import typings.std.Uint8Array
import typings.std.WebGLFramebuffer
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/RenderTarget", JSImport.Default)
@js.native
class default protected () extends WebGLRenderTarget {
  def this(helper: typings.ol.webglHelperMod.default) = this()
  def this(helper: typings.ol.webglHelperMod.default, opt_size: js.Array[Double]) = this()
  /* CompleteClass */
  override def clearCachedData(): Unit = js.native
  /* CompleteClass */
  override def getFramebuffer(): WebGLFramebuffer = js.native
  /* CompleteClass */
  override def getSize(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getTexture(): WebGLTexture = js.native
  /* CompleteClass */
  override def readAll(): Uint8Array = js.native
  /* CompleteClass */
  override def readPixel(x: Double, y: Double): Uint8Array = js.native
  /* CompleteClass */
  override def setSize(size: js.Array[Double]): Unit = js.native
}

