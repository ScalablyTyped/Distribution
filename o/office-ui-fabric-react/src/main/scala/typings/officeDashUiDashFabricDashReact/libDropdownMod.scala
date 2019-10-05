package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsDropdownDropdownDotTypesMod.IDropdownProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Dropdown", JSImport.Namespace)
@js.native
object libDropdownMod extends js.Object {
  @js.native
  class DropdownBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsDropdownMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  
  val Dropdown: StatelessComponent[IDropdownProps] = js.native
  /* static members */
  @js.native
  object DropdownBase extends js.Object {
    var defaultProps: Anon_Options = js.native
  }
  
  @js.native
  object DropdownMenuItemType extends js.Object {
    /* 1 */ val Divider: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableOptionDotTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
  }
  
}

