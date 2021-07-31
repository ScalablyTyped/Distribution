package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIPanelState
import typings.officeUiFabricReact.anon.ReadonlyIPanelProps
import typings.officeUiFabricReact.anon.ReadonlyIPanelState
import typings.officeUiFabricReact.panelTypesMod.IPanelProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelMod {
  
  @JSImport("office-ui-fabric-react/lib/Panel", "Panel")
  @js.native
  val Panel: FunctionComponent[IPanelProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Panel", "PanelBase")
  @js.native
  class PanelBase protected ()
    extends typings.officeUiFabricReact.panelMod.PanelBase {
    def this(props: IPanelProps) = this()
  }
  /* static members */
  object PanelBase {
    
    @JSImport("office-ui-fabric-react/lib/Panel", "PanelBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Panel", "PanelBase.defaultProps")
    @js.native
    def defaultProps: IPanelProps = js.native
    @scala.inline
    def defaultProps_=(x: IPanelProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ReadonlyIPanelProps, prevState: ReadonlyIPanelState): PartialIPanelState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialIPanelState | Null]
  }
  
  @JSImport("office-ui-fabric-react/lib/Panel", "PanelType")
  @js.native
  object PanelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.panelTypesMod.PanelType & Double] = js.native
    
    /* 7 */ val custom: typings.officeUiFabricReact.panelTypesMod.PanelType.custom & Double = js.native
    
    /* 8 */ val customNear: typings.officeUiFabricReact.panelTypesMod.PanelType.customNear & Double = js.native
    
    /* 6 */ val extraLarge: typings.officeUiFabricReact.panelTypesMod.PanelType.extraLarge & Double = js.native
    
    /* 4 */ val large: typings.officeUiFabricReact.panelTypesMod.PanelType.large & Double = js.native
    
    /* 5 */ val largeFixed: typings.officeUiFabricReact.panelTypesMod.PanelType.largeFixed & Double = js.native
    
    /* 3 */ val medium: typings.officeUiFabricReact.panelTypesMod.PanelType.medium & Double = js.native
    
    /* 1 */ val smallFixedFar: typings.officeUiFabricReact.panelTypesMod.PanelType.smallFixedFar & Double = js.native
    
    /* 2 */ val smallFixedNear: typings.officeUiFabricReact.panelTypesMod.PanelType.smallFixedNear & Double = js.native
    
    /* 0 */ val smallFluid: typings.officeUiFabricReact.panelTypesMod.PanelType.smallFluid & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Panel", "PanelVisibilityState")
  @js.native
  object PanelVisibilityState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState & Double] = js.native
    
    /* 3 */ val animatingClosed: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.animatingClosed & Double = js.native
    
    /* 1 */ val animatingOpen: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.animatingOpen & Double = js.native
    
    /* 0 */ val closed: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.closed & Double = js.native
    
    /* 2 */ val open: typings.officeUiFabricReact.panelBaseMod.PanelVisibilityState.open & Double = js.native
  }
}
