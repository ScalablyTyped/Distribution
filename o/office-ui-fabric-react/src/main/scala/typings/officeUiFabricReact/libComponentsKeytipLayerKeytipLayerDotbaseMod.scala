package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typings.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayerProps
import typings.officeUiFabricReact.libComponentsKeytipLayerKeytipTreeMod.KeytipTree
import typings.officeUiFabricReact.libUtilitiesKeytipsIkeytiptransitionkeyMod.IKeytipTransitionKey
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsKeytipLayerKeytipLayerDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipLayer.base", "KeytipLayerBase")
  @js.native
  open class KeytipLayerBase protected () extends Component[IKeytipLayerProps, IKeytipLayerState, Any] {
    def this(props: IKeytipLayerProps, context: Any) = this()
    
    /* private */ var _addKeytipToQueue: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _buildTree: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _currentSequence: Any = js.native
    
    /* private */ var _delayedKeytipQueue: Any = js.native
    
    /* private */ var _delayedQueueTimeout: Any = js.native
    
    /**
      * Enters keytip mode for this layer
      */
    /* private */ var _enterKeytipMode: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /**
      * Exits keytip mode for this layer
      */
    /* private */ var _exitKeytipMode: Any = js.native
    
    /**
      * Returns duplicates among keytip IDs.
      * If the returned array is empty, no duplicates were found.
      *
      * @param keytipIds - Array of keytip IDs to find duplicates for
      * @returns - Array of duplicates that were found. Each duplicate will only be added once to this array.
      */
    /* private */ var _getDuplicateIds: Any = js.native
    
    /* private */ var _getKtpExecuteTarget: Any = js.native
    
    /* private */ var _getKtpTarget: Any = js.native
    
    /**
      * Gets the ModifierKeyCodes based on the keyboard event
      *
      * @param ev - React.KeyboardEvent
      * @returns List of ModifierKeyCodes that were pressed
      */
    /* private */ var _getModifierKey: Any = js.native
    
    /* private */ var _getVisibleKeytips: Any = js.native
    
    /**
      * Returns T/F if the keytipProps keySequences match the currentKeytip, and the currentKeytip is in an overflow well
      * This will make 'keytipProps' the new currentKeytip
      *
      * @param keytipProps - Keytip props to check
      * @returns - T/F if this keytip should become the currentKeytip
      */
    /* private */ var _isCurrentKeytipAnAlias: Any = js.native
    
    /* private */ var _keyHandled: Any = js.native
    
    /* private */ var _keytipManager: Any = js.native
    
    /* private */ var _keytipTree: Any = js.native
    
    /* private */ var _newCurrentKeytipSequences: Any = js.native
    
    /* private */ var _onDismiss: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyPress: Any = js.native
    
    /* private */ var _onKeytipAdded: Any = js.native
    
    /* private */ var _onKeytipRemoved: Any = js.native
    
    /* private */ var _onKeytipUpdated: Any = js.native
    
    /* private */ var _onPersistedKeytipAdded: Any = js.native
    
    /* private */ var _onPersistedKeytipExecute: Any = js.native
    
    /* private */ var _onPersistedKeytipRemoved: Any = js.native
    
    /**
      * Helper function to do checks related to persisted/overflow keytips
      * Done on keytip added and keytip updated
      *
      * @param keytipProps - Keytip props
      */
    /* private */ var _persistedKeytipChecks: Any = js.native
    
    /**
      * Callback function to use for persisted keytips
      *
      * @param overflowButtonSequences - The overflow button sequence to execute
      * @param keytipSequences - The keytip that should become the 'currentKeytip' when it is registered
      */
    /* private */ var _persistedKeytipExecute: Any = js.native
    
    /* private */ var _removeKeytipFromQueue: Any = js.native
    
    /**
      * Sets if we are in keytip mode.
      * Note, this sets both the state for the layer as well as
      * the value that the manager will expose externally.
      * @param inKeytipMode - Boolean so set whether we are in keytip mode or not
      */
    /* private */ var _setInKeytipMode: Any = js.native
    
    /**
      * Sets the keytips state property
      *
      * @param keytipProps - Keytips to set in this layer
      */
    /* private */ var _setKeytips: Any = js.native
    
    /**
      * Trigger a keytip immediately and set it as the current keytip
      *
      * @param keytipProps - Keytip to trigger immediately
      */
    /* private */ var _triggerKeytipImmediately: Any = js.native
    
    /**
      * Emits a warning if duplicate keytips are found for the children of the current keytip
      */
    /* private */ var _warnIfDuplicateKeytips: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MKeytipLayerBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MKeytipLayerBase(): Unit = js.native
    
    def getCurrentSequence(): String = js.native
    
    def getKeytipTree(): KeytipTree = js.native
    
    /**
      * Processes inputs from the document listener and traverse the keytip tree
      *
      * @param key - Key pressed by the user
      */
    def processInput(key: String): Unit = js.native
    def processInput(key: String, ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /**
      * Processes an IKeytipTransitionKey entered by the user
      *
      * @param transitionKey - IKeytipTransitionKey received by the layer to process
      */
    def processTransitionInput(transitionKey: IKeytipTransitionKey): Unit = js.native
    def processTransitionInput(transitionKey: IKeytipTransitionKey, ev: KeyboardEvent[HTMLElement]): Unit = js.native
    
    /**
      * Show the given keytips and hide all others
      *
      * @param ids - Keytip IDs to show
      */
    def showKeytips(ids: js.Array[String]): Unit = js.native
  }
  /* static members */
  object KeytipLayerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipLayer.base", "KeytipLayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipLayer.base", "KeytipLayerBase.defaultProps")
    @js.native
    def defaultProps: IKeytipLayerProps = js.native
    inline def defaultProps_=(x: IKeytipLayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IKeytipLayerState extends StObject {
    
    var inKeytipMode: Boolean
    
    var keytips: js.Array[IKeytipProps]
    
    var visibleKeytips: js.Array[IKeytipProps]
  }
  object IKeytipLayerState {
    
    inline def apply(inKeytipMode: Boolean, keytips: js.Array[IKeytipProps], visibleKeytips: js.Array[IKeytipProps]): IKeytipLayerState = {
      val __obj = js.Dynamic.literal(inKeytipMode = inKeytipMode.asInstanceOf[js.Any], keytips = keytips.asInstanceOf[js.Any], visibleKeytips = visibleKeytips.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeytipLayerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IKeytipLayerState] (val x: Self) extends AnyVal {
      
      inline def setInKeytipMode(value: Boolean): Self = StObject.set(x, "inKeytipMode", value.asInstanceOf[js.Any])
      
      inline def setKeytips(value: js.Array[IKeytipProps]): Self = StObject.set(x, "keytips", value.asInstanceOf[js.Any])
      
      inline def setKeytipsVarargs(value: IKeytipProps*): Self = StObject.set(x, "keytips", js.Array(value*))
      
      inline def setVisibleKeytips(value: js.Array[IKeytipProps]): Self = StObject.set(x, "visibleKeytips", value.asInstanceOf[js.Any])
      
      inline def setVisibleKeytipsVarargs(value: IKeytipProps*): Self = StObject.set(x, "visibleKeytips", js.Array(value*))
    }
  }
}
