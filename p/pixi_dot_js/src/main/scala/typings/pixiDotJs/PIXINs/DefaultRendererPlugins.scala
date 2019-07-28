package typings.pixiDotJs.PIXINs

import typings.pixiDotJs.PIXINs.accessibilityNs.AccessibilityManager
import typings.pixiDotJs.PIXINs.interactionNs.InteractionManager
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

