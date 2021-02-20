package typings.officeUiFabricReact

import org.scalablytyped.runtime.StringDictionary
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keytipManagerMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipManager", "KeytipManager")
  @js.native
  class KeytipManager () extends StObject {
    
    /**
      * Creates an IUniqueKeytip object
      *
      * @param keytipProps - IKeytipProps
      * @param uniqueID - Unique ID, will default to the next unique ID if not passed
      * @returns IUniqueKeytip object
      */
    var _getUniqueKtp: js.Any = js.native
    
    /**
      * Adds the overflowSetSequence to the keytipProps if its parent keytip also has it
      *
      * @param keytipProps - Keytip props to add overflowSetSequence to if necessary
      * @returns - Modified keytip props, if needed to be modified
      */
    def addParentOverflow(keytipProps: IKeytipProps): IKeytipProps = js.native
    
    var delayUpdatingKeytipChange: Boolean = js.native
    
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
      * @returns All keytips stored in the manager
      */
    def getKeytips(): js.Array[IKeytipProps] = js.native
    
    var inKeytipMode: Boolean = js.native
    
    /**
      * Initialization code to set set parameters to define
      * how the KeytipManager handles keytip data.
      *
      * @param delayUpdatingKeytipChange - T/F if we should delay notifiying keytip subscribers
      * of keytip changes
      */
    def init(delayUpdatingKeytipChange: Boolean): Unit = js.native
    
    var keytips: StringDictionary[IUniqueKeytip] = js.native
    
    /**
      * Public function to bind for overflow items that have a submenu
      */
    def menuExecute(overflowButtonSequences: js.Array[String], keytipSequences: js.Array[String]): Unit = js.native
    
    var persistedKeytips: StringDictionary[IUniqueKeytip] = js.native
    
    /**
      * Registers a keytip
      *
      * @param keytipProps - Keytip to register
      * @param persisted - T/F if this keytip should be persisted, default is false
      * @returns Unique ID for this keytip
      */
    def register(keytipProps: IKeytipProps): String = js.native
    def register(keytipProps: IKeytipProps, persisted: Boolean): String = js.native
    
    var sequenceMapping: StringDictionary[IKeytipProps] = js.native
    
    var shouldEnterKeytipMode: Boolean = js.native
    
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
  object KeytipManager {
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipManager", "KeytipManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipManager", "KeytipManager._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns Singleton KeytipManager instance
      */
    @JSImport("office-ui-fabric-react/lib/utilities/keytips/KeytipManager", "KeytipManager.getInstance")
    @js.native
    def getInstance(): KeytipManager = js.native
  }
  
  @js.native
  trait IUniqueKeytip extends StObject {
    
    var keytip: IKeytipProps = js.native
    
    var uniqueID: String = js.native
  }
  object IUniqueKeytip {
    
    @scala.inline
    def apply(keytip: IKeytipProps, uniqueID: String): IUniqueKeytip = {
      val __obj = js.Dynamic.literal(keytip = keytip.asInstanceOf[js.Any], uniqueID = uniqueID.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUniqueKeytip]
    }
    
    @scala.inline
    implicit class IUniqueKeytipMutableBuilder[Self <: IUniqueKeytip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeytip(value: IKeytipProps): Self = StObject.set(x, "keytip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueID(value: String): Self = StObject.set(x, "uniqueID", value.asInstanceOf[js.Any])
    }
  }
}
