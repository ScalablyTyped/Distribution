package typings.officeDashUiDashFabricDashReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod

import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaProps
import typings.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExtendedPersonaProps extends IPersonaProps {
  var blockRecipientRemoval: js.UndefOr[Boolean] = js.undefined
  var canExpand: js.UndefOr[Boolean] = js.undefined
  var isEditing: js.UndefOr[Boolean] = js.undefined
  var isValid: Boolean
  var key: js.UndefOr[Key] = js.undefined
  var shouldBlockSelection: js.UndefOr[Boolean] = js.undefined
}

object IExtendedPersonaProps {
  @scala.inline
  def apply(
    isValid: Boolean,
    IPersonaProps: IPersonaProps = null,
    blockRecipientRemoval: js.UndefOr[Boolean] = js.undefined,
    canExpand: js.UndefOr[Boolean] = js.undefined,
    isEditing: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    shouldBlockSelection: js.UndefOr[Boolean] = js.undefined
  ): IExtendedPersonaProps = {
    val __obj = js.Dynamic.literal(isValid = isValid)
    js.Dynamic.global.Object.assign(__obj, IPersonaProps)
    if (!js.isUndefined(blockRecipientRemoval)) __obj.updateDynamic("blockRecipientRemoval")(blockRecipientRemoval)
    if (!js.isUndefined(canExpand)) __obj.updateDynamic("canExpand")(canExpand)
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldBlockSelection)) __obj.updateDynamic("shouldBlockSelection")(shouldBlockSelection)
    __obj.asInstanceOf[IExtendedPersonaProps]
  }
}

