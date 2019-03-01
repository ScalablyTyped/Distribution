package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRendererPlugins
  extends DefaultCanvasRendererPlugins
     with DefaultRendererPlugins

object CanvasRendererPlugins {
  @scala.inline
  def apply(
    accessibility: pixiDotJsLib.PIXINs.accessibilityNs.AccessibilityManager,
    extract: pixiDotJsLib.PIXINs.extractNs.CanvasExtract,
    interaction: pixiDotJsLib.PIXINs.interactionNs.InteractionManager,
    prepare: pixiDotJsLib.PIXINs.prepareNs.CanvasPrepare
  ): CanvasRendererPlugins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessibility")(accessibility)
    __obj.updateDynamic("extract")(extract)
    __obj.updateDynamic("interaction")(interaction)
    __obj.updateDynamic("prepare")(prepare)
    __obj.asInstanceOf[CanvasRendererPlugins]
  }
}

