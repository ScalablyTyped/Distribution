package typings.phaser.global.spine.webgl

import typings.phaser.spine.TextureFilter
import typings.phaser.spine.TextureWrap
import typings.std.HTMLImageElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.webgl.GLTexture")
@js.native
class GLTexture protected ()
  extends typings.phaser.spine.webgl.GLTexture {
  def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, image: HTMLImageElement) = this()
  def this(context: WebGLRenderingContext, image: HTMLImageElement) = this()
  def this(
    context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext,
    image: HTMLImageElement,
    useMipMaps: Boolean
  ) = this()
  def this(context: WebGLRenderingContext, image: HTMLImageElement, useMipMaps: Boolean) = this()
  /* CompleteClass */
  override var _image: HTMLImageElement = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  /* CompleteClass */
  override def restore(): Unit = js.native
  /* CompleteClass */
  override def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit = js.native
  /* CompleteClass */
  override def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit = js.native
}

