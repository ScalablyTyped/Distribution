package typings.officeUiFabricReact.keytipLayerBaseMod

import typings.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typings.officeUiFabricReact.keytipTreeMod.KeytipTree
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipLayer.base", "KeytipLayerBase")
@js.native
class KeytipLayerBase protected () extends BaseComponent[IKeytipLayerProps, IKeytipLayerState] {
  def this(props: IKeytipLayerProps, context: js.Any) = this()
  var _addKeytipToQueue: js.Any = js.native
  var _classNames: js.Any = js.native
  var _currentSequence: js.Any = js.native
  var _delayedKeytipQueue: js.Any = js.native
  var _delayedQueueTimeout: js.Any = js.native
  /**
    * Enters keytip mode for this layer
    */
  var _enterKeytipMode: js.Any = js.native
  /**
    * Exits keytip mode for this layer
    */
  var _exitKeytipMode: js.Any = js.native
  /**
    * Returns duplicates among keytip IDs
    * If the returned array is empty, no duplicates were found
    *
    * @param keytipIds - Array of keytip IDs to find duplicates for
    * @returns - Array of duplicates that were found. If multiple duplicates were found it will only be added once to this array
    */
  var _getDuplicateIds: js.Any = js.native
  var _getKtpExecuteTarget: js.Any = js.native
  var _getKtpTarget: js.Any = js.native
  /**
    * Gets the ModifierKeyCodes based on the keyboard event
    *
    * @param ev - React.KeyboardEvent
    * @returns List of ModifierKeyCodes that were pressed
    */
  var _getModifierKey: js.Any = js.native
  var _getVisibleKeytips: js.Any = js.native
  /**
    * Returns T/F if the keytipProps keySequences match the currentKeytip, and the currentKeytip is in an overflow well
    * This will make 'keytipProps' the new currentKeytip
    *
    * @param keytipProps - Keytip props to check
    * @returns - T/F if this keytip should become the currentKeytip
    */
  var _isCurrentKeytipAnAlias: js.Any = js.native
  var _keyHandled: js.Any = js.native
  var _keytipManager: js.Any = js.native
  var _keytipTree: js.Any = js.native
  var _newCurrentKeytipSequences: js.UndefOr[js.Any] = js.native
  var _onDismiss: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyPress: js.Any = js.native
  var _onKeytipAdded: js.Any = js.native
  var _onKeytipRemoved: js.Any = js.native
  var _onKeytipUpdated: js.Any = js.native
  var _onPersistedKeytipAdded: js.Any = js.native
  var _onPersistedKeytipExecute: js.Any = js.native
  var _onPersistedKeytipRemoved: js.Any = js.native
  /**
    * Callback function to use for persisted keytips
    *
    * @param overflowButtonSequences - The overflow button sequence to execute
    * @param keytipSequences - The keytip that should become the 'currentKeytip' when it is registered
    */
  var _persistedKeytipExecute: js.Any = js.native
  var _removeKeytipFromQueue: js.Any = js.native
  /**
    * Sets if we are in keytip mode.
    * Note, this sets both the state for the layer as well as
    * the value that the manager will expose externally.
    * @param inKeytipMode - Boolean so set whether we are in keytip mode or not
    */
  var _setInKeytipMode: js.Any = js.native
  /**
    * Sets the keytips state property
    *
    * @param keytipProps - Keytips to set in this layer
    */
  var _setKeytips: js.Any = js.native
  /**
    * Trigger a keytip immediately and set it as the current keytip
    *
    * @param keytipProps - Keytip to trigger immediately
    */
  var _triggerKeytipImmediately: js.Any = js.native
  /**
    * Emits a warning if duplicate keytips are found for the children of the current keytip
    */
  var _warnIfDuplicateKeytips: js.Any = js.native
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
@JSImport("office-ui-fabric-react/lib/components/KeytipLayer/KeytipLayer.base", "KeytipLayerBase")
@js.native
object KeytipLayerBase extends js.Object {
  var defaultProps: IKeytipLayerProps = js.native
}

