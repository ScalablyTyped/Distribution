package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.accessibilityNs.AccessibilityManager
import typings.pixiDotJs.PIXINs.extractNs.WebGLExtract
import typings.pixiDotJs.PIXINs.interactionNs.InteractionManager
import typings.pixiDotJs.PIXINs.prepareNs.WebGLPrepare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRendererPlugins
  extends DefaultWebGLRendererPlugins
     with DefaultRendererPlugins

object WebGLRendererPlugins {
  @scala.inline
  def apply(
    accessibility: AccessibilityManager,
    extract: WebGLExtract,
    interaction: InteractionManager,
    prepare: WebGLPrepare
  ): WebGLRendererPlugins = {
    val __obj = js.Dynamic.literal(accessibility = accessibility, extract = extract, interaction = interaction, prepare = prepare)
  
    __obj.asInstanceOf[WebGLRendererPlugins]
  }
}

