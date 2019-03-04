package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCanvasRendererPlugins extends js.Object {
  var extract: pixiDotJsLib.PIXINs.extractNs.CanvasExtract
  var prepare: pixiDotJsLib.PIXINs.prepareNs.CanvasPrepare
}

object DefaultCanvasRendererPlugins {
  @scala.inline
  def apply(
    extract: pixiDotJsLib.PIXINs.extractNs.CanvasExtract,
    prepare: pixiDotJsLib.PIXINs.prepareNs.CanvasPrepare
  ): DefaultCanvasRendererPlugins = {
    val __obj = js.Dynamic.literal(extract = extract, prepare = prepare)
  
    __obj.asInstanceOf[DefaultCanvasRendererPlugins]
  }
}

