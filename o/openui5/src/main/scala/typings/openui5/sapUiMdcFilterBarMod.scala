package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcEnumsFilterBarP13nModeMod.FilterBarP13nMode
import typings.openui5.sapUiMdcFilterbarFilterBarBaseMod.FilterBarBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFilterBarMod {
  
  @JSImport("sap/ui/mdc/FilterBar", JSImport.Default)
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
    
    @JSImport("sap/ui/mdc/FilterBar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.FilterBar with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.mdc.FilterBar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FilterBar
    extends typings.openui5.sapUiMdcFilterbarFilterBarBaseMod.default {
    
    /**
      * @since 1.74
      *
      * Gets current value of property {@link #getP13nMode p13nMode}.
      *
      * Specifies the personalization options for the filter bar.
      *
      * @returns Value of property `p13nMode`
      */
    def getP13nMode(): js.Array[
        FilterBarP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterBarP13nMode * / any */ String)
      ] = js.native
    
    /**
      * Gets current value of property {@link #getShowAdaptFiltersButton showAdaptFiltersButton}.
      *
      * Determines whether the Adapt Filters button is visible in the filter bar.
      *  **Note**: If the `p13nMode` property does not contain the value `Item`, it is ignored.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showAdaptFiltersButton`
      */
    def getShowAdaptFiltersButton(): Boolean = js.native
    
    /**
      * @since 1.108
      *
      * Gets current value of property {@link #getShowClearButton showClearButton}.
      *
      * Determines whether the Clear button is visible in the filter bar.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showClearButton`
      */
    def getShowClearButton(): Boolean = js.native
    
    /**
      * Sets the focus on the first filter in error state.
      *
      * @returns Returns the first filter field in error state
      */
    def setFocusOnFirstErroneousField(): typings.openui5.sapUiMdcFilterFieldMod.default | Null = js.native
    
    /**
      * @since 1.74
      *
      * Sets a new value for property {@link #getP13nMode p13nMode}.
      *
      * Specifies the personalization options for the filter bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setP13nMode(
      /**
      * New value for property `p13nMode`
      */
    sP13nMode: js.Array[
          FilterBarP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterBarP13nMode * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowAdaptFiltersButton showAdaptFiltersButton}.
      *
      * Determines whether the Adapt Filters button is visible in the filter bar.
      *  **Note**: If the `p13nMode` property does not contain the value `Item`, it is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowAdaptFiltersButton(): this.type = js.native
    def setShowAdaptFiltersButton(/**
      * New value for property `showAdaptFiltersButton`
      */
    bShowAdaptFiltersButton: Boolean): this.type = js.native
    
    /**
      * @since 1.108
      *
      * Sets a new value for property {@link #getShowClearButton showClearButton}.
      *
      * Determines whether the Clear button is visible in the filter bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowClearButton(): this.type = js.native
    def setShowClearButton(/**
      * New value for property `showClearButton`
      */
    bShowClearButton: Boolean): this.type = js.native
  }
  
  trait FilterBarSettings
    extends StObject
       with FilterBarBaseSettings {
    
    /**
      * @since 1.74
      *
      * Specifies the personalization options for the filter bar.
      */
    var p13nMode: js.UndefOr[
        (js.Array[
          FilterBarP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterBarP13nMode * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the Adapt Filters button is visible in the filter bar.
      *  **Note**: If the `p13nMode` property does not contain the value `Item`, it is ignored.
      */
    var showAdaptFiltersButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.108
      *
      * Determines whether the Clear button is visible in the filter bar.
      */
    var showClearButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FilterBarSettings {
    
    inline def apply(): FilterBarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterBarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterBarSettings] (val x: Self) extends AnyVal {
      
      inline def setP13nMode(
        value: (js.Array[
              FilterBarP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterBarP13nMode * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "p13nMode", value.asInstanceOf[js.Any])
      
      inline def setP13nModeUndefined: Self = StObject.set(x, "p13nMode", js.undefined)
      
      inline def setP13nModeVarargs(
        value: (FilterBarP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterBarP13nMode * / any */ String))*
      ): Self = StObject.set(x, "p13nMode", js.Array(value*))
      
      inline def setShowAdaptFiltersButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showAdaptFiltersButton", value.asInstanceOf[js.Any])
      
      inline def setShowAdaptFiltersButtonUndefined: Self = StObject.set(x, "showAdaptFiltersButton", js.undefined)
      
      inline def setShowClearButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showClearButton", value.asInstanceOf[js.Any])
      
      inline def setShowClearButtonUndefined: Self = StObject.set(x, "showClearButton", js.undefined)
    }
  }
}
