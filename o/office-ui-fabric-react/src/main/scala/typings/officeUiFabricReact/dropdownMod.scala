package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.Options
import typings.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "Dropdown")
  @js.native
  val Dropdown: FunctionComponent[IDropdownProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownBase")
  @js.native
  class DropdownBase protected ()
    extends typings.officeUiFabricReact.dropdownBaseMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  /* static members */
  object DropdownBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownBase.defaultProps")
    @js.native
    def defaultProps: Options = js.native
    @scala.inline
    def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "DropdownMenuItemType")
  @js.native
  object DropdownMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType & Double] = js.native
    
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider & Double = js.native
    
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header & Double = js.native
    
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dropdown", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode & Double] = js.native
    
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large & Double = js.native
    
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium & Double = js.native
    
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small & Double = js.native
    
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown & Double = js.native
    
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge & Double = js.native
    
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge & Double = js.native
    
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge & Double = js.native
  }
}
