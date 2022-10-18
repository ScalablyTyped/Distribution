package typings.openui5

import typings.openui5.anon.CountMode
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelFilterTypeMod.FilterType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdatalistbindingMod {
  
  @JSImport("sap/ui/model/odata/ODataListBinding", JSImport.Default)
  @js.native
  open class default protected () extends ODataListBinding {
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[Any]
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[Any],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[Any]
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[Any]
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[Any],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[Any],
      /**
      * A map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[Any],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[Any],
      /**
      * A map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ) = this()
    def this(
      /**
      * Model that this list binding belongs to
      */
    oModel: typings.openui5.sapUiModelOdataOdatamodelMod.default,
      /**
      * Path into the model data, relative to the given `oContext`
      */
    sPath: String,
      /**
      * Context that the `sPath` is based on
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/ODataListBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.ODataListBinding with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.ListBinding.extend}.
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
    oClassInfo: ClassInfo[T, ODataListBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataListBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.ODataListBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataListBinding
    extends typings.openui5.sapUiModelListBindingMod.default {
    
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: FilterType,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def filter(
      /**
      * Single filter object or an array of filter objects
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted, if it is not given, the standard behaviour applies
      */
    sFilterType: FilterType,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.24
      *
      * Get a download URL with the specified format considering the sort/filter/custom parameters.
      *
      * @returns URL which can be used for downloading
      */
    def getDownloadUrl(/**
      * Value for the $format Parameter
      */
    sFormat: String): String = js.native
    
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Boolean,
      /**
      * A map of changed entities
      */
    mChangedEntities: js.Object
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Boolean,
      /**
      * A map of changed entities
      */
    mChangedEntities: js.Object,
      /**
      * A map of entity types
      */
    mEntityTypes: js.Object
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Boolean,
      /**
      * A map of changed entities
      */
    mChangedEntities: Unit,
      /**
      * A map of entity types
      */
    mEntityTypes: js.Object
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Unit,
      /**
      * A map of changed entities
      */
    mChangedEntities: js.Object
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Unit,
      /**
      * A map of changed entities
      */
    mChangedEntities: js.Object,
      /**
      * A map of entity types
      */
    mEntityTypes: js.Object
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Unit,
      /**
      * A map of changed entities
      */
    mChangedEntities: Unit,
      /**
      * A map of entity types
      */
    mEntityTypes: js.Object
    ): Unit = js.native
    
    def sort(
      /**
      * The Sorter or an array of sorter objects which define the sort order
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the sorting has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def sort(
      /**
      * The Sorter or an array of sorter objects which define the sort order
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the sorting has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
  }
}
