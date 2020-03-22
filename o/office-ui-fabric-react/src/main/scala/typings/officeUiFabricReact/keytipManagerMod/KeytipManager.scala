package typings.officeUiFabricReact.keytipManagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipManager", "KeytipManager")
@js.native
class KeytipManager () extends js.Object {
  /**
    * Creates an IUniqueKeytip object
    *
    * @param keytipProps - IKeytipProps
    * @param uniqueID - Unique ID, will default to the next unique ID if not passed
    * @returns {IUniqueKeytip} IUniqueKeytip object
    */
  var _getUniqueKtp: js.Any = js.native
  var delayUpdatingKeytipChange: Boolean = js.native
  var inKeytipMode: Boolean = js.native
  var keytips: StringDictionary[IUniqueKeytip] = js.native
  var persistedKeytips: StringDictionary[IUniqueKeytip] = js.native
  var sequenceMapping: StringDictionary[IKeytipProps] = js.native
  var shouldEnterKeytipMode: Boolean = js.native
  /**
    * Adds the overflowSetSequence to the keytipProps if its parent keytip also has it
    *
    * @param keytipProps - Keytip props to add overflowSetSequence to if necessary
    * @returns {IKeytipProps} - Modified keytip props, if needed to be modified
    */
  def addParentOverflow(keytipProps: IKeytipProps): IKeytipProps = js.native
  /**
    * Manual call to enter keytip mode
    */
  def enterKeytipMode(): Unit = js.native
  /**
    * Manual call to exit keytip mode
    */
  def exitKeytipMode(): Unit = js.native
  /**
    * Gets all IKeytipProps from this.keytips
    *
    * @returns {IKeytipProps[]} All keytips stored in the manager
    */
  def getKeytips(): js.Array[IKeytipProps] = js.native
  /**
    * Initialization code to set set parameters to define
    * how the KeytipManager handles keytip data.
    *
    * @param delayUpdatingKeytipChange - T/F if we should delay notifiying keytip subscribers
    * of keytip changes
    */
  def init(delayUpdatingKeytipChange: Boolean): Unit = js.native
  /**
    * Public function to bind for overflow items that have a submenu
    *
    * @param overflowButtonSequences
    * @param keytipSequences
    */
  def menuExecute(overflowButtonSequences: js.Array[String], keytipSequences: js.Array[String]): Unit = js.native
  /**
    * Registers a keytip
    *
    * @param keytipProps - Keytip to register
    * @param persisted - T/F if this keytip should be persisted, default is false
    * @returns {string} Unique ID for this keytip
    */
  def register(keytipProps: IKeytipProps): String = js.native
  def register(keytipProps: IKeytipProps, persisted: Boolean): String = js.native
  /**
    * Unregisters a keytip
    *
    * @param keytipToRemove - IKeytipProps of the keytip to remove
    * @param uniqueID - Unique ID of this keytip
    * @param persisted - T/F if this keytip should be persisted, default is false
    */
  def unregister(keytipToRemove: IKeytipProps, uniqueID: String): Unit = js.native
  def unregister(keytipToRemove: IKeytipProps, uniqueID: String, persisted: Boolean): Unit = js.native
  /**
    * Update a keytip
    *
    * @param keytipProps - Keytip to update
    * @param uniqueID - Unique ID of this keytip
    */
  def update(keytipProps: IKeytipProps, uniqueID: String): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipManager", "KeytipManager")
@js.native
object KeytipManager extends js.Object {
  var _instance: js.Any = js.native
  /**
    * Static function to get singleton KeytipManager instance
    *
    * @returns {KeytipManager} Singleton KeytipManager instance
    */
  def getInstance(): KeytipManager = js.native
}

