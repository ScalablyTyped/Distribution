package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.extractNs.CanvasExtract
import typings.pixiDotJs.PIXINs.prepareNs.CanvasPrepare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCanvasRendererPlugins extends js.Object {
  var extract: CanvasExtract
  var prepare: CanvasPrepare
}

object DefaultCanvasRendererPlugins {
  @scala.inline
  def apply(extract: CanvasExtract, prepare: CanvasPrepare): DefaultCanvasRendererPlugins = {
    val __obj = js.Dynamic.literal(extract = extract, prepare = prepare)
  
    __obj.asInstanceOf[DefaultCanvasRendererPlugins]
  }
}

