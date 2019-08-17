package typings.officeDashUiDashFabricDashReact.libComponentsIconMod

import typings.officeDashUiDashFabricDashReact.Anon_Children
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IFontIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IImageIconProps
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Icon", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  val Icon: StatelessComponent[IIconProps] = js.native
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  def getIconContent(): Anon_Children = js.native
  def getIconContent(iconName: String): Anon_Children = js.native
}

