package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "WebGLRenderer")
@js.native
class WebGLRenderer ()
  extends pixiDotJsLib.PIXINs.WebGLRenderer {
  // plugintarget mixin end
  def this(options: pixiDotJsLib.PIXINs.WebGLRendererOptions) = this()
  def this(screenWidth: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double, options: pixiDotJsLib.PIXINs.WebGLRendererOptions) = this()
}

@JSImport("pixi.js", "WebGLRenderer")
@js.native
object WebGLRenderer extends js.Object {
  //tslint:disable-next-line:ban-types forbidden-types
  // plugintarget mixin start
  var __plugins: ScalablyTyped.runtime.StringDictionary[pixiDotJsLib.Anon_RendererWebGLRenderer] = js.native
  def registerPlugin(pluginName: java.lang.String, ctor: pixiDotJsLib.Anon_RendererWebGLRenderer): scala.Unit = js.native
}

