package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionEvent extends js.Object {
  var currentTarget: pixiDotJsLib.PIXINs.DisplayObject
  var data: InteractionData
  var stopped: scala.Boolean
  var target: pixiDotJsLib.PIXINs.DisplayObject
  var `type`: java.lang.String
  def reset(): scala.Unit
  def stopPropagation(): scala.Unit
}

object InteractionEvent {
  @scala.inline
  def apply(
    currentTarget: pixiDotJsLib.PIXINs.DisplayObject,
    data: InteractionData,
    reset: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    stopped: scala.Boolean,
    target: pixiDotJsLib.PIXINs.DisplayObject,
    `type`: java.lang.String
  ): InteractionEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("stopped")(stopped)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[InteractionEvent]
  }
}

