package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.officeUiFabricReact.marqueeSelectionTypesMod.IMarqueeSelectionProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typings.officeUiFabricReact.selectionZoneMod.ISelectionZoneState
import typings.react.mod.FunctionComponent
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptions
import typings.uifabricUtilities.selectionSelectionMod.ISelectionOptionsWithRequiredGetKey
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
  class Selection[TItem] protected ()
    extends typings.officeUiFabricReact.selectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: js.Array[js.Any | ISelectionOptions[TItem] | ISelectionOptionsWithRequiredGetKey[TItem]]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionDirection & Double] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.selectionTypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uifabricUtilities.selectionTypesMod.SelectionMode & Double] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.selectionTypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.selectionTypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.selectionTypesMod.SelectionMode.single & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/MarqueeSelection", "SelectionZone")
  @js.native
  class SelectionZone protected ()
    extends typings.officeUiFabricReact.selectionMod.SelectionZone {
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
    @scala.inline
    def defaultProps_=(x: IsSelectedOnFocus): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[ISelectionZoneState]
  }
}
