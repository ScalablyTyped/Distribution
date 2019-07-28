package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.Anon_RendererAny
import typings.pixiDotJs.PIXINs.WebGLRendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "WebGLRenderer")
@js.native
// plugintarget mixin end
class WebGLRenderer ()
  extends typings.pixiDotJs.PIXINs.WebGLRenderer {
  def this(options: WebGLRendererOptions) = this()
  def this(screenWidth: Double) = this()
  def this(screenWidth: Double, screenHeight: Double) = this()
  def this(screenWidth: Double, screenHeight: Double, options: WebGLRendererOptions) = this()
}

/* static members */
@JSImport("pixi.js", "WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: StringDictionary[Anon_RendererAny] = js.native
  def registerPlugin(pluginName: String, ctor: Anon_RendererAny): Unit = js.native
}

