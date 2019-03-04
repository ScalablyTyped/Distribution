package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultWebGLRendererPlugins extends js.Object {
  var extract: pixiDotJsLib.PIXINs.extractNs.WebGLExtract
  var prepare: pixiDotJsLib.PIXINs.prepareNs.WebGLPrepare
}

object DefaultWebGLRendererPlugins {
  @scala.inline
  def apply(
    extract: pixiDotJsLib.PIXINs.extractNs.WebGLExtract,
    prepare: pixiDotJsLib.PIXINs.prepareNs.WebGLPrepare
  ): DefaultWebGLRendererPlugins = {
    val __obj = js.Dynamic.literal(extract = extract, prepare = prepare)
  
    __obj.asInstanceOf[DefaultWebGLRendererPlugins]
  }
}

