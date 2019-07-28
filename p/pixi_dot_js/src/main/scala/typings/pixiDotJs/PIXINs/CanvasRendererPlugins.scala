package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.accessibilityNs.AccessibilityManager
import typings.pixiDotJs.PIXINs.extractNs.CanvasExtract
import typings.pixiDotJs.PIXINs.interactionNs.InteractionManager
import typings.pixiDotJs.PIXINs.prepareNs.CanvasPrepare
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

