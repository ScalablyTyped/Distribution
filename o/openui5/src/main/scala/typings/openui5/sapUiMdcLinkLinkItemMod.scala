package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcLinkLinkItemMod {
  
  @JSImport("sap/ui/mdc/link/LinkItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new LinkItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends LinkItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LinkItemSettings) = this()
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
    mSettings: LinkItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LinkItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/link/LinkItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.link.LinkItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, LinkItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LinkItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.link.LinkItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait LinkItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines the additional text of the item.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getHref href}.
      *
      * Destination link for a navigation operation in external format (used when opening in new tab).
      *
      * @returns Value of property `href`
      */
    def getHref(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the icon of the item.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getInitiallyVisible initiallyVisible}.
      *
      * Determines the initial visibility of the `LinkItem`. If set to `true`, the item will appear on the `Popover`
      * without any personalization.
      *
      * Default value is `false`.
      *
      * @returns Value of property `initiallyVisible`
      */
    def getInitiallyVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getInternalHref internalHref}.
      *
      * Destination link for a navigation operation in internal format provided by the SAP Fiori launchpad (used
      * when navigation happens programmatically).
      *
      * @returns Value of property `internalHref`
      */
    def getInternalHref(): String = js.native
    
    /**
      * Gets current value of property {@link #getKey key}.
      *
      * Unique key of the `LinkItem` that is used for personalization.
      *
      * @returns Value of property `key`
      */
    def getKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Determines the target of the `Link` and has to be used as the `target` of an html anchor.
      *
      * Default value is `"_self"`.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Text of the `Link` that is displayed.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines the additional text of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHref href}.
      *
      * Destination link for a navigation operation in external format (used when opening in new tab).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHref(/**
      * New value for property `href`
      */
    sHref: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the icon of the item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInitiallyVisible initiallyVisible}.
      *
      * Determines the initial visibility of the `LinkItem`. If set to `true`, the item will appear on the `Popover`
      * without any personalization.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitiallyVisible(): this.type = js.native
    def setInitiallyVisible(/**
      * New value for property `initiallyVisible`
      */
    bInitiallyVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInternalHref internalHref}.
      *
      * Destination link for a navigation operation in internal format provided by the SAP Fiori launchpad (used
      * when navigation happens programmatically).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInternalHref(): this.type = js.native
    def setInternalHref(/**
      * New value for property `internalHref`
      */
    sInternalHref: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKey key}.
      *
      * Unique key of the `LinkItem` that is used for personalization.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKey(/**
      * New value for property `key`
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Determines the target of the `Link` and has to be used as the `target` of an html anchor.
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
      * Sets a new value for property {@link #getText text}.
      *
      * Text of the `Link` that is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait LinkItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Defines the additional text of the item.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Destination link for a navigation operation in external format (used when opening in new tab).
      */
    var href: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the icon of the item.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the initial visibility of the `LinkItem`. If set to `true`, the item will appear on the `Popover`
      * without any personalization.
      */
    var initiallyVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Destination link for a navigation operation in internal format provided by the SAP Fiori launchpad (used
      * when navigation happens programmatically).
      */
    var internalHref: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Unique key of the `LinkItem` that is used for personalization.
      */
    var key: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the target of the `Link` and has to be used as the `target` of an html anchor.
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Text of the `Link` that is displayed.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object LinkItemSettings {
    
    inline def apply(): LinkItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkItemSettings] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHref(value: String | PropertyBindingInfo): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInitiallyVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "initiallyVisible", value.asInstanceOf[js.Any])
      
      inline def setInitiallyVisibleUndefined: Self = StObject.set(x, "initiallyVisible", js.undefined)
      
      inline def setInternalHref(value: String | PropertyBindingInfo): Self = StObject.set(x, "internalHref", value.asInstanceOf[js.Any])
      
      inline def setInternalHrefUndefined: Self = StObject.set(x, "internalHref", js.undefined)
      
      inline def setKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
