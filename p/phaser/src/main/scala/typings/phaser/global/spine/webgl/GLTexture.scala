package typings.phaser.global.spine.webgl

import typings.std.HTMLImageElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
