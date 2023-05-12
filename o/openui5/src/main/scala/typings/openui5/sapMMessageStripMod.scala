package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.MessageType
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMMessageStripMod {
  
  @JSImport("sap/m/MessageStrip", JSImport.Default)
  @js.native
  /**
    * Constructor for a new MessageStrip.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/message-strip/ Message Strip}
    */
  open class default () extends MessageStrip {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MessageStripSettings) = this()
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
    mSettings: MessageStripSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MessageStripSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/MessageStrip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.MessageStrip with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MessageStrip]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MessageStrip],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.MessageStrip.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MessageStrip
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.MessageStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageStrip` itself.
      *
      * This event will be fired after the container is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.MessageStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.MessageStrip` itself.
      *
      * This event will be fired after the container is closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.MessageStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the MessageStrip. This method sets the visible property of the MessageStrip to false. The MessageStrip
      * can be shown again by setting the visible property to true.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys the link in the aggregation {@link #getLink link}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLink(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.m.MessageStrip`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getCustomIcon customIcon}.
      *
      * Determines a custom icon which is displayed. If none is set, the default icon for this message type is
      * used.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `customIcon`
      */
    def getCustomIcon(): URI = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets current value of property {@link #getEnableFormattedText enableFormattedText}.
      *
      * Determines the limited collection of HTML elements passed to the `text` property should be evaluated.
      *
      * **Note:** If this property is set to true the string passed to `text` property can evaluate the following
      * list of limited HTML elements. All other HTML elements and their nested content will not be rendered
      * by the control:
      * 	 - `a`
      * 	 - `br`
      * 	 - `em`
      * 	 - `strong`
      * 	 - `u`
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableFormattedText`
      */
    def getEnableFormattedText(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getLink link}.
      *
      * Adds an sap.m.Link control which will be displayed at the end of the message.
      */
    def getLink(): typings.openui5.sapMLinkMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowCloseButton showCloseButton}.
      *
      * Determines if the message has a close button in the upper right corner.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showCloseButton`
      */
    def getShowCloseButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowIcon showIcon}.
      *
      * Determines if an icon is displayed for the message.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showIcon`
      */
    def getShowIcon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Determines the text of the message.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Determines the type of messages that are displayed in the MessageStrip. Possible values are: Information
      * (default), Success, Warning, Error. If None is passed, the value is set to Information and a warning
      * is displayed in the console.
      *
      * Default value is `Information`.
      *
      * @returns Value of property `type`
      */
    def getType(): MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getCustomIcon customIcon}.
      *
      * Determines a custom icon which is displayed. If none is set, the default icon for this message type is
      * used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomIcon(): this.type = js.native
    def setCustomIcon(/**
      * New value for property `customIcon`
      */
    sCustomIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.50
      *
      * Sets a new value for property {@link #getEnableFormattedText enableFormattedText}.
      *
      * Determines the limited collection of HTML elements passed to the `text` property should be evaluated.
      *
      * **Note:** If this property is set to true the string passed to `text` property can evaluate the following
      * list of limited HTML elements. All other HTML elements and their nested content will not be rendered
      * by the control:
      * 	 - `a`
      * 	 - `br`
      * 	 - `em`
      * 	 - `strong`
      * 	 - `u`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFormattedText(): this.type = js.native
    def setEnableFormattedText(/**
      * New value for property `enableFormattedText`
      */
    bEnableFormattedText: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getLink link}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLink(/**
      * The link to set
      */
    oLink: typings.openui5.sapMLinkMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCloseButton showCloseButton}.
      *
      * Determines if the message has a close button in the upper right corner.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCloseButton(): this.type = js.native
    def setShowCloseButton(/**
      * New value for property `showCloseButton`
      */
    bShowCloseButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowIcon showIcon}.
      *
      * Determines if an icon is displayed for the message.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowIcon(): this.type = js.native
    def setShowIcon(/**
      * New value for property `showIcon`
      */
    bShowIcon: Boolean): this.type = js.native
    
    /**
      * Setter for property text. Default value is empty/undefined
      *
      * @returns this to allow method chaining
      */
    def setText(/**
      * new value for property text
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Determines the type of messages that are displayed in the MessageStrip. Possible values are: Information
      * (default), Success, Warning, Error. If None is passed, the value is set to Information and a warning
      * is displayed in the console.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Information`.
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
  
  trait MessageStripSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event will be fired after the container is closed.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines a custom icon which is displayed. If none is set, the default icon for this message type is
      * used.
      */
    var customIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * Determines the limited collection of HTML elements passed to the `text` property should be evaluated.
      *
      * **Note:** If this property is set to true the string passed to `text` property can evaluate the following
      * list of limited HTML elements. All other HTML elements and their nested content will not be rendered
      * by the control:
      * 	 - `a`
      * 	 - `br`
      * 	 - `em`
      * 	 - `strong`
      * 	 - `u`
      */
    var enableFormattedText: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Adds an sap.m.Link control which will be displayed at the end of the message.
      */
    var link: js.UndefOr[typings.openui5.sapMLinkMod.default] = js.undefined
    
    /**
      * Determines if the message has a close button in the upper right corner.
      */
    var showCloseButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if an icon is displayed for the message.
      */
    var showIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the text of the message.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the type of messages that are displayed in the MessageStrip. Possible values are: Information
      * (default), Success, Warning, Error. If None is passed, the value is set to Information and a warning
      * is displayed in the console.
      */
    var `type`: js.UndefOr[
        MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object MessageStripSettings {
    
    inline def apply(): MessageStripSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStripSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageStripSettings] (val x: Self) extends AnyVal {
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setCustomIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
      
      inline def setEnableFormattedText(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFormattedText", value.asInstanceOf[js.Any])
      
      inline def setEnableFormattedTextUndefined: Self = StObject.set(x, "enableFormattedText", js.undefined)
      
      inline def setLink(value: typings.openui5.sapMLinkMod.default): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setShowCloseButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setShowIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: MessageType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
