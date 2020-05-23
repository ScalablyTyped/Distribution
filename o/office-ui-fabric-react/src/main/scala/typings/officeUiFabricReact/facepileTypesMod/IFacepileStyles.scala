package typings.officeUiFabricReact.facepileTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFacepileStyles extends js.Object {
  var addButton: IStyle
  var descriptiveOverflowButton: IStyle
  var itemButton: IStyle
  var itemContainer: IStyle
  var member: IStyle
  var members: IStyle
  var overflowButton: IStyle
  var overflowInitialsIcon: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
  var screenReaderOnly: IStyle
}

object IFacepileStyles {
  @scala.inline
  def apply(
    addButton: js.UndefOr[Null | IStyle] = js.undefined,
    descriptiveOverflowButton: js.UndefOr[Null | IStyle] = js.undefined,
    itemButton: js.UndefOr[Null | IStyle] = js.undefined,
    itemContainer: js.UndefOr[Null | IStyle] = js.undefined,
    member: js.UndefOr[Null | IStyle] = js.undefined,
    members: js.UndefOr[Null | IStyle] = js.undefined,
    overflowButton: js.UndefOr[Null | IStyle] = js.undefined,
    overflowInitialsIcon: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    screenReaderOnly: js.UndefOr[Null | IStyle] = js.undefined
  ): IFacepileStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addButton)) __obj.updateDynamic("addButton")(addButton.asInstanceOf[js.Any])
    if (!js.isUndefined(descriptiveOverflowButton)) __obj.updateDynamic("descriptiveOverflowButton")(descriptiveOverflowButton.asInstanceOf[js.Any])
    if (!js.isUndefined(itemButton)) __obj.updateDynamic("itemButton")(itemButton.asInstanceOf[js.Any])
    if (!js.isUndefined(itemContainer)) __obj.updateDynamic("itemContainer")(itemContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(member)) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (!js.isUndefined(members)) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowButton)) __obj.updateDynamic("overflowButton")(overflowButton.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowInitialsIcon)) __obj.updateDynamic("overflowInitialsIcon")(overflowInitialsIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(screenReaderOnly)) __obj.updateDynamic("screenReaderOnly")(screenReaderOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileStyles]
  }
}

