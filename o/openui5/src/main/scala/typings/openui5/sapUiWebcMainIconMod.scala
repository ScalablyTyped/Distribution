package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.IIcon
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainIconMod {
  
  @JSImport("sap/ui/webc/main/Icon", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Icon`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Icon {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IconSettings) = this()
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
    mSettings: IconSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IconSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_IIcon: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Icon with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Icon]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Icon],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Icon.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Icon
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IIcon {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.Icon`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Icon` itself.
      *
      * Fired when the user clicks the control
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Icon` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.main.Icon`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Icon` itself.
      *
      * Fired when the user clicks the control
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClick(
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
    def attachClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Icon` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.main.Icon`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachClick(
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
      * Fires event {@link #event:click click} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClick(): this.type = js.native
    def fireClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the text alternative of the component. If not provided a default text alternative will be set,
      * if present.
      *
      *  **Note:** Every icon should have a text alternative in order to calculate its accessible name.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * Defines the accessibility role of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): String = js.native
    
    /**
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Defines the background color of the control
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): CSSColor = js.native
    
    /**
      * Gets current value of property {@link #getColor color}.
      *
      * Defines the color of the control
      *
      * @returns Value of property `color`
      */
    def getColor(): CSSColor = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getInteractive interactive}.
      *
      * Defines if the icon is interactive (focusable and pressable)
      *
      * Default value is `false`.
      *
      * @returns Value of property `interactive`
      */
    def getInteractive(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Defines the unique identifier (icon name) of the component.
      *
      *
      * To browse all available icons, see the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html SAP Icons},
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT SAP Fiori Tools} and
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html SAP Business Suite} collections.
      *
      *
      * Example:
      *  `name='add'`, `name='delete'`, `name='employee'`.
      *
      *
      *
      * **Note:** To use the SAP Fiori Tools icons, you need to set the `tnt` prefix in front of the icon's name.
      *
      *
      *
      * Example:
      *  `name='tnt/antenna'`, `name='tnt/actor'`, `name='tnt/api'`.
      *
      *
      *
      * **Note:** To use the SAP Business Suite icons, you need to set the `business-suite` prefix in front of
      * the icon's name.
      *
      *
      * Example:
      *  `name='business-suite/3d'`, `name='business-suite/1x2-grid-layout'`, `name='business-suite/4x4-grid-layout'`.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowTooltip showTooltip}.
      *
      * Defines whether the component should have a tooltip.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showTooltip`
      */
    def getShowTooltip(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the text alternative of the component. If not provided a default text alternative will be set,
      * if present.
      *
      *  **Note:** Every icon should have a text alternative in order to calculate its accessible name.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * Defines the accessibility role of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(): this.type = js.native
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Defines the background color of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: CSSColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getColor color}.
      *
      * Defines the color of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColor(/**
      * New value for property `color`
      */
    sColor: CSSColor): this.type = js.native
    
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
      * Sets a new value for property {@link #getInteractive interactive}.
      *
      * Defines if the icon is interactive (focusable and pressable)
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInteractive(): this.type = js.native
    def setInteractive(/**
      * New value for property `interactive`
      */
    bInteractive: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Defines the unique identifier (icon name) of the component.
      *
      *
      * To browse all available icons, see the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html SAP Icons},
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT SAP Fiori Tools} and
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html SAP Business Suite} collections.
      *
      *
      * Example:
      *  `name='add'`, `name='delete'`, `name='employee'`.
      *
      *
      *
      * **Note:** To use the SAP Fiori Tools icons, you need to set the `tnt` prefix in front of the icon's name.
      *
      *
      *
      * Example:
      *  `name='tnt/antenna'`, `name='tnt/actor'`, `name='tnt/api'`.
      *
      *
      *
      * **Note:** To use the SAP Business Suite icons, you need to set the `business-suite` prefix in front of
      * the icon's name.
      *
      *
      * Example:
      *  `name='business-suite/3d'`, `name='business-suite/1x2-grid-layout'`, `name='business-suite/4x4-grid-layout'`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowTooltip showTooltip}.
      *
      * Defines whether the component should have a tooltip.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTooltip(): this.type = js.native
    def setShowTooltip(/**
      * New value for property `showTooltip`
      */
    bShowTooltip: Boolean): this.type = js.native
    
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
  
  trait Icon$ClickEventParameters extends StObject
  
  type IconClickEvent = typings.openui5.sapUiBaseEventMod.default[Icon$ClickEventParameters]
  
  type IconClickEventParameters = Icon$ClickEventParameters
  
  trait IconSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the text alternative of the component. If not provided a default text alternative will be set,
      * if present.
      *
      *  **Note:** Every icon should have a text alternative in order to calculate its accessible name.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the accessibility role of the component.
      */
    var accessibleRole: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the background color of the control
      */
    var backgroundColor: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user clicks the control
      */
    var click: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines the color of the control
      */
    var color: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines if the icon is interactive (focusable and pressable)
      */
    var interactive: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the unique identifier (icon name) of the component.
      *
      *
      * To browse all available icons, see the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html SAP Icons},
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT SAP Fiori Tools} and
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html SAP Business Suite} collections.
      *
      *
      * Example:
      *  `name='add'`, `name='delete'`, `name='employee'`.
      *
      *
      *
      * **Note:** To use the SAP Fiori Tools icons, you need to set the `tnt` prefix in front of the icon's name.
      *
      *
      *
      * Example:
      *  `name='tnt/antenna'`, `name='tnt/actor'`, `name='tnt/api'`.
      *
      *
      *
      * **Note:** To use the SAP Business Suite icons, you need to set the `business-suite` prefix in front of
      * the icon's name.
      *
      *
      * Example:
      *  `name='business-suite/3d'`, `name='business-suite/1x2-grid-layout'`, `name='business-suite/4x4-grid-layout'`.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the component should have a tooltip.
      */
    var showTooltip: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object IconSettings {
    
    inline def apply(): IconSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAccessibleRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setBackgroundColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInteractive(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShowTooltip(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
