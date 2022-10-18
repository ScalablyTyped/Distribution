package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.libComponentsMarqueeSelectionMarqueeSelectionDottypesMod.IMarqueeSelectionProps
import typings.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.libUtilitiesSelectionSelectionZoneMod.ISelectionZoneState
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMarqueeSelectionMod {
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "MarqueeSelection")
  @js.native
  val MarqueeSelection: FunctionComponent[IMarqueeSelectionProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "Selection")
  @js.native
  open class Selection[TItem] protected ()
    extends typings.officeUiFabricReact.libUtilitiesSelectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: /* import warning: importer.ImportType#apply Failed type conversion: TItem extends @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.types.IObjectWithKey ? [] | [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>] : [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptionsWithRequiredGetKey<TItem>] */ js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection & Double
      ] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode & Double
      ] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.single & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionZone")
  @js.native
  open class SelectionZone protected ()
    extends typings.officeUiFabricReact.libUtilitiesSelectionMod.SelectionZone {
    def this(props: ISelectionZoneProps) = this()
  }
  /* static members */
  object SelectionZone {
    
    @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionZone")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionZone.defaultProps")
    @js.native
    def defaultProps: IsSelectedOnFocus = js.native
    inline def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
  }
}
