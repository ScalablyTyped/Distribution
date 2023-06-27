package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcFilterbarFilterBarBaseMod.FilterBarBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFilterbarVhFilterBarMod {
  
  @JSImport("sap/ui/mdc/filterbar/vh/FilterBar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FilterBar.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FilterBar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FilterBarSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: FilterBarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FilterBarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/filterbar/vh/FilterBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.filterbar.vh.FilterBar with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.filterbar.FilterBarBase.extend}.
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
    oClassInfo: ClassInfo[T, FilterBar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterBar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.filterbar.vh.FilterBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FilterBar
    extends typings.openui5.sapUiMdcFilterbarFilterBarBaseMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Destroyes the `CollectiveSearch` control
      *
      * **Note:** This must only be used by the corresponding value help, not from outside.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def destroyCollectiveSearch(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the `CollectiveSearch` control
      *
      * **Note:** This must only be used by the corresponding value help, not from outside.
      *
      * @returns `CollectiveSearch` control
      */
    def getCollectiveSearch(): Any = js.native
    
    /**
      * Gets current value of property {@link #getExpandFilterFields expandFilterFields}.
      *
      * Determines whether the Show/Hide Filters button is in the state show or hide.
      *
      *
      * Default value is `true`.
      *
      * @returns Value of property `expandFilterFields`
      */
    def getExpandFilterFields(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFilterFieldThreshold filterFieldThreshold}.
      *
      * Number of FilterItems which will be shown via Show Filters.
      *
      *
      * Default value is `8`.
      *
      * @returns Value of property `filterFieldThreshold`
      */
    def getFilterFieldThreshold(): int = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets the `CollectiveSearch` control
      *
      * **Note:** This must only be done by the corresponding value help, not from outside.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def setCollectiveSearch(
      /**
      * `CollectiveSearch` control
      */
    oCollectiveSearch: /* was: sap.ui.mdc.filterbar.vh.CollectiveSearchSelect */ Any
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getExpandFilterFields expandFilterFields}.
      *
      * Determines whether the Show/Hide Filters button is in the state show or hide.
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setExpandFilterFields(): this.type = js.native
    def setExpandFilterFields(/**
      * New value for property `expandFilterFields`
      */
    bExpandFilterFields: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterFieldThreshold filterFieldThreshold}.
      *
      * Number of FilterItems which will be shown via Show Filters.
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `8`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterFieldThreshold(): this.type = js.native
    def setFilterFieldThreshold(/**
      * New value for property `filterFieldThreshold`
      */
    iFilterFieldThreshold: int): this.type = js.native
  }
  
  trait FilterBarSettings
    extends StObject
       with FilterBarBaseSettings {
    
    /**
      * Determines whether the Show/Hide Filters button is in the state show or hide.
      */
    var expandFilterFields: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Number of FilterItems which will be shown via Show Filters.
      */
    var filterFieldThreshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object FilterBarSettings {
    
    inline def apply(): FilterBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterBarSettings] (val x: Self) extends AnyVal {
      
      inline def setExpandFilterFields(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "expandFilterFields", value.asInstanceOf[js.Any])
      
      inline def setExpandFilterFieldsUndefined: Self = StObject.set(x, "expandFilterFields", js.undefined)
      
      inline def setFilterFieldThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterFieldThreshold", value.asInstanceOf[js.Any])
      
      inline def setFilterFieldThresholdUndefined: Self = StObject.set(x, "filterFieldThreshold", js.undefined)
    }
  }
}
