package typings.officeUiFabricReact

import typings.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typings.officeUiFabricReact.keytipConfigMod.IKeytipConfig
import typings.officeUiFabricReact.keytipConfigMod.IKeytipConfigItem
import typings.officeUiFabricReact.keytipConfigMod.IKeytipConfigMap
import typings.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typings.officeUiFabricReact.keytipDataTypesMod.KeytipDataOptions
import typings.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.react.mod.FunctionComponent
import typings.react.mod.Ref
import typings.std.HTMLElement
import typings.uifabricUtilities.irendercomponentMod.IRenderComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKeytipsMod {
  
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
  class Keytip protected ()
    extends typings.officeUiFabricReact.keytipMod.Keytip {
    def this(props: IKeytipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IKeytipProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipData")
  @js.native
  val KeytipData: FunctionComponent[IKeytipDataProps with IRenderComponent[js.Object]] = js.native
  
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
  class KeytipLayerBase protected ()
    extends typings.officeUiFabricReact.keytipLayerMod.KeytipLayerBase {
    def this(props: IKeytipLayerProps, context: js.Any) = this()
  }
  /* static members */
  object KeytipLayerBase {
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipLayerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipLayerBase.defaultProps")
    @js.native
    def defaultProps: IKeytipLayerProps = js.native
    @scala.inline
    def defaultProps_=(x: IKeytipLayerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager")
  @js.native
  class KeytipManager ()
    extends typings.officeUiFabricReact.keytipsMod.KeytipManager
  /* static members */
  object KeytipManager {
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns Singleton KeytipManager instance
      */
    @JSImport("office-ui-fabric-react/lib/Keytips", "KeytipManager.getInstance")
    @js.native
    def getInstance(): typings.officeUiFabricReact.keytipManagerMod.KeytipManager = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "buildKeytipConfigMap")
  @js.native
  def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "constructKeytip")
  @js.native
  def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "getAriaDescribedBy")
  @js.native
  def getAriaDescribedBy(keySequences: js.Array[String]): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "ktpTargetFromId")
  @js.native
  def ktpTargetFromId(keytipId: String): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "ktpTargetFromSequences")
  @js.native
  def ktpTargetFromSequences(keySequences: js.Array[String]): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "mergeOverflows")
  @js.native
  def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "sequencesToID")
  @js.native
  def sequencesToID(keySequences: js.Array[String]): String = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "transitionKeysAreEqual")
  @js.native
  def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "transitionKeysContain")
  @js.native
  def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/Keytips", "useKeytipRef")
  @js.native
  def useKeytipRef[TElement /* <: HTMLElement */](options: KeytipDataOptions): Ref[TElement] = js.native
}
