package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsPanelMod.PanelSettings
import typings.openui5.sapUiCoreLibraryMod.Scrolling
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsTabMod {
  
  @JSImport("sap/ui/commons/Tab", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Tab.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Tab {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TabSettings) = this()
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
    mSettings: TabSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TabSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Tab", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Tab with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.commons.Panel.extend}.
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
    oClassInfo: ClassInfo[T, Tab]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Tab],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Tab.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Tab
    extends typings.openui5.sapUiCommonsPanelMod.default {
    
    /**
      * Gets current value of property {@link #getClosable closable}.
      *
      * Specifies whether the tab contains a close button.
      *
      * Default value is `false`.
      *
      * @returns Value of property `closable`
      */
    def getClosable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * Specifies the horizontal scrolling.
      *
      * Default value is `None`.
      *
      * @returns Value of property `horizontalScrolling`
      */
    def getHorizontalScrolling(): Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) = js.native
    
    /**
      * @deprecated (since 0.17.0) - This property is not used. To identify the selected tab in a TabStrip selectedIndex
      * is used.
      *
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines whether the tab is the active one.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVerticalScrolling verticalScrolling}.
      *
      * Specifies the vertical scrolling.
      *
      * Default value is `None`.
      *
      * @returns Value of property `verticalScrolling`
      */
    def getVerticalScrolling(): Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getClosable closable}.
      *
      * Specifies whether the tab contains a close button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setClosable(): this.type = js.native
    def setClosable(/**
      * New value for property `closable`
      */
    bClosable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHorizontalScrolling horizontalScrolling}.
      *
      * Specifies the horizontal scrolling.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHorizontalScrolling(): this.type = js.native
    def setHorizontalScrolling(
      /**
      * New value for property `horizontalScrolling`
      */
    sHorizontalScrolling: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String
    ): this.type = js.native
    def setHorizontalScrolling(/**
      * New value for property `horizontalScrolling`
      */
    sHorizontalScrolling: Scrolling): this.type = js.native
    
    /**
      * @deprecated (since 0.17.0) - This property is not used. To identify the selected tab in a TabStrip selectedIndex
      * is used.
      *
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines whether the tab is the active one.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVerticalScrolling verticalScrolling}.
      *
      * Specifies the vertical scrolling.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVerticalScrolling(): this.type = js.native
    def setVerticalScrolling(
      /**
      * New value for property `verticalScrolling`
      */
    sVerticalScrolling: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String
    ): this.type = js.native
    def setVerticalScrolling(/**
      * New value for property `verticalScrolling`
      */
    sVerticalScrolling: Scrolling): this.type = js.native
  }
  
  trait TabSettings
    extends StObject
       with PanelSettings {
    
    /**
      * Specifies whether the tab contains a close button.
      */
    var closable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the horizontal scrolling.
      */
    var horizontalScrolling: js.UndefOr[
        Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @deprecated (since 0.17.0) - This property is not used. To identify the selected tab in a TabStrip selectedIndex
      * is used.
      *
      * Defines whether the tab is the active one.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the vertical scrolling.
      */
    var verticalScrolling: js.UndefOr[
        Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object TabSettings {
    
    inline def apply(): TabSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabSettings] (val x: Self) extends AnyVal {
      
      inline def setClosable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setHorizontalScrolling(
        value: Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "horizontalScrolling", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollingUndefined: Self = StObject.set(x, "horizontalScrolling", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setVerticalScrolling(
        value: Scrolling | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Scrolling * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "verticalScrolling", value.asInstanceOf[js.Any])
      
      inline def setVerticalScrollingUndefined: Self = StObject.set(x, "verticalScrolling", js.undefined)
    }
  }
}
