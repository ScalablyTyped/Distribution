package typings.officeUiFabricReact.coachmarkBasicExampleMod

import typings.officeUiFabricReact.directionalHintMod.DirectionalHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmarkBasicExampleState extends js.Object {
  var coachmarkPosition: DirectionalHint
  var dropdownSelectedOptionKey: String | Double
  var isCoachmarkVisible: js.UndefOr[Boolean] = js.undefined
}

object ICoachmarkBasicExampleState {
  @scala.inline
  def apply(
    coachmarkPosition: DirectionalHint,
    dropdownSelectedOptionKey: String | Double,
    isCoachmarkVisible: js.UndefOr[Boolean] = js.undefined
  ): ICoachmarkBasicExampleState = {
    val __obj = js.Dynamic.literal(coachmarkPosition = coachmarkPosition.asInstanceOf[js.Any], dropdownSelectedOptionKey = dropdownSelectedOptionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isCoachmarkVisible)) __obj.updateDynamic("isCoachmarkVisible")(isCoachmarkVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkBasicExampleState]
  }
}

