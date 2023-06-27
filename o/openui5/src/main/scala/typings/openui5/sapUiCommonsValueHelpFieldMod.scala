package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsTextFieldMod.TextFieldSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsValueHelpFieldMod {
  
  @JSImport("sap/ui/commons/ValueHelpField", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ValueHelpField.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ValueHelpField {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ValueHelpFieldSettings) = this()
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
    mSettings: ValueHelpFieldSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ValueHelpFieldSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ValueHelpField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ValueHelpField with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.TextField.extend}.
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
    oClassInfo: ClassInfo[T, ValueHelpField]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ValueHelpField],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ValueHelpField.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ValueHelpField
    extends typings.openui5.sapUiCommonsTextFieldMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:valueHelpRequest valueHelpRequest} event of
      * this `sap.ui.commons.ValueHelpField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ValueHelpField` itself.
      *
      * Event which is fired when the ValueHelp is requested.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValueHelpRequest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachValueHelpRequest(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ValueHelpField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:valueHelpRequest valueHelpRequest} event of
      * this `sap.ui.commons.ValueHelpField`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ValueHelpField` itself.
      *
      * Event which is fired when the ValueHelp is requested.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValueHelpRequest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachValueHelpRequest(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ValueHelpField` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:valueHelpRequest valueHelpRequest} event of
      * this `sap.ui.commons.ValueHelpField`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachValueHelpRequest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachValueHelpRequest(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:valueHelpRequest valueHelpRequest} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValueHelpRequest(): this.type = js.native
    def fireValueHelpRequest(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getIconDisabledURL iconDisabledURL}.
      *
      * URL of the icon for the value help when disabled. If no parameter is supplied the default icon image
      * will be shown. If an icon font icon is used, this property is ignored.
      *
      * @returns Value of property `iconDisabledURL`
      */
    def getIconDisabledURL(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconHoverURL iconHoverURL}.
      *
      * URL of the icon for the value help when hovered. If no parameter is supplied the standard icon image
      * will be shown. If an icon font icon is used, this property is ignored.
      *
      * @returns Value of property `iconHoverURL`
      */
    def getIconHoverURL(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconURL iconURL}.
      *
      * URL of the standard icon for the value help. If no parameter is supplied the default icon image will
      * be shown. This can be a URI to an image or an icon font URI.
      *
      * @returns Value of property `iconURL`
      */
    def getIconURL(): URI = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Handle F4 event
      */
    def onsapshow(/**
      * the occurring event
      */
    oEvent: Event): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getIconDisabledURL iconDisabledURL}.
      *
      * URL of the icon for the value help when disabled. If no parameter is supplied the default icon image
      * will be shown. If an icon font icon is used, this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDisabledURL(): this.type = js.native
    def setIconDisabledURL(/**
      * New value for property `iconDisabledURL`
      */
    sIconDisabledURL: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconHoverURL iconHoverURL}.
      *
      * URL of the icon for the value help when hovered. If no parameter is supplied the standard icon image
      * will be shown. If an icon font icon is used, this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconHoverURL(): this.type = js.native
    def setIconHoverURL(/**
      * New value for property `iconHoverURL`
      */
    sIconHoverURL: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconURL iconURL}.
      *
      * URL of the standard icon for the value help. If no parameter is supplied the default icon image will
      * be shown. This can be a URI to an image or an icon font URI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconURL(): this.type = js.native
    def setIconURL(/**
      * New value for property `iconURL`
      */
    sIconURL: URI): this.type = js.native
  }
  
  trait ValueHelpField$ValueHelpRequestEventParameters extends StObject
  
  trait ValueHelpFieldSettings
    extends StObject
       with TextFieldSettings {
    
    /**
      * URL of the icon for the value help when disabled. If no parameter is supplied the default icon image
      * will be shown. If an icon font icon is used, this property is ignored.
      */
    var iconDisabledURL: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * URL of the icon for the value help when hovered. If no parameter is supplied the standard icon image
      * will be shown. If an icon font icon is used, this property is ignored.
      */
    var iconHoverURL: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * URL of the standard icon for the value help. If no parameter is supplied the default icon image will
      * be shown. This can be a URI to an image or an icon font URI.
      */
    var iconURL: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Event which is fired when the ValueHelp is requested.
      */
    var valueHelpRequest: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
  }
  object ValueHelpFieldSettings {
    
    inline def apply(): ValueHelpFieldSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueHelpFieldSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueHelpFieldSettings] (val x: Self) extends AnyVal {
      
      inline def setIconDisabledURL(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDisabledURL", value.asInstanceOf[js.Any])
      
      inline def setIconDisabledURLUndefined: Self = StObject.set(x, "iconDisabledURL", js.undefined)
      
      inline def setIconHoverURL(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconHoverURL", value.asInstanceOf[js.Any])
      
      inline def setIconHoverURLUndefined: Self = StObject.set(x, "iconHoverURL", js.undefined)
      
      inline def setIconURL(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconURL", value.asInstanceOf[js.Any])
      
      inline def setIconURLUndefined: Self = StObject.set(x, "iconURL", js.undefined)
      
      inline def setValueHelpRequest(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "valueHelpRequest", js.Any.fromFunction1(value))
      
      inline def setValueHelpRequestUndefined: Self = StObject.set(x, "valueHelpRequest", js.undefined)
    }
  }
  
  type ValueHelpFieldValueHelpRequestEvent = typings.openui5.sapUiBaseEventMod.default[ValueHelpField$ValueHelpRequestEventParameters]
  
  type ValueHelpFieldValueHelpRequestEventParameters = ValueHelpField$ValueHelpRequestEventParameters
}
