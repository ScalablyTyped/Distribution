package typings.openui5

import typings.openui5.anon.DomRef_
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMObjectAttributeMod {
  
  @JSImport("sap/m/ObjectAttribute", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectAttribute`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectAttribute {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectAttributeSettings) = this()
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
    mSettings: ObjectAttributeSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectAttributeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ObjectAttribute", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ObjectAttribute with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ObjectAttribute]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectAttribute],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ObjectAttribute.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectAttribute
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ObjectAttribute`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectAttribute` itself.
      *
      * Fires when the user clicks on active text.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectAttribute` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ObjectAttribute`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ObjectAttribute` itself.
      *
      * Fires when the user clicks on active text.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ObjectAttribute` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the customContent in the aggregation {@link #getCustomContent customContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.ObjectAttribute`.
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
    mParameters: DomRef_): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActive active}.
      *
      * Indicates if the `ObjectAttribute` text is selectable for the user.
      *
      * **Note:** As of version 1.48, only the value of the `text` property becomes active (styled and acts like
      * a link) as opposed to both the `title` and `text` in the previous versions. If you set this property
      * to `true`, you have to also set the `text` property. **Note:** When `active` property is set to `true`,
      * and the text direction of the `title` or the `text` does not match the text direction of the application,
      * the `textDirection` property should be set to ensure correct display.
      *
      * @returns Value of property `active`
      */
    def getActive(): Boolean = js.native
    
    /**
      * @SINCE 1.97.0
      *
      * Gets current value of property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when an `sap.m.ObjectAttribute` instance is active and related to a popover/popup.
      * The value needs to be equal to the main/root role of the popup - e.g. dialog, menu or list (examples:
      * if you have dialog -> dialog, if you have menu -> menu; if you have list -> list; if you have dialog
      * containing a list -> dialog). Do not use it, if you open a standard sap.m.Dialog, MessageBox or other
      * type of modal dialogs.
      *
      * Default value is `None`.
      *
      * @returns Value of property `ariaHasPopup`
      */
    def getAriaHasPopup(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getCustomContent customContent}.
      *
      * When the aggregation is set, it replaces the `text`, `active` and `textDirection` properties. This also
      * ignores the press event. The provided control is displayed as an active link in case it is a sap.m.Link.
      * **Note:** It will only allow sap.m.Text and sap.m.Link controls.
      */
    def getCustomContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Defines to which DOM reference the Popup should be docked.
      *
      * @returns The DOM reference that Popup should dock to
      */
    def getPopupAnchorDomRef(): Element = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the ObjectAttribute text.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Determines the direction of the text. Available options for the text direction are LTR (left-to-right),
      * RTL (right-to-left), or Inherit. By default the control inherits the text direction from its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the ObjectAttribute title.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Sets a new value for property {@link #getActive active}.
      *
      * Indicates if the `ObjectAttribute` text is selectable for the user.
      *
      * **Note:** As of version 1.48, only the value of the `text` property becomes active (styled and acts like
      * a link) as opposed to both the `title` and `text` in the previous versions. If you set this property
      * to `true`, you have to also set the `text` property. **Note:** When `active` property is set to `true`,
      * and the text direction of the `title` or the `text` does not match the text direction of the application,
      * the `textDirection` property should be set to ensure correct display.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActive(): this.type = js.native
    def setActive(/**
      * New value for property `active`
      */
    bActive: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.97.0
      *
      * Sets a new value for property {@link #getAriaHasPopup ariaHasPopup}.
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when an `sap.m.ObjectAttribute` instance is active and related to a popover/popup.
      * The value needs to be equal to the main/root role of the popup - e.g. dialog, menu or list (examples:
      * if you have dialog -> dialog, if you have menu -> menu; if you have list -> list; if you have dialog
      * containing a list -> dialog). Do not use it, if you open a standard sap.m.Dialog, MessageBox or other
      * type of modal dialogs.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaHasPopup(): this.type = js.native
    def setAriaHasPopup(
      /**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String
    ): this.type = js.native
    def setAriaHasPopup(/**
      * New value for property `ariaHasPopup`
      */
    sAriaHasPopup: HasPopup): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getCustomContent customContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomContent(/**
      * The customContent to set
      */
    oCustomContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the ObjectAttribute text.
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
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Determines the direction of the text. Available options for the text direction are LTR (left-to-right),
      * RTL (right-to-left), or Inherit. By default the control inherits the text direction from its parent control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the ObjectAttribute title.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait ObjectAttributeSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Indicates if the `ObjectAttribute` text is selectable for the user.
      *
      * **Note:** As of version 1.48, only the value of the `text` property becomes active (styled and acts like
      * a link) as opposed to both the `title` and `text` in the previous versions. If you set this property
      * to `true`, you have to also set the `text` property. **Note:** When `active` property is set to `true`,
      * and the text direction of the `title` or the `text` does not match the text direction of the application,
      * the `textDirection` property should be set to ensure correct display.
      */
    var active: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.97.0
      *
      * Specifies the value of the `aria-haspopup` attribute
      *
      * If the value is `None`, the attribute will not be rendered. Otherwise it will be rendered with the selected
      * value.
      *
      * NOTE: Use this property only when an `sap.m.ObjectAttribute` instance is active and related to a popover/popup.
      * The value needs to be equal to the main/root role of the popup - e.g. dialog, menu or list (examples:
      * if you have dialog -> dialog, if you have menu -> menu; if you have list -> list; if you have dialog
      * containing a list -> dialog). Do not use it, if you open a standard sap.m.Dialog, MessageBox or other
      * type of modal dialogs.
      */
    var ariaHasPopup: js.UndefOr[
        HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * When the aggregation is set, it replaces the `text`, `active` and `textDirection` properties. This also
      * ignores the press event. The provided control is displayed as an active link in case it is a sap.m.Link.
      * **Note:** It will only allow sap.m.Text and sap.m.Link controls.
      */
    var customContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Fires when the user clicks on active text.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the ObjectAttribute text.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the direction of the text. Available options for the text direction are LTR (left-to-right),
      * RTL (right-to-left), or Inherit. By default the control inherits the text direction from its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the ObjectAttribute title.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ObjectAttributeSettings {
    
    inline def apply(): ObjectAttributeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectAttributeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectAttributeSettings] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAriaHasPopup(
        value: HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setCustomContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "customContent", value.asInstanceOf[js.Any])
      
      inline def setCustomContentUndefined: Self = StObject.set(x, "customContent", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
