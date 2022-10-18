package typings.officeUiFabricReact

import typings.officeUiFabricReact.libUtilitiesKeytipsIkeytiptransitionkeyMod.IKeytipTransitionKey
import typings.officeUiFabricReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfig
import typings.officeUiFabricReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfigItem
import typings.officeUiFabricReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesKeytipsMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  open class KeytipManager ()
    extends typings.officeUiFabricReact.libUtilitiesKeytipsKeytipManagerMod.KeytipManager
  /* static members */
  object KeytipManager {
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips", "KeytipManager._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns Singleton KeytipManager instance
      */
    inline def getInstance(): typings.officeUiFabricReact.libUtilitiesKeytipsKeytipManagerMod.KeytipManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[typings.officeUiFabricReact.libUtilitiesKeytipsKeytipManagerMod.KeytipManager]
  }
  
  inline def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = ^.asInstanceOf[js.Dynamic].applyDynamic("buildKeytipConfigMap")(config.asInstanceOf[js.Any]).asInstanceOf[IKeytipConfigMap]
  
  inline def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("constructKeytip")(configMap.asInstanceOf[js.Any], parentSequence.asInstanceOf[js.Any], keytip.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAriaDescribedBy(keySequences: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAriaDescribedBy")(keySequences.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ktpTargetFromId(keytipId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ktpTargetFromId")(keytipId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ktpTargetFromSequences(keySequences: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ktpTargetFromSequences")(keySequences.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOverflows")(keySequences.asInstanceOf[js.Any], overflowKeySequences.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def sequencesToID(keySequences: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sequencesToID")(keySequences.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionKeysAreEqual")(key1.asInstanceOf[js.Any], key2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("transitionKeysContain")(keys.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
