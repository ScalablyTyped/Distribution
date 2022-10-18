package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelFilterTypeMod.FilterType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV2OdatatreebindingMod {
  
  @JSImport("sap/ui/model/odata/v2/ODataTreeBinding", JSImport.Default)
  @js.native
  open class default () extends ODataTreeBinding
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v2/ODataTreeBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v2.ODataTreeBinding with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.TreeBinding.extend}.
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
    oClassInfo: ClassInfo[T, ODataTreeBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataTreeBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v2.ODataTreeBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataTreeBinding
    extends typings.openui5.sapUiModelTreeBindingMod.default {
    
    /**
      * @SINCE 1.58
      *
      * Expand a nodes subtree to a given level.
      *
      * This API is only supported in `OperationMode.Server` and if the OData service implements the full specification
      * of the "hierarchy-node-for" annotation.
      *
      * @returns A promise resolving once the expansion process has been completed
      */
    def expandNodeToLevel(
      /**
      * Absolute row index
      */
    iIndex: int,
      /**
      * Level to which the data should be expanded
      */
    iLevel: int,
      /**
      * If set to true, no change event will be fired
      */
    bSuppressChange: Boolean
    ): js.Promise[Any] = js.native
    
    def filter(
      /**
      * Filter or array of filters to apply
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted. If it is not given, the type `FilterType.Control` is assumed
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def filter(
      /**
      * Filter or array of filters to apply
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Type of the filter which should be adjusted. If it is not given, the type `FilterType.Control` is assumed
      */
    sFilterType: FilterType,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def filter(
      /**
      * Filter or array of filters to apply
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted. If it is not given, the type `FilterType.Control` is assumed
      */
    sFilterType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterType * / any */ String,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def filter(
      /**
      * Filter or array of filters to apply
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Type of the filter which should be adjusted. If it is not given, the type `FilterType.Control` is assumed
      */
    sFilterType: FilterType,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the filtering has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Get a download URL with the specified format considering the sort/filter/custom parameters.
      *
      * @returns URL which can be used for downloading
      */
    def getDownloadUrl(/**
      * Value for the $format Parameter
      */
    sFormat: String): String = js.native
    
    def getNodeContexts(
      /**
      * The context for which the child nodes should be retrieved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The start index of the requested contexts
      */
    iStartIndex: int,
      /**
      * The requested amount of contexts
      */
    iLength: int,
      /**
      * The maximum number of contexts to read before and after the given range; with this, controls can prefetch
      * data that is likely to be needed soon, e.g. when scrolling down in a table.
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    
    /**
      * Returns root contexts for the tree. You can specify the start index and the length for paging requests.
      * This function is not available when the annotation "hierarchy-node-descendant-count-for" is exposed on
      * the service.
      *
      * @returns The root contexts for the tree
      */
    def getRootContexts(): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def getRootContexts(
      /**
      * The start index of the requested contexts
      */
    iStartIndex: Unit,
      /**
      * The requested amount of contexts. If none given, the default value is the size limit of the underlying
      * sap.ui.model.odata.v2.ODataModel instance.
      */
    iLength: Unit,
      /**
      * The number of entities which should be retrieved in addition to the given length. A higher threshold
      * reduces the number of backend requests, yet these request blow up in size, since more data is loaded.
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def getRootContexts(
      /**
      * The start index of the requested contexts
      */
    iStartIndex: Unit,
      /**
      * The requested amount of contexts. If none given, the default value is the size limit of the underlying
      * sap.ui.model.odata.v2.ODataModel instance.
      */
    iLength: int
    ): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def getRootContexts(
      /**
      * The start index of the requested contexts
      */
    iStartIndex: Unit,
      /**
      * The requested amount of contexts. If none given, the default value is the size limit of the underlying
      * sap.ui.model.odata.v2.ODataModel instance.
      */
    iLength: int,
      /**
      * The number of entities which should be retrieved in addition to the given length. A higher threshold
      * reduces the number of backend requests, yet these request blow up in size, since more data is loaded.
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def getRootContexts(/**
      * The start index of the requested contexts
      */
    iStartIndex: int): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def getRootContexts(
      /**
      * The start index of the requested contexts
      */
    iStartIndex: int,
      /**
      * The requested amount of contexts. If none given, the default value is the size limit of the underlying
      * sap.ui.model.odata.v2.ODataModel instance.
      */
    iLength: Unit,
      /**
      * The number of entities which should be retrieved in addition to the given length. A higher threshold
      * reduces the number of backend requests, yet these request blow up in size, since more data is loaded.
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def getRootContexts(
      /**
      * The start index of the requested contexts
      */
    iStartIndex: int,
      /**
      * The requested amount of contexts. If none given, the default value is the size limit of the underlying
      * sap.ui.model.odata.v2.ODataModel instance.
      */
    iLength: int,
      /**
      * The number of entities which should be retrieved in addition to the given length. A higher threshold
      * reduces the number of backend requests, yet these request blow up in size, since more data is loaded.
      */
    iThreshold: int
    ): js.Array[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    
    /**
      * Returns the rootLevel
      *
      * @returns The root level
      */
    def getRootLevel(): int = js.native
    
    /**
      * Returns if the node has child nodes. If the ODataTreeBinding is running with hierarchy annotations, a
      * context with the property values "expanded" or "collapsed" for the drilldown state property, returns
      * true. Entities with drilldown state "leaf" return false.
      *
      * This function is not available when the annotation "hierarchy-node-descendant-count-for" is exposed on
      * the service.
      *
      * @returns true if node has children
      */
    def hasChildren(
      /**
      * the context element of the node
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Boolean = js.native
    
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Boolean,
      /**
      * The group Id for the refresh
      */
    sGroupId: String
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Unit,
      /**
      * The group Id for the refresh
      */
    sGroupId: String
    ): Unit = js.native
    
    /**
      * Sets the `rootLevel`. The root level is the level of the topmost tree nodes that will be used as an entry
      * point for OData services. This is only possible (and necessary) for OData services implementing the hierarchy
      * annotation specification, or when providing the annotation information locally as a binding parameter.
      * For more information, see {@link sap.ui.model.odata.v2.ODataModel#bindTree}.
      */
    def setRootLevel(/**
      * The new `rootLevel`
      */
    iRootLevel: int): Unit = js.native
    
    def sort(
      /**
      * The Sorter or an Array of sap.ui.model.Sorter instances
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the sorting has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
    def sort(
      /**
      * The Sorter or an Array of sap.ui.model.Sorter instances
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ): this.type = js.native
    def sort(
      /**
      * The Sorter or an Array of sap.ui.model.Sorter instances
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Whether to return `true` or `false`, instead of `this`, depending on whether the sorting has been done
      */
    bReturnSuccess: Boolean
    ): this.type = js.native
  }
}
