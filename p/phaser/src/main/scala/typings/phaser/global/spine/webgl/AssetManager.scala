package typings.phaser.global.spine.webgl

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.webgl.AssetManager")
@js.native
class AssetManager protected ()
  extends typings.phaser.spine.AssetManager {
  def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext) = this()
  def this(context: WebGLRenderingContext) = this()
  def this(context: typings.phaser.spine.webgl.ManagedWebGLRenderingContext, pathPrefix: String) = this()
  def this(context: WebGLRenderingContext, pathPrefix: String) = this()
}
