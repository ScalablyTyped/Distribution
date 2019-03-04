package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRendererPlugins
  extends DefaultWebGLRendererPlugins
     with DefaultRendererPlugins

object WebGLRendererPlugins {
  @scala.inline
  def apply(
    accessibility: pixiDotJsLib.PIXINs.accessibilityNs.AccessibilityManager,
    extract: pixiDotJsLib.PIXINs.extractNs.WebGLExtract,
    interaction: pixiDotJsLib.PIXINs.interactionNs.InteractionManager,
    prepare: pixiDotJsLib.PIXINs.prepareNs.WebGLPrepare
  ): WebGLRendererPlugins = {
    val __obj = js.Dynamic.literal(accessibility = accessibility, extract = extract, interaction = interaction, prepare = prepare)
  
    __obj.asInstanceOf[WebGLRendererPlugins]
  }
}

