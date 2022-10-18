package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMessageListMod {
  
  @JSImport("sap/ui/commons/MessageList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageList.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MessageList {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessageListSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageListSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/MessageList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.MessageList with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.MessageList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MessageList
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getAnchorId anchorId}.
      *
      * ID of the anchor under which the MessageList will render.
      *
      * @returns Value of property `anchorId`
      */
    def getAnchorId(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxListed maxListed}.
      *
      * Maximum number of messages being display in the List before a scrollbar appears. Value '0' means no limit.
      *
      * Default value is `'7'`.
      *
      * @returns Value of property `maxListed`
      */
    def getMaxListed(): String = js.native
    
    /**
      * Sets a new value for property {@link #getAnchorId anchorId}.
      *
      * ID of the anchor under which the MessageList will render.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnchorId(): this.type = js.native
    def setAnchorId(/**
      * New value for property `anchorId`
      */
    sAnchorId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxListed maxListed}.
      *
      * Maximum number of messages being display in the List before a scrollbar appears. Value '0' means no limit.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'7'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxListed(): this.type = js.native
    def setMaxListed(/**
      * New value for property `maxListed`
      */
    sMaxListed: String): this.type = js.native
    
    /**
      * Sets the list of Messages to be displayed and re-renders this Control if it is visible.
      */
    def setMessages(/**
      * Message list.
      */
    aMessages: js.Array[typings.openui5.sapUiCommonsMessageMod.default]): Unit = js.native
  }
  
  trait MessageListSettings
    extends StObject
       with ControlSettings {
    
    /**
      * ID of the anchor under which the MessageList will render.
      */
    var anchorId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Maximum number of messages being display in the List before a scrollbar appears. Value '0' means no limit.
      */
    var maxListed: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object MessageListSettings {
    
    inline def apply(): MessageListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageListSettings]
    }
    
    extension [Self <: MessageListSettings](x: Self) {
      
      inline def setAnchorId(value: String | PropertyBindingInfo): Self = StObject.set(x, "anchorId", value.asInstanceOf[js.Any])
      
      inline def setAnchorIdUndefined: Self = StObject.set(x, "anchorId", js.undefined)
      
      inline def setMaxListed(value: String | PropertyBindingInfo): Self = StObject.set(x, "maxListed", value.asInstanceOf[js.Any])
      
      inline def setMaxListedUndefined: Self = StObject.set(x, "maxListed", js.undefined)
    }
  }
}
