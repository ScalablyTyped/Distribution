package typings.officeDashUiDashFabricDashReact

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
object libComponentsIconMod extends js.Object {
  @js.native
  class IconBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotBaseMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  val Icon: StatelessComponent[IIconProps] = js.native
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  def getIconContent(): Anon_Children = js.native
  def getIconContent(iconName: String): Anon_Children = js.native
  @js.native
  object IconType extends js.Object {
    /* 100000 */ val Default: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.Default with Double = js.native
    /* 100001 */ val Image: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.Image with Double = js.native
    /* 0 */ val default: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.default with Double = js.native
    /* 1 */ val image: typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType.image with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IconType with Double
      ] = js.native
  }
  
}

