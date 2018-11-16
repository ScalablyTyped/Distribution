package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionNs {
  type InteractionEventTypes = InteractionPointerEvents | InteractionTouchEvents | InteractionMouseEvents | InteractionPixiEvents
  type InteractionMouseEvents = pixiDotJsLib.pixiDotJsLibStrings.rightdown | pixiDotJsLib.pixiDotJsLibStrings.mousedown | pixiDotJsLib.pixiDotJsLibStrings.rightup | pixiDotJsLib.pixiDotJsLibStrings.mouseup | pixiDotJsLib.pixiDotJsLibStrings.rightclick | pixiDotJsLib.pixiDotJsLibStrings.click | pixiDotJsLib.pixiDotJsLibStrings.rightupoutside | pixiDotJsLib.pixiDotJsLibStrings.mouseupoutside | pixiDotJsLib.pixiDotJsLibStrings.mousemove | pixiDotJsLib.pixiDotJsLibStrings.mouseover | pixiDotJsLib.pixiDotJsLibStrings.mouseout
  type InteractionPixiEvents = pixiDotJsLib.pixiDotJsLibStrings.added | pixiDotJsLib.pixiDotJsLibStrings.removed
  type InteractionPointerEvents = pixiDotJsLib.pixiDotJsLibStrings.pointerdown | pixiDotJsLib.pixiDotJsLibStrings.pointercancel | pixiDotJsLib.pixiDotJsLibStrings.pointerup | pixiDotJsLib.pixiDotJsLibStrings.pointertap | pixiDotJsLib.pixiDotJsLibStrings.pointerupoutside | pixiDotJsLib.pixiDotJsLibStrings.pointermove | pixiDotJsLib.pixiDotJsLibStrings.pointerover | pixiDotJsLib.pixiDotJsLibStrings.pointerout
  type InteractionTouchEvents = pixiDotJsLib.pixiDotJsLibStrings.touchstart | pixiDotJsLib.pixiDotJsLibStrings.touchcancel | pixiDotJsLib.pixiDotJsLibStrings.touchend | pixiDotJsLib.pixiDotJsLibStrings.touchendoutside | pixiDotJsLib.pixiDotJsLibStrings.touchmove | pixiDotJsLib.pixiDotJsLibStrings.tap
}
