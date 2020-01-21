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
    addButton: IStyle = null,
    descriptiveOverflowButton: IStyle = null,
    itemButton: IStyle = null,
    itemContainer: IStyle = null,
    member: IStyle = null,
    members: IStyle = null,
    overflowButton: IStyle = null,
    overflowInitialsIcon: IStyle = null,
    root: IStyle = null,
    screenReaderOnly: IStyle = null
  ): IFacepileStyles = {
    val __obj = js.Dynamic.literal()
    if (addButton != null) __obj.updateDynamic("addButton")(addButton.asInstanceOf[js.Any])
    if (descriptiveOverflowButton != null) __obj.updateDynamic("descriptiveOverflowButton")(descriptiveOverflowButton.asInstanceOf[js.Any])
    if (itemButton != null) __obj.updateDynamic("itemButton")(itemButton.asInstanceOf[js.Any])
    if (itemContainer != null) __obj.updateDynamic("itemContainer")(itemContainer.asInstanceOf[js.Any])
    if (member != null) __obj.updateDynamic("member")(member.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (overflowButton != null) __obj.updateDynamic("overflowButton")(overflowButton.asInstanceOf[js.Any])
    if (overflowInitialsIcon != null) __obj.updateDynamic("overflowInitialsIcon")(overflowInitialsIcon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (screenReaderOnly != null) __obj.updateDynamic("screenReaderOnly")(screenReaderOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileStyles]
  }
}

