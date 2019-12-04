package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.IKeytipTransitionKey
import typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfig
import typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfigItem
import typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfigMap
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`, `
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`-`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-ktp-execute-target`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-ktp-target`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`ktp-layer-id`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.enterKeytipMode
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.exitKeytipMode
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.keytipAdded
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.keytipRemoved
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.keytipUpdated
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.ktp
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.persistedKeytipAdded
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.persistedKeytipExecute
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.persistedKeytipRemoved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/keytips", JSImport.Namespace)
@js.native
object libUtilitiesKeytipsMod extends js.Object {
  @js.native
  class KeytipManager ()
    extends typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsKeytipManagerMod.KeytipManager
  
  val DATAKTP_EXECUTE_TARGET: `data-ktp-execute-target` = js.native
  val DATAKTP_TARGET: `data-ktp-target` = js.native
  val KTP_ARIA_SEPARATOR: `, ` = js.native
  val KTP_FULL_PREFIX: String = js.native
  val KTP_LAYER_ID: `ktp-layer-id` = js.native
  val KTP_PREFIX: ktp = js.native
  val KTP_SEPARATOR: `-` = js.native
  def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = js.native
  def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = js.native
  def getAriaDescribedBy(keySequences: js.Array[String]): String = js.native
  def ktpTargetFromId(keytipId: String): String = js.native
  def ktpTargetFromSequences(keySequences: js.Array[String]): String = js.native
  def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = js.native
  def sequencesToID(keySequences: js.Array[String]): String = js.native
  def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = js.native
  def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = js.native
  @js.native
  object KeytipEvents extends js.Object {
    val ENTER_KEYTIP_MODE: enterKeytipMode = js.native
    val EXIT_KEYTIP_MODE: exitKeytipMode = js.native
    val KEYTIP_ADDED: keytipAdded = js.native
    val KEYTIP_REMOVED: keytipRemoved = js.native
    val KEYTIP_UPDATED: keytipUpdated = js.native
    val PERSISTED_KEYTIP_ADDED: persistedKeytipAdded = js.native
    val PERSISTED_KEYTIP_EXECUTE: persistedKeytipExecute = js.native
    val PERSISTED_KEYTIP_REMOVED: persistedKeytipRemoved = js.native
  }
  
  /* static members */
  @js.native
  object KeytipManager extends js.Object {
    var _instance: js.Any = js.native
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns {KeytipManager} Singleton KeytipManager instance
      */
    def getInstance(): typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsKeytipManagerMod.KeytipManager = js.native
  }
  
  @js.native
  object KeytipTransitionModifier extends js.Object {
    /* 2 */ val alt: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.alt with Double = js.native
    /* 1 */ val ctrl: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.ctrl with Double = js.native
    /* 3 */ val meta: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.meta with Double = js.native
    /* 0 */ val shift: typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier.shift with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.officeDashUiDashFabricDashReact.libUtilitiesKeytipsIKeytipTransitionKeyMod.KeytipTransitionModifier with Double
      ] = js.native
  }
  
}

