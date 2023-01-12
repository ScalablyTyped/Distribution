package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMessageBarMod {
  
  @JSImport("sap/ui/commons/MessageBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MessageBar {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessageBarSettings) = this()
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
    mSettings: MessageBarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/MessageBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.MessageBar with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, MessageBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.MessageBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MessageBar
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds/updates a supplied list of messages. The MessageBar will appear if at least one message exists.
      */
    def addMessages(
      /**
      * Array of messages.
      */
    aAMessages: js.Array[typings.openui5.sapUiCommonsMessageMod.default]
    ): Unit = js.native
    
    /**
      * Deletes all messages.
      *
      * @returns `this` to allow method chaining
      */
    def deleteAllMessages(): this.type = js.native
    
    /**
      * Deletes a supplied list of messages. The MessageBar will disappear when no message remains.
      */
    def deleteMessages(/**
      * Messages IDs to be deleted.
      */
    aIds: js.Array[String]): Unit = js.native
    
    /**
      * Gets current value of property {@link #getAnchorID anchorID}.
      *
      * Element ID upon which the MessageBar will be initially positioned.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `anchorID`
      */
    def getAnchorID(): String = js.native
    
    /**
      * Gets current value of property {@link #getAnchorSnapPoint anchorSnapPoint}.
      *
      * Type: sap.ui.core.Popup.Dock SnapPoint of MessageBar over anchorId. Note: Use "begin" or "end" for RTL
      * support. Note: "center" is not indicated, as positioning is only set once, either via the css "left"
      * or the "right" attribute. Therefore a MessageBar will only be extended in one direction, as Messages
      * come in.
      *
      * Default value is `"begin top"`.
      *
      * @returns Value of property `anchorSnapPoint`
      */
    def getAnchorSnapPoint(): String = js.native
    
    /**
      * Gets current value of property {@link #getMaxListed maxListed}.
      *
      * Maximum number of messages being displayed in the List before a scrollbar appears. Value '0' means no
      * limit.
      *
      * Default value is `7`.
      *
      * @returns Value of property `maxListed`
      */
    def getMaxListed(): int = js.native
    
    /**
      * Gets current value of property {@link #getMaxToasted maxToasted}.
      *
      * Maximum number of simultaneous messages being toasted in a row. Value '0' means this dynamic part is
      * switched off.
      *
      * Default value is `3`.
      *
      * @returns Value of property `maxToasted`
      */
    def getMaxToasted(): int = js.native
    
    /**
      * Sets a new value for property {@link #getAnchorID anchorID}.
      *
      * Element ID upon which the MessageBar will be initially positioned.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnchorID(): this.type = js.native
    def setAnchorID(/**
      * New value for property `anchorID`
      */
    sAnchorID: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAnchorSnapPoint anchorSnapPoint}.
      *
      * Type: sap.ui.core.Popup.Dock SnapPoint of MessageBar over anchorId. Note: Use "begin" or "end" for RTL
      * support. Note: "center" is not indicated, as positioning is only set once, either via the css "left"
      * or the "right" attribute. Therefore a MessageBar will only be extended in one direction, as Messages
      * come in.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"begin top"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnchorSnapPoint(): this.type = js.native
    def setAnchorSnapPoint(/**
      * New value for property `anchorSnapPoint`
      */
    sAnchorSnapPoint: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxListed maxListed}.
      *
      * Maximum number of messages being displayed in the List before a scrollbar appears. Value '0' means no
      * limit.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `7`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxListed(): this.type = js.native
    def setMaxListed(/**
      * New value for property `maxListed`
      */
    iMaxListed: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxToasted maxToasted}.
      *
      * Maximum number of simultaneous messages being toasted in a row. Value '0' means this dynamic part is
      * switched off.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `3`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxToasted(): this.type = js.native
    def setMaxToasted(/**
      * New value for property `maxToasted`
      */
    iMaxToasted: int): this.type = js.native
  }
  
  trait MessageBarSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Element ID upon which the MessageBar will be initially positioned.
      */
    var anchorID: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Type: sap.ui.core.Popup.Dock SnapPoint of MessageBar over anchorId. Note: Use "begin" or "end" for RTL
      * support. Note: "center" is not indicated, as positioning is only set once, either via the css "left"
      * or the "right" attribute. Therefore a MessageBar will only be extended in one direction, as Messages
      * come in.
      */
    var anchorSnapPoint: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Maximum number of messages being displayed in the List before a scrollbar appears. Value '0' means no
      * limit.
      */
    var maxListed: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Maximum number of simultaneous messages being toasted in a row. Value '0' means this dynamic part is
      * switched off.
      */
    var maxToasted: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object MessageBarSettings {
    
    inline def apply(): MessageBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageBarSettings] (val x: Self) extends AnyVal {
      
      inline def setAnchorID(value: String | PropertyBindingInfo): Self = StObject.set(x, "anchorID", value.asInstanceOf[js.Any])
      
      inline def setAnchorIDUndefined: Self = StObject.set(x, "anchorID", js.undefined)
      
      inline def setAnchorSnapPoint(value: String | PropertyBindingInfo): Self = StObject.set(x, "anchorSnapPoint", value.asInstanceOf[js.Any])
      
      inline def setAnchorSnapPointUndefined: Self = StObject.set(x, "anchorSnapPoint", js.undefined)
      
      inline def setMaxListed(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxListed", value.asInstanceOf[js.Any])
      
      inline def setMaxListedUndefined: Self = StObject.set(x, "maxListed", js.undefined)
      
      inline def setMaxToasted(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxToasted", value.asInstanceOf[js.Any])
      
      inline def setMaxToastedUndefined: Self = StObject.set(x, "maxToasted", js.undefined)
    }
  }
}
