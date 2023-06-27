package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.MessageType
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreMessageMod {
  
  @JSImport("sap/ui/core/Message", JSImport.Default)
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
    
    @JSImport("sap/ui/core/Message", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compares two given messages with each other.
      *
      * The types of {@link sap.ui.core.MessageType} are ordered from "Error" > "Warning" > "Success" > "Information"
      * > "None".
      *
      * @returns returns `0` if both messages are at the same level. `-1` if `this` message has a lower level.
      * `1` if `this` message has a higher level.
      */
    inline def compareByType(
      /**
      * first message to compare
      */
    oMessage1: Message,
      /**
      * second message to compare
      */
    oMessage2: Message
    ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByType")(oMessage1.asInstanceOf[js.Any], oMessage2.asInstanceOf[js.Any])).asInstanceOf[int]
    
    /**
      * Creates a new subclass of class sap.ui.core.Message with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
      * Returns a metadata object for class sap.ui.core.Message.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Message
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Compares the given message with `this` message. The types of {@link sap.ui.core.MessageType} are ordered
      * from "Error" > "Warning" > "Success" > "Information" > "None".
      *
      * See {@link sap.ui.core.Message.compareByType}
      *
      * @returns returns `0` if both messages are at the same level. `-1` if `this` message has a lower level.
      * `1` if `this` message has a higher level.
      */
    def compareByType(/**
      * message to compare with this one
      */
    oOther: Message): int = js.native
    
    /**
      * Returns the icon's default URI depending on given size.
      *
      * @returns URI of the default icon.
      */
    def getDefaultIcon(): URI = js.native
    def getDefaultIcon(
      /**
      * Only the values "16x16" or "32x32" are allowed. Otherwise the default value is used.
      */
    sSize: String
    ): URI = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * A possible icon URI of the message
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getLevel level}.
      *
      * Setting the message's level.
      *
      * Default value is `None`.
      *
      * @returns Value of property `level`
      */
    def getLevel(): MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) = js.native
    
    /**
      * @since 1.19.0
      *
      * Gets current value of property {@link #getReadOnly readOnly}.
      *
      * Determines whether the message should be read only. This helps the application to handle a message a
      * different way if the application differentiates between read-only and common messages.
      *
      * Default value is `false`.
      *
      * @returns Value of property `readOnly`
      */
    def getReadOnly(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Message text
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTimestamp timestamp}.
      *
      * Message's timestamp. It is just a simple String that will be used without any transformation. So the
      * application that uses messages needs to format the timestamp to its own needs.
      *
      * @returns Value of property `timestamp`
      */
    def getTimestamp(): String = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * A possible icon URI of the message
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLevel level}.
      *
      * Setting the message's level.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLevel(): this.type = js.native
    def setLevel(
      /**
      * New value for property `level`
      */
    sLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): this.type = js.native
    def setLevel(/**
      * New value for property `level`
      */
    sLevel: MessageType): this.type = js.native
    
    /**
      * @since 1.19.0
      *
      * Sets a new value for property {@link #getReadOnly readOnly}.
      *
      * Determines whether the message should be read only. This helps the application to handle a message a
      * different way if the application differentiates between read-only and common messages.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setReadOnly(): this.type = js.native
    def setReadOnly(/**
      * New value for property `readOnly`
      */
    bReadOnly: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Message text
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
      * Sets a new value for property {@link #getTimestamp timestamp}.
      *
      * Message's timestamp. It is just a simple String that will be used without any transformation. So the
      * application that uses messages needs to format the timestamp to its own needs.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTimestamp(): this.type = js.native
    def setTimestamp(/**
      * New value for property `timestamp`
      */
    sTimestamp: String): this.type = js.native
  }
  
  trait MessageSettings
    extends StObject
       with ElementSettings {
    
    /**
      * A possible icon URI of the message
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Setting the message's level.
      */
    var level: js.UndefOr[
        MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.19.0
      *
      * Determines whether the message should be read only. This helps the application to handle a message a
      * different way if the application differentiates between read-only and common messages.
      */
    var readOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Message text
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Message's timestamp. It is just a simple String that will be used without any transformation. So the
      * application that uses messages needs to format the timestamp to its own needs.
      */
    var timestamp: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object MessageSettings {
    
    inline def apply(): MessageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageSettings] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLevel(
        value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setReadOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTimestamp(value: String | PropertyBindingInfo): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}
