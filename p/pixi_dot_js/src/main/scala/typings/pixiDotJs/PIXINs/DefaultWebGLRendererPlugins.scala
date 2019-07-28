package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.extractNs.WebGLExtract
import typings.pixiDotJs.PIXINs.prepareNs.WebGLPrepare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultWebGLRendererPlugins extends js.Object {
  var extract: WebGLExtract
  var prepare: WebGLPrepare
}

object DefaultWebGLRendererPlugins {
  @scala.inline
  def apply(extract: WebGLExtract, prepare: WebGLPrepare): DefaultWebGLRendererPlugins = {
    val __obj = js.Dynamic.literal(extract = extract, prepare = prepare)
  
    __obj.asInstanceOf[DefaultWebGLRendererPlugins]
  }
}

