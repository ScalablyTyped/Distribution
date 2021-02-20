package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIPanelState
import typings.officeUiFabricReact.anon.ReadonlyIPanelProps
import typings.officeUiFabricReact.anon.ReadonlyIPanelState
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Panel", "Panel")
  @js.native
  val Panel: FunctionComponent[IPanelProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Panel", "PanelBase")
  @js.native
  class PanelBase protected ()
    extends typings.officeUiFabricReact.panelBaseMod.PanelBase {
    def this(props: IPanelProps) = this()
  }
  /* static members */
  object PanelBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Panel", "PanelBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Panel", "PanelBase.defaultProps")
    @js.native
    def defaultProps: IPanelProps = js.native
    @scala.inline
    def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Panel", "PanelBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Panel", "PanelType")
  @js.native
  object PanelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.panelTypesMod.PanelType with Double] = js.native
    
    /* 7 */ val custom: typings.officeUiFabricReact.panelTypesMod.PanelType.custom with Double = js.native
    
    /* 8 */ val customNear: typings.officeUiFabricReact.panelTypesMod.PanelType.customNear with Double = js.native
    
    /* 6 */ val extraLarge: typings.officeUiFabricReact.panelTypesMod.PanelType.extraLarge with Double = js.native
    
    /* 4 */ val large: typings.officeUiFabricReact.panelTypesMod.PanelType.large with Double = js.native
    
    /* 5 */ val largeFixed: typings.officeUiFabricReact.panelTypesMod.PanelType.largeFixed with Double = js.native
    
    /* 3 */ val medium: typings.officeUiFabricReact.panelTypesMod.PanelType.medium with Double = js.native
    
    /* 1 */ val smallFixedFar: typings.officeUiFabricReact.panelTypesMod.PanelType.smallFixedFar with Double = js.native
    
    /* 2 */ val smallFixedNear: typings.officeUiFabricReact.panelTypesMod.PanelType.smallFixedNear with Double = js.native
    
    /* 0 */ val smallFluid: typings.officeUiFabricReact.panelTypesMod.PanelType.smallFluid with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Panel", "PanelVisibilityState")
  @js.native
  object PanelVisibilityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState with Double] = js.native
    
    /* 3 */ val animatingClosed: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.animatingClosed with Double = js.native
    
    /* 1 */ val animatingOpen: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.animatingOpen with Double = js.native
    
    /* 0 */ val closed: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.closed with Double = js.native
    
    /* 2 */ val open: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.open with Double = js.native
  }
}
