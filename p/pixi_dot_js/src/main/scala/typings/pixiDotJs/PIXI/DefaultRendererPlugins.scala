package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.accessibility.AccessibilityManager
import typings.pixiDotJs.PIXI.interaction.InteractionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRendererPlugins extends js.Object {
  var accessibility: AccessibilityManager
  var interaction: InteractionManager
}

object DefaultRendererPlugins {
  @scala.inline
  def apply(accessibility: AccessibilityManager, interaction: InteractionManager): DefaultRendererPlugins = {
    val __obj = js.Dynamic.literal(accessibility = accessibility, interaction = interaction)
  
    __obj.asInstanceOf[DefaultRendererPlugins]
  }
}

