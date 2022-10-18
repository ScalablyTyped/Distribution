package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.MessageType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMessageMod {
  
  @JSImport("sap/ui/commons/Message", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Message.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Message {
    def this(/**
      * initial settings for the new control
      */
    mSettings: MessageSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: MessageSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: MessageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Message", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Message with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Message]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Message],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Message.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Message
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Registers a callback function to be invoked if long text Details are to be made available.
      *
      * This callback function will be supplied the corresponding Message "id", and should return the (simple)
      * HTML string to be displayed within the Message Details Dialog.
      *
      * E.g.: myMessage.bindDetails(getDetails); function getDetails(sId) {... return htmlString;}
      */
    def bindDetails(/**
      * the callback function
      */
    fnCallBack: js.Function): Unit = js.native
    
    /**
      * Gets current value of property {@link #getAssociatedElementId associatedElementId}.
      *
      * Associated UI element ID. (Optional) For navigation to error field.
      *
      * @returns Value of property `associatedElementId`
      */
    def getAssociatedElementId(): String = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Internal attribute, used to force the display of the "short" or the "long" text only.
      *
      * @returns Value of property `design`
      */
    def getDesign(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Message short text. (Mandatory)
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * "Success", or "Warning", or "Error" messages. (Mandatory)
      *
      * @returns Value of property `type`
      */
    def getType(): MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getAssociatedElementId associatedElementId}.
      *
      * Associated UI element ID. (Optional) For navigation to error field.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAssociatedElementId(): this.type = js.native
    def setAssociatedElementId(/**
      * New value for property `associatedElementId`
      */
    sAssociatedElementId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Internal attribute, used to force the display of the "short" or the "long" text only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Message short text. (Mandatory)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * "Success", or "Warning", or "Error" messages. (Mandatory)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: MessageType): this.type = js.native
  }
  
  trait MessageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Associated UI element ID. (Optional) For navigation to error field.
      */
    var associatedElementId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Internal attribute, used to force the display of the "short" or the "long" text only.
      */
    var design: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Message short text. (Mandatory)
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * "Success", or "Warning", or "Error" messages. (Mandatory)
      */
    var `type`: js.UndefOr[
        MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object MessageSettings {
    
    inline def apply(): MessageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageSettings]
    }
    
    extension [Self <: MessageSettings](x: Self) {
      
      inline def setAssociatedElementId(value: String | PropertyBindingInfo): Self = StObject.set(x, "associatedElementId", value.asInstanceOf[js.Any])
      
      inline def setAssociatedElementIdUndefined: Self = StObject.set(x, "associatedElementId", js.undefined)
      
      inline def setDesign(value: String | PropertyBindingInfo): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
