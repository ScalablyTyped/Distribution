package typings.officeUiFabricReact.navTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavStyleProps extends js.Object {
  /**
    * Accept custom classNames
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Inherited from INavProps
    * A collection of link groups to display in the navigation bar
    */
  var groups: js.Array[INavLinkGroup] | Null = js.native
  /**
    * is button
    */
  var isButtonEntry: js.UndefOr[Boolean] = js.native
  /**
    * is element disabled
    */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /**
    * is element expanded boolean
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
    * is element a group boolean
    */
  var isGroup: js.UndefOr[Boolean] = js.native
  /**
    * is element a link boolean
    */
  var isLink: js.UndefOr[Boolean] = js.native
  /**
    * is element on top boolean
    */
  var isOnTop: js.UndefOr[Boolean] = js.native
  /**
    * is element selected boolean
    */
  var isSelected: js.UndefOr[Boolean] = js.native
  /**
    * left padding value
    */
  var leftPadding: js.UndefOr[Double] = js.native
  /**
    * left padding when expanded value
    */
  var leftPaddingExpanded: js.UndefOr[Double] = js.native
  /**
    * Nav height value
    */
  var navHeight: js.UndefOr[Double] = js.native
  /**
    * position value
    */
  var position: js.UndefOr[Double] = js.native
  /**
    * right padding value
    */
  var rightPadding: js.UndefOr[Double] = js.native
  /**
    * Accept theme prop.
    */
  var theme: ITheme = js.native
}

object INavStyleProps {
  @scala.inline
  def apply(theme: ITheme): INavStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavStyleProps]
  }
  @scala.inline
  implicit class INavStylePropsOps[Self <: INavStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: INavLinkGroup*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[INavLinkGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupsNull: Self = this.set("groups", null)
    @scala.inline
    def setIsButtonEntry(value: Boolean): Self = this.set("isButtonEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsButtonEntry: Self = this.set("isButtonEntry", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsExpanded(value: Boolean): Self = this.set("isExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExpanded: Self = this.set("isExpanded", js.undefined)
    @scala.inline
    def setIsGroup(value: Boolean): Self = this.set("isGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGroup: Self = this.set("isGroup", js.undefined)
    @scala.inline
    def setIsLink(value: Boolean): Self = this.set("isLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLink: Self = this.set("isLink", js.undefined)
    @scala.inline
    def setIsOnTop(value: Boolean): Self = this.set("isOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOnTop: Self = this.set("isOnTop", js.undefined)
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelected: Self = this.set("isSelected", js.undefined)
    @scala.inline
    def setLeftPadding(value: Double): Self = this.set("leftPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftPadding: Self = this.set("leftPadding", js.undefined)
    @scala.inline
    def setLeftPaddingExpanded(value: Double): Self = this.set("leftPaddingExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftPaddingExpanded: Self = this.set("leftPaddingExpanded", js.undefined)
    @scala.inline
    def setNavHeight(value: Double): Self = this.set("navHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavHeight: Self = this.set("navHeight", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRightPadding(value: Double): Self = this.set("rightPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightPadding: Self = this.set("rightPadding", js.undefined)
  }
  
}

