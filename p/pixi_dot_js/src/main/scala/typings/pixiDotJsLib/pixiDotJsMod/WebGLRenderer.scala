package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "WebGLRenderer")
@js.native
// plugintarget mixin end
class WebGLRenderer ()
  extends pixiDotJsLib.PIXINs.WebGLRenderer {
  def this(options: pixiDotJsLib.PIXINs.WebGLRendererOptions) = this()
  def this(screenWidth: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double, options: pixiDotJsLib.PIXINs.WebGLRendererOptions) = this()
}

/* static members */
@JSImport("pixi.js", "WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: org.scalablytyped.runtime.StringDictionary[pixiDotJsLib.Anon_RendererAny] = js.native
  def registerPlugin(pluginName: java.lang.String, ctor: pixiDotJsLib.Anon_RendererAny): scala.Unit = js.native
}

