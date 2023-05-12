package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IconTab
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMIconTabSeparatorMod {
  
  @JSImport("sap/m/IconTabSeparator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new IconTabSeparator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends IconTabSeparator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: IconTabSeparatorSettings) = this()
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
    mSettings: IconTabSeparatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: IconTabSeparatorSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IconTab: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/IconTabSeparator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.IconTabSeparator with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, IconTabSeparator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, IconTabSeparator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.IconTabSeparator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait IconTabSeparator
    extends typings.openui5.sapUiCoreElementMod.default
       with IconTab {
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * The icon to display for this separator. If no icon is given, a separator line is used instead.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * If set to true, it sends one or more requests, trying to get the density perfect version of the image
      * if this version of the image doesn't exist on the server. Default value is set to true.
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Specifies whether the separator is rendered.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Renders the item in the IconTabHeader.
      */
    def render(
      /**
      * the RenderManager that can be used for writing to the render output buffer
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default
    ): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Renders this item in the IconTabSelectList.
      */
    def renderInSelectList(
      /**
      * RenderManager used for writing to the render output buffer
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * the select list in which this filter is rendered
      */
    oSelectList: /* was: sap.m.IconTabBarSelectList */ Any,
      /**
      * this item's index within the aggregation of items
      */
    iIndexInSet: int,
      /**
      * total length of the aggregation of items
      */
    iSetSize: int,
      /**
      * the padding with which the item should be indented
      */
    fPaddingValue: float
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * The icon to display for this separator. If no icon is given, a separator line is used instead.
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
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * If set to true, it sends one or more requests, trying to get the density perfect version of the image
      * if this version of the image doesn't exist on the server. Default value is set to true.
      *
      * If bandwidth is key for the application, set this value to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDensityAware(): this.type = js.native
    def setIconDensityAware(/**
      * New value for property `iconDensityAware`
      */
    bIconDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Specifies whether the separator is rendered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait IconTabSeparatorSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The icon to display for this separator. If no icon is given, a separator line is used instead.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If set to true, it sends one or more requests, trying to get the density perfect version of the image
      * if this version of the image doesn't exist on the server. Default value is set to true.
      *
      * If bandwidth is key for the application, set this value to false.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the separator is rendered.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object IconTabSeparatorSettings {
    
    inline def apply(): IconTabSeparatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconTabSeparatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconTabSeparatorSettings] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
