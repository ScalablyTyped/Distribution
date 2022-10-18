package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Options
import typings.officeUiFabricReact.libComponentsDropdownDropdownDottypesMod.IDropdownProps
import typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDropdownMod {
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "Dropdown")
  @js.native
  val Dropdown: FunctionComponent[IDropdownProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownBase")
  @js.native
  open class DropdownBase protected ()
    extends typings.officeUiFabricReact.libComponentsDropdownMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  /* static members */
  object DropdownBase {
    
    @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownBase.defaultProps")
    @js.native
    def defaultProps: Options = js.native
    inline def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownMenuItemType")
  @js.native
  object DropdownMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType & Double] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.libUtilitiesSelectableOptionSelectableOptionDottypesMod.SelectableOptionMenuItemType.Normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode & Double
      ] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
}
