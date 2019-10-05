package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.accessibility.AccessibilityManager
import typings.pixiDotJs.PIXI.extract.CanvasExtract
import typings.pixiDotJs.PIXI.interaction.InteractionManager
import typings.pixiDotJs.PIXI.prepare.CanvasPrepare
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRendererPlugins
  extends DefaultCanvasRendererPlugins
     with DefaultRendererPlugins

object CanvasRendererPlugins {
  @scala.inline
  def apply(
    accessibility: AccessibilityManager,
    extract: CanvasExtract,
    interaction: InteractionManager,
    prepare: CanvasPrepare
  ): CanvasRendererPlugins = {
    val __obj = js.Dynamic.literal(accessibility = accessibility, extract = extract, interaction = interaction, prepare = prepare)
  
    __obj.asInstanceOf[CanvasRendererPlugins]
  }
}

