package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemStyleProps
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemStyles
import typings.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod.IVerticalDividerClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.classNames", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getItemClassNames(
    theme: ITheme,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    itemClassName: js.UndefOr[String],
    dividerClassName: js.UndefOr[String],
    iconClassName: js.UndefOr[String],
    subMenuClassName: js.UndefOr[String],
    primaryDisabled: js.UndefOr[Boolean],
    className: js.UndefOr[String]
  ): IContextualMenuItemStyles = js.native
  def getItemStyles(props: IContextualMenuItemStyleProps): IContextualMenuItemStyles = js.native
  def getSplitButtonVerticalDividerClassNames(theme: ITheme): IVerticalDividerClassNames = js.native
}

