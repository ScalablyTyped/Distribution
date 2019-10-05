package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.accessibility.AccessibilityManager
import typings.pixiDotJs.PIXI.extract.WebGLExtract
import typings.pixiDotJs.PIXI.interaction.InteractionManager
import typings.pixiDotJs.PIXI.prepare.WebGLPrepare
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

