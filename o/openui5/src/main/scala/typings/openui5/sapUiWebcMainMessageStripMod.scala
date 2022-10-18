package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.IIcon
import typings.openui5.sapUiWebcMainLibraryMod.MessageStripDesign
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainMessageStripMod {
  
  @JSImport("sap/ui/webc/main/MessageStrip", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MessageStrip`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
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
    
    @JSImport("sap/ui/webc/main/MessageStrip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.MessageStrip with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
      * Returns a metadata object for class sap.ui.webc.main.MessageStrip.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait MessageStrip
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.webc.main.MessageStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MessageStrip` itself.
      *
      * Fired when the close button is pressed either with a click/tap or by using the Enter or Space key.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MessageStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.webc.main.MessageStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.MessageStrip` itself.
      *
      * Fired when the close button is pressed either with a click/tap or by using the Enter or Space key.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.MessageStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the icon in the aggregation {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIcon(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.webc.main.MessageStrip`.
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
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the component type.
      *
      *  **Note:** Available options are `"Information"`, `"Positive"`, `"Negative"`, and `"Warning"`.
      *
      * Default value is `Information`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): MessageStripDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageStripDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHideCloseButton hideCloseButton}.
      *
      * Defines whether the MessageStrip renders close button.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideCloseButton`
      */
    def getHideCloseButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHideIcon hideIcon}.
      *
      * Defines whether the MessageStrip will show an icon in the beginning. You can directly provide an icon
      * with the `icon` slot. Otherwise, the default icon for the type will be used.
      *
      * Default value is `false`.
      *
      * @returns Value of property `hideIcon`
      */
    def getHideIcon(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getIcon icon}.
      *
      * Defines the content to be displayed as graphical element within the component.
      *
      *  **Note:** If no icon is given, the default icon for the component type will be used. The SAP-icons font
      * provides numerous options.
      *
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    def getIcon(): IIcon = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the component type.
      *
      *  **Note:** Available options are `"Information"`, `"Positive"`, `"Negative"`, and `"Warning"`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Information`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageStripDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: MessageStripDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideCloseButton hideCloseButton}.
      *
      * Defines whether the MessageStrip renders close button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideCloseButton(): this.type = js.native
    def setHideCloseButton(/**
      * New value for property `hideCloseButton`
      */
    bHideCloseButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHideIcon hideIcon}.
      *
      * Defines whether the MessageStrip will show an icon in the beginning. You can directly provide an icon
      * with the `icon` slot. Otherwise, the default icon for the type will be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHideIcon(): this.type = js.native
    def setHideIcon(/**
      * New value for property `hideIcon`
      */
    bHideIcon: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * The icon to set
      */
    oIcon: IIcon): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait MessageStripSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the close button is pressed either with a click/tap or by using the Enter or Space key.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the component type.
      *
      *  **Note:** Available options are `"Information"`, `"Positive"`, `"Negative"`, and `"Warning"`.
      */
    var design: js.UndefOr[
        MessageStripDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageStripDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the MessageStrip renders close button.
      */
    var hideCloseButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines whether the MessageStrip will show an icon in the beginning. You can directly provide an icon
      * with the `icon` slot. Otherwise, the default icon for the type will be used.
      */
    var hideIcon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content to be displayed as graphical element within the component.
      *
      *  **Note:** If no icon is given, the default icon for the component type will be used. The SAP-icons font
      * provides numerous options.
      *
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    var icon: js.UndefOr[IIcon] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MessageStripSettings {
    
    inline def apply(): MessageStripSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStripSettings]
    }
    
    extension [Self <: MessageStripSettings](x: Self) {
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDesign(
        value: MessageStripDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageStripDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideCloseButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHideCloseButtonUndefined: Self = StObject.set(x, "hideCloseButton", js.undefined)
      
      inline def setHideIcon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hideIcon", value.asInstanceOf[js.Any])
      
      inline def setHideIconUndefined: Self = StObject.set(x, "hideIcon", js.undefined)
      
      inline def setIcon(value: IIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
