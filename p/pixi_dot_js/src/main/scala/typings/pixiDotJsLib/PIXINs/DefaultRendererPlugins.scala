package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultRendererPlugins extends js.Object {
  var accessibility: pixiDotJsLib.PIXINs.accessibilityNs.AccessibilityManager
  var interaction: pixiDotJsLib.PIXINs.interactionNs.InteractionManager
}

object DefaultRendererPlugins {
  @scala.inline
  def apply(
    accessibility: pixiDotJsLib.PIXINs.accessibilityNs.AccessibilityManager,
    interaction: pixiDotJsLib.PIXINs.interactionNs.InteractionManager
  ): DefaultRendererPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessibility")(accessibility)
    __obj.updateDynamic("interaction")(interaction)
    __obj.asInstanceOf[DefaultRendererPlugins]
  }
}

