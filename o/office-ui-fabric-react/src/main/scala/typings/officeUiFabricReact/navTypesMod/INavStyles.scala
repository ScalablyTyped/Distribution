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
    chevronButton: IStyle = null,
    chevronIcon: IStyle = null,
    compositeLink: IStyle = null,
    group: IStyle = null,
    groupContent: IStyle = null,
    link: IStyle = null,
    linkText: IStyle = null,
    navItem: IStyle = null,
    navItems: IStyle = null,
    root: IStyle = null
  ): INavStyles = {
    val __obj = js.Dynamic.literal()
    if (chevronButton != null) __obj.updateDynamic("chevronButton")(chevronButton.asInstanceOf[js.Any])
    if (chevronIcon != null) __obj.updateDynamic("chevronIcon")(chevronIcon.asInstanceOf[js.Any])
    if (compositeLink != null) __obj.updateDynamic("compositeLink")(compositeLink.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupContent != null) __obj.updateDynamic("groupContent")(groupContent.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (linkText != null) __obj.updateDynamic("linkText")(linkText.asInstanceOf[js.Any])
    if (navItem != null) __obj.updateDynamic("navItem")(navItem.asInstanceOf[js.Any])
    if (navItems != null) __obj.updateDynamic("navItems")(navItems.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavStyles]
  }
}

