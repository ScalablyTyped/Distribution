package typings.officeUiFabricReact.navTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavStyles extends js.Object {
  /**
    * Style set for the chevron button inside the composite
    * link and group elements.
    */
  var chevronButton: IStyle
  /**
    * Style set for the chevron icon inside the composite
    * link and group elements.
    */
  var chevronIcon: IStyle
  /**
    * Style set for the composite link container div element
    */
  var compositeLink: IStyle
  /**
    * Style set for the group root div.
    */
  var group: IStyle
  /**
    * Style set for the group content div inside group.
    */
  var groupContent: IStyle
  /**
    * Style set for the link element extending the
    * root style set for ActionButton component.
    */
  var link: IStyle
  /**
    * Style set for the link text container div element.
    */
  var linkText: IStyle
  /**
    * Style set for the nav links li element.
    */
  var navItem: IStyle
  /**
    * Style set for the nav links ul element.
    */
  var navItems: IStyle
  /**
    * Style set for the root element.
    */
  var root: IStyle
}

object INavStyles {
  @scala.inline
  def apply(
    chevronButton: js.UndefOr[Null | IStyle] = js.undefined,
    chevronIcon: js.UndefOr[Null | IStyle] = js.undefined,
    compositeLink: js.UndefOr[Null | IStyle] = js.undefined,
    group: js.UndefOr[Null | IStyle] = js.undefined,
    groupContent: js.UndefOr[Null | IStyle] = js.undefined,
    link: js.UndefOr[Null | IStyle] = js.undefined,
    linkText: js.UndefOr[Null | IStyle] = js.undefined,
    navItem: js.UndefOr[Null | IStyle] = js.undefined,
    navItems: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): INavStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chevronButton)) __obj.updateDynamic("chevronButton")(chevronButton.asInstanceOf[js.Any])
    if (!js.isUndefined(chevronIcon)) __obj.updateDynamic("chevronIcon")(chevronIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(compositeLink)) __obj.updateDynamic("compositeLink")(compositeLink.asInstanceOf[js.Any])
    if (!js.isUndefined(group)) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(groupContent)) __obj.updateDynamic("groupContent")(groupContent.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (!js.isUndefined(linkText)) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (!js.isUndefined(navItem)) __obj.updateDynamic("navItem")(navItem.asInstanceOf[js.Any])
    if (!js.isUndefined(navItems)) __obj.updateDynamic("navItems")(navItems.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavStyles]
  }
}

