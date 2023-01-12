package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiUx3LibraryMod.VisibleItemCountMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3FacetFilterMod {
  
  @JSImport("sap/ui/ux3/FacetFilter", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FacetFilter.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FacetFilter {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FacetFilterSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: FacetFilterSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FacetFilterSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/FacetFilter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.FacetFilter with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, FacetFilter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FacetFilter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.FacetFilter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FacetFilter
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some list to the aggregation {@link #getLists lists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addList(
      /**
      * The list to add; if empty, nothing is inserted
      */
    oList: typings.openui5.sapUiUx3FacetFilterListMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the lists in the aggregation {@link #getLists lists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLists(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getLists lists}.
      *
      * Facet Filter list represents the list of the filter values and the title of this list.
      */
    def getLists(): js.Array[typings.openui5.sapUiUx3FacetFilterListMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getVisibleItemCountMode visibleItemCountMode}.
      *
      * If the value is "Auto" - the Facet Filter takes the whole available height. If "Fixed" , then the default
      * number of Facet Filter Items (5) is visible.
      *
      * Default value is `Fixed`.
      *
      * @returns Value of property `visibleItemCountMode`
      */
    def getVisibleItemCountMode(): VisibleItemCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleItemCountMode * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.FacetFilterList` in the aggregation {@link #getLists lists}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfList(
      /**
      * The list whose index is looked for
      */
    oList: typings.openui5.sapUiUx3FacetFilterListMod.default
    ): int = js.native
    
    /**
      * Inserts a list into the aggregation {@link #getLists lists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertList(
      /**
      * The list to insert; if empty, nothing is inserted
      */
    oList: typings.openui5.sapUiUx3FacetFilterListMod.default,
      /**
      * The `0`-based index the list should be inserted at; for a negative value of `iIndex`, the list is inserted
      * at position 0; for a value greater than the current size of the aggregation, the list is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getLists lists}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllLists(): js.Array[typings.openui5.sapUiUx3FacetFilterListMod.default] = js.native
    
    def removeList(/**
      * The list to remove or its index or id
      */
    vList: String): typings.openui5.sapUiUx3FacetFilterListMod.default | Null = js.native
    /**
      * Removes a list from the aggregation {@link #getLists lists}.
      *
      * @returns The removed list or `null`
      */
    def removeList(/**
      * The list to remove or its index or id
      */
    vList: int): typings.openui5.sapUiUx3FacetFilterListMod.default | Null = js.native
    def removeList(
      /**
      * The list to remove or its index or id
      */
    vList: typings.openui5.sapUiUx3FacetFilterListMod.default
    ): typings.openui5.sapUiUx3FacetFilterListMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleItemCountMode visibleItemCountMode}.
      *
      * If the value is "Auto" - the Facet Filter takes the whole available height. If "Fixed" , then the default
      * number of Facet Filter Items (5) is visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Fixed`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleItemCountMode(): this.type = js.native
    def setVisibleItemCountMode(
      /**
      * New value for property `visibleItemCountMode`
      */
    sVisibleItemCountMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleItemCountMode * / any */ String
    ): this.type = js.native
    def setVisibleItemCountMode(
      /**
      * New value for property `visibleItemCountMode`
      */
    sVisibleItemCountMode: VisibleItemCountMode
    ): this.type = js.native
  }
  
  trait FacetFilterSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Facet Filter list represents the list of the filter values and the title of this list.
      */
    var lists: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3FacetFilterListMod.default] | typings.openui5.sapUiUx3FacetFilterListMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If the value is "Auto" - the Facet Filter takes the whole available height. If "Fixed" , then the default
      * number of Facet Filter Items (5) is visible.
      */
    var visibleItemCountMode: js.UndefOr[
        VisibleItemCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleItemCountMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object FacetFilterSettings {
    
    inline def apply(): FacetFilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFilterSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FacetFilterSettings] (val x: Self) extends AnyVal {
      
      inline def setLists(
        value: js.Array[typings.openui5.sapUiUx3FacetFilterListMod.default] | typings.openui5.sapUiUx3FacetFilterListMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
      
      inline def setListsVarargs(value: typings.openui5.sapUiUx3FacetFilterListMod.default*): Self = StObject.set(x, "lists", js.Array(value*))
      
      inline def setVisibleItemCountMode(
        value: VisibleItemCountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VisibleItemCountMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "visibleItemCountMode", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemCountModeUndefined: Self = StObject.set(x, "visibleItemCountMode", js.undefined)
    }
  }
}
