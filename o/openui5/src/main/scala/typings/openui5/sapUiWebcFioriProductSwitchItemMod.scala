package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IProductSwitchItem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriProductSwitchItemMod {
  
  @JSImport("sap/ui/webc/fiori/ProductSwitchItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ProductSwitchItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ProductSwitchItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ProductSwitchItemSettings) = this()
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
    mSettings: ProductSwitchItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ProductSwitchItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IProductSwitchItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/ProductSwitchItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.ProductSwitchItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ProductSwitchItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ProductSwitchItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.ProductSwitchItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait ProductSwitchItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IProductSwitchItem {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.fiori.ProductSwitchItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ProductSwitchItem` itself.
      *
      * Fired when the `sap.ui.webc.fiori.ProductSwitchItem` is activated either with a click/tap or by using
      * the Enter or Space key.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ProductSwitchItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:click click} event of this `sap.ui.webc.fiori.ProductSwitchItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.fiori.ProductSwitchItem` itself.
      *
      * Fired when the `sap.ui.webc.fiori.ProductSwitchItem` is activated either with a click/tap or by using
      * the Enter or Space key.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.fiori.ProductSwitchItem`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:click click} event of this `sap.ui.webc.fiori.ProductSwitchItem`.
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
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as a graphical element within the component.
      *
      *  Example:
      *
      * ```javascript
      * ui5-product-switch-item icon="palette"```
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getSubtitleText subtitleText}.
      *
      * Defines the subtitle of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `subtitleText`
      */
    def getSubtitleText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Defines a target where the `targetSrc` content must be open.
      *
      *  Available options are:
      * 	 - `_self`
      * 	 - `_top`
      * 	 - `_blank`
      * 	 - `_parent`
      * 	 - `_search`
      *
      * Default value is `"_self"`.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getTargetSrc targetSrc}.
      *
      * Defines the component target URI. Supports standard hyperlink behavior.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `targetSrc`
      */
    def getTargetSrc(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleText titleText}.
      *
      * Defines the title of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `titleText`
      */
    def getTitleText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon to be displayed as a graphical element within the component.
      *
      *  Example:
      *
      * ```javascript
      * ui5-product-switch-item icon="palette"```
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubtitleText subtitleText}.
      *
      * Defines the subtitle of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubtitleText(): this.type = js.native
    def setSubtitleText(/**
      * New value for property `subtitleText`
      */
    sSubtitleText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Defines a target where the `targetSrc` content must be open.
      *
      *  Available options are:
      * 	 - `_self`
      * 	 - `_top`
      * 	 - `_blank`
      * 	 - `_parent`
      * 	 - `_search`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"_self"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(/**
      * New value for property `target`
      */
    sTarget: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTargetSrc targetSrc}.
      *
      * Defines the component target URI. Supports standard hyperlink behavior.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTargetSrc(): this.type = js.native
    def setTargetSrc(/**
      * New value for property `targetSrc`
      */
    sTargetSrc: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleText titleText}.
      *
      * Defines the title of the component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleText(): this.type = js.native
    def setTitleText(/**
      * New value for property `titleText`
      */
    sTitleText: String): this.type = js.native
  }
  
  trait ProductSwitchItem$ClickEventParameters extends StObject
  
  type ProductSwitchItemClickEvent = typings.openui5.sapUiBaseEventMod.default[ProductSwitchItem$ClickEventParameters]
  
  type ProductSwitchItemClickEventParameters = ProductSwitchItem$ClickEventParameters
  
  trait ProductSwitchItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the `sap.ui.webc.fiori.ProductSwitchItem` is activated either with a click/tap or by using
      * the Enter or Space key.
      */
    var click: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Defines the icon to be displayed as a graphical element within the component.
      *
      *  Example:
      *
      * ```javascript
      * ui5-product-switch-item icon="palette"```
      *
      *
      * See all the available icons in the {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the subtitle of the component.
      */
    var subtitleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines a target where the `targetSrc` content must be open.
      *
      *  Available options are:
      * 	 - `_self`
      * 	 - `_top`
      * 	 - `_blank`
      * 	 - `_parent`
      * 	 - `_search`
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the component target URI. Supports standard hyperlink behavior.
      */
    var targetSrc: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the title of the component.
      */
    var titleText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ProductSwitchItemSettings {
    
    inline def apply(): ProductSwitchItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductSwitchItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductSwitchItemSettings] (val x: Self) extends AnyVal {
      
      inline def setClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setSubtitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitleText", value.asInstanceOf[js.Any])
      
      inline def setSubtitleTextUndefined: Self = StObject.set(x, "subtitleText", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetSrc(value: String | PropertyBindingInfo): Self = StObject.set(x, "targetSrc", value.asInstanceOf[js.Any])
      
      inline def setTargetSrcUndefined: Self = StObject.set(x, "targetSrc", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitleText(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
}
