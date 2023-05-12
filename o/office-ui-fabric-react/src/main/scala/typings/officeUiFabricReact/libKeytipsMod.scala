package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.IKeytipDataProps
import typings.officeUiFabricReact.libComponentsKeytipDataKeytipDataDottypesMod.KeytipDataOptions
import typings.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import typings.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayerProps
import typings.officeUiFabricReact.libUtilitiesKeytipsIkeytiptransitionkeyMod.IKeytipTransitionKey
import typings.officeUiFabricReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfig
import typings.officeUiFabricReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfigItem
import typings.officeUiFabricReact.libUtilitiesKeytipsKeytipConfigMod.IKeytipConfigMap
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.uifabricUtilities.libIrendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeytipsMod {
  
  @JSImport("office-ui-fabric-react/lib/Keytips", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "DATAKTP_ARIA_TARGET")
  @js.native
  val DATAKTP_ARIA_TARGET: /* "data-ktp-aria-target" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "DATAKTP_EXECUTE_TARGET")
  @js.native
  val DATAKTP_EXECUTE_TARGET: /* "data-ktp-execute-target" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "DATAKTP_TARGET")
  @js.native
  val DATAKTP_TARGET: /* "data-ktp-target" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KTP_ARIA_SEPARATOR")
  @js.native
  val KTP_ARIA_SEPARATOR: /* ", " */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KTP_FULL_PREFIX")
  @js.native
  val KTP_FULL_PREFIX: String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KTP_LAYER_ID")
  @js.native
  val KTP_LAYER_ID: /* "ktp-layer-id" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KTP_PREFIX")
  @js.native
  val KTP_PREFIX: /* "ktp" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KTP_SEPARATOR")
  @js.native
  val KTP_SEPARATOR: /* "-" */ String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "Keytip")
  @js.native
  open class Keytip protected ()
    extends typings.officeUiFabricReact.libComponentsKeytipMod.Keytip {
    def this(props: IKeytipProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: IKeytipProps, context: Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipData")
  @js.native
  val KeytipData: FunctionComponent[IKeytipDataProps & IRenderComponent[js.Object]] = js.native
  
  object KeytipEvents {
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.ENTER_KEYTIP_MODE")
    @js.native
    val ENTER_KEYTIP_MODE: /* "enterKeytipMode" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.EXIT_KEYTIP_MODE")
    @js.native
    val EXIT_KEYTIP_MODE: /* "exitKeytipMode" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.KEYTIP_ADDED")
    @js.native
    val KEYTIP_ADDED: /* "keytipAdded" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.KEYTIP_REMOVED")
    @js.native
    val KEYTIP_REMOVED: /* "keytipRemoved" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.KEYTIP_UPDATED")
    @js.native
    val KEYTIP_UPDATED: /* "keytipUpdated" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.PERSISTED_KEYTIP_ADDED")
    @js.native
    val PERSISTED_KEYTIP_ADDED: /* "persistedKeytipAdded" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.PERSISTED_KEYTIP_EXECUTE")
    @js.native
    val PERSISTED_KEYTIP_EXECUTE: /* "persistedKeytipExecute" */ String = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipEvents.PERSISTED_KEYTIP_REMOVED")
    @js.native
    val PERSISTED_KEYTIP_REMOVED: /* "persistedKeytipRemoved" */ String = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipLayer")
  @js.native
  val KeytipLayer: FunctionComponent[IKeytipLayerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipLayerBase")
  @js.native
  open class KeytipLayerBase protected ()
    extends typings.officeUiFabricReact.libComponentsKeytipLayerMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: Any) = this()
  }
  /* static members */
  object KeytipLayerBase {
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipLayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipLayerBase.defaultProps")
    @js.native
    def defaultProps: IKeytipLayerProps = js.native
    inline def defaultProps_=(x: IKeytipLayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager")
  @js.native
  open class KeytipManager ()
    extends typings.officeUiFabricReact.libUtilitiesKeytipsMod.KeytipManager
  /* static members */
  object KeytipManager {
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager._instance")
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
  
  inline def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeytipRef")(options.asInstanceOf[js.Any]).asInstanceOf[Ref[TElement]]
}
