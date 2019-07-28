package typings.pixiDotJs.pixiDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pixiDotJs.Anon_Renderer
import typings.pixiDotJs.PIXINs.RendererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "CanvasRenderer")
@js.native
// plugintarget mixin end
class CanvasRenderer ()
  extends typings.pixiDotJs.PIXINs.CanvasRenderer {
  def this(options: RendererOptions) = this()
  def this(screenWidth: Double) = this()
  def this(screenWidth: Double, screenHeight: Double) = this()
  def this(screenWidth: Double, screenHeight: Double, options: RendererOptions) = this()
}

/* static members */
@JSImport("pixi.js", "CanvasRenderer")
@js.native
object CanvasRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: StringDictionary[Anon_Renderer] = js.native
  def registerPlugin(pluginName: String, ctor: Anon_Renderer): Unit = js.native
}

