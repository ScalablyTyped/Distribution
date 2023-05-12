package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.Size
import typings.openui5.sapMLibraryMod.ValueColor
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFeedContentMod {
  
  @JSImport("sap/m/FeedContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new sap.m.FeedContent control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FeedContent {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FeedContentSettings) = this()
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
    mSettings: FeedContentSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FeedContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FeedContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FeedContent with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, FeedContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FeedContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FeedContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FeedContent
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.FeedContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedContent` itself.
      *
      * The event is triggered when the feed content is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FeedContent` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.FeedContent`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FeedContent` itself.
      *
      * The event is triggered when the feed content is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.FeedContent` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.FeedContent`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContentText contentText}.
      *
      * The content text.
      *
      * @returns Value of property `contentText`
      */
    def getContentText(): String = js.native
    
    /**
      * @deprecated (since 1.38.0) - The FeedContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Gets current value of property {@link #getSize size}.
      *
      * Updates the size of the chart. If not set then the default size is applied based on the device tile.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `size`
      */
    def getSize(): Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSubheader subheader}.
      *
      * The subheader.
      *
      * @returns Value of property `subheader`
      */
    def getSubheader(): String = js.native
    
    /**
      * Gets current value of property {@link #getTruncateValueTo truncateValueTo}.
      *
      * The number of characters to display for the value property.
      *
      * Default value is `4`.
      *
      * @returns Value of property `truncateValueTo`
      */
    def getTruncateValueTo(): int = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * The actual value.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getValueColor valueColor}.
      *
      * The semantic color of the value.
      *
      * @returns Value of property `valueColor`
      */
    def getValueColor(): ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getContentText contentText}.
      *
      * The content text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentText(): this.type = js.native
    def setContentText(/**
      * New value for property `contentText`
      */
    sContentText: String): this.type = js.native
    
    /**
      * @deprecated (since 1.38.0) - The FeedContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Sets a new value for property {@link #getSize size}.
      *
      * Updates the size of the chart. If not set then the default size is applied based on the device tile.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(
      /**
      * New value for property `size`
      */
    sSize: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String
    ): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: Size): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubheader subheader}.
      *
      * The subheader.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubheader(): this.type = js.native
    def setSubheader(/**
      * New value for property `subheader`
      */
    sSubheader: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTruncateValueTo truncateValueTo}.
      *
      * The number of characters to display for the value property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `4`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTruncateValueTo(): this.type = js.native
    def setTruncateValueTo(/**
      * New value for property `truncateValueTo`
      */
    iTruncateValueTo: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * The actual value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValueColor valueColor}.
      *
      * The semantic color of the value.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueColor(): this.type = js.native
    def setValueColor(
      /**
      * New value for property `valueColor`
      */
    sValueColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String
    ): this.type = js.native
    def setValueColor(/**
      * New value for property `valueColor`
      */
    sValueColor: ValueColor): this.type = js.native
  }
  
  trait FeedContentSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The content text.
      */
    var contentText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The event is triggered when the feed content is pressed.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.38.0) - The FeedContent control has now a fixed size, depending on the used media
      * (desktop, tablet or phone).
      *
      * Updates the size of the chart. If not set then the default size is applied based on the device tile.
      */
    var size: js.UndefOr[
        Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The subheader.
      */
    var subheader: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The number of characters to display for the value property.
      */
    var truncateValueTo: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The actual value.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The semantic color of the value.
      */
    var valueColor: js.UndefOr[
        ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object FeedContentSettings {
    
    inline def apply(): FeedContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedContentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeedContentSettings] (val x: Self) extends AnyVal {
      
      inline def setContentText(value: String | PropertyBindingInfo): Self = StObject.set(x, "contentText", value.asInstanceOf[js.Any])
      
      inline def setContentTextUndefined: Self = StObject.set(x, "contentText", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setSize(
        value: Size | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Size * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubheader(value: String | PropertyBindingInfo): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      inline def setTruncateValueTo(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "truncateValueTo", value.asInstanceOf[js.Any])
      
      inline def setTruncateValueToUndefined: Self = StObject.set(x, "truncateValueTo", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueColor(
        value: ValueColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueColor", value.asInstanceOf[js.Any])
      
      inline def setValueColorUndefined: Self = StObject.set(x, "valueColor", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
