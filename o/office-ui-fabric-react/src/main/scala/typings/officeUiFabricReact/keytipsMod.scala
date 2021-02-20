package typings.officeUiFabricReact

import typings.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typings.officeUiFabricReact.keytipConfigMod.IKeytipConfig
import typings.officeUiFabricReact.keytipConfigMod.IKeytipConfigItem
import typings.officeUiFabricReact.keytipConfigMod.IKeytipConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipsMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "DATAKTP_ARIA_TARGET")
  @js.native
  val DATAKTP_ARIA_TARGET: /* "data-ktp-aria-target" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "DATAKTP_EXECUTE_TARGET")
  @js.native
  val DATAKTP_EXECUTE_TARGET: /* "data-ktp-execute-target" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "DATAKTP_TARGET")
  @js.native
  val DATAKTP_TARGET: /* "data-ktp-target" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KTP_ARIA_SEPARATOR")
  @js.native
  val KTP_ARIA_SEPARATOR: /* ", " */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KTP_FULL_PREFIX")
  @js.native
  val KTP_FULL_PREFIX: String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KTP_LAYER_ID")
  @js.native
  val KTP_LAYER_ID: /* "ktp-layer-id" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KTP_PREFIX")
  @js.native
  val KTP_PREFIX: /* "ktp" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KTP_SEPARATOR")
  @js.native
  val KTP_SEPARATOR: /* "-" */ String = js.native
  
  object KeytipEvents {
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.ENTER_KEYTIP_MODE")
    @js.native
    val ENTER_KEYTIP_MODE: /* "enterKeytipMode" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.EXIT_KEYTIP_MODE")
    @js.native
    val EXIT_KEYTIP_MODE: /* "exitKeytipMode" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.KEYTIP_ADDED")
    @js.native
    val KEYTIP_ADDED: /* "keytipAdded" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.KEYTIP_REMOVED")
    @js.native
    val KEYTIP_REMOVED: /* "keytipRemoved" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.KEYTIP_UPDATED")
    @js.native
    val KEYTIP_UPDATED: /* "keytipUpdated" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.PERSISTED_KEYTIP_ADDED")
    @js.native
    val PERSISTED_KEYTIP_ADDED: /* "persistedKeytipAdded" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.PERSISTED_KEYTIP_EXECUTE")
    @js.native
    val PERSISTED_KEYTIP_EXECUTE: /* "persistedKeytipExecute" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipEvents.PERSISTED_KEYTIP_REMOVED")
    @js.native
    val PERSISTED_KEYTIP_REMOVED: /* "persistedKeytipRemoved" */ String = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipManager")
  @js.native
  class KeytipManager ()
    extends typings.officeUiFabricReact.keytipManagerMod.KeytipManager
  /* static members */
  object KeytipManager {
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipManager._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns Singleton KeytipManager instance
      */
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipManager.getInstance")
    @js.native
    def getInstance(): typings.officeUiFabricReact.keytipManagerMod.KeytipManager = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "buildKeytipConfigMap")
  @js.native
  def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "constructKeytip")
  @js.native
  def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "getAriaDescribedBy")
  @js.native
  def getAriaDescribedBy(keySequences: js.Array[String]): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "ktpTargetFromId")
  @js.native
  def ktpTargetFromId(keytipId: String): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "ktpTargetFromSequences")
  @js.native
  def ktpTargetFromSequences(keySequences: js.Array[String]): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "mergeOverflows")
  @js.native
  def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "sequencesToID")
  @js.native
  def sequencesToID(keySequences: js.Array[String]): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "transitionKeysAreEqual")
  @js.native
  def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", "transitionKeysContain")
  @js.native
  def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = js.native
}
