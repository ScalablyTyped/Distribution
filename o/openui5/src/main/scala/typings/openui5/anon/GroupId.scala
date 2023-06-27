package typings.openui5.anon

import typings.openui5.sapUiModelOdataOperationModeMod.OperationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupId extends StObject {
  
  /**
    * **Deprecated**, use `groupId` instead. Sets the batch group id to be used for requests originating from
    * this binding
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the count mode of this binding; if not specified, the default count mode of the binding's model
    * is applied. The resulting count mode must not be {@link sap.ui.model.odata.CountMode.None}.
    */
  var countMode: js.UndefOr[
    typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
  ] = js.undefined
  
  /**
    * The group id to be used for requests originating from this binding
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * A map describing the navigation properties between entity sets, which is used for constructing and paging
    * the tree. Keys in this object are entity names, whereas the values name the navigation properties.
    *
    * **Deprecated: since 1.44** The use of navigation properties to build up the hierarchy structure is deprecated.
    * It is recommended to use the hierarchy annotations mentioned above instead.
    */
  var navigation: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The number of levels that are auto-expanded initially. Setting this property might lead to multiple back-end
    * requests. The auto-expand feature is **deprecated for services without the `hierarchy-node-descendant-count-for`
    * annotation**
    */
  var numberOfExpandedLevels: js.UndefOr[Double] = js.undefined
  
  /**
    * The operation mode for this binding; defaults to the model's default operation mode if not specified.
    * {@link sap.ui.model.odata.OperationMode.Auto OperationMode.Auto} is only supported for services which
    * expose the hierarchy annotations, yet do **NOT** expose the `hierarchy-node-descendant-count-for` annotation.
    * **Note:** {@link sap.ui.model.odata.OperationMode.Auto} is deprecated since 1.102.0.
    */
  var operationMode: js.UndefOr[
    OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
  ] = js.undefined
  
  /**
    * The level of the topmost tree nodes
    */
  var rootLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Deprecated since 1.102.0, as {@link sap.ui.model.odata.OperationMode.Auto} is deprecated; the threshold
    * that defines how many entries should be fetched at least by the binding if `operationMode` is set to
    * `Auto`
    */
  var threshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The mapping between data properties and the hierarchy used to visualize the tree, if not provided by
    * the service's metadata. For the correct metadata annotations, check the "SAP Annotations for OData Version
    * 2.0" specification
    */
  var treeAnnotationProperties: js.UndefOr[HierarchyDrillStateFor] = js.undefined
  
  /**
    * A tree state handle can be given to the `ODataTreeBinding` when two conditions are met:
    * 	 - The binding is running in {@link sap.ui.model.odata.OperationMode.Client OperationMode.Client}, and
    *
    * 	 - the {@link sap.ui.table.TreeTable} is used.  The feature is only available when using the `ODataTreeBindingAdapter`,
    *     which is automatically applied when using the `sap.ui.table.TreeTable`. The tree state handle will contain
    *     all necessary information to expand the tree to the given state.
    *
    * This feature is not supported if {@link sap.ui.model.odata.OperationMode.Server OperationMode.Server }
    * or {@link sap.ui.model.odata.OperationMode.Auto OperationMode.Auto} is used. See also {@link sap.ui.model.odata.ODataTreeBindingAdapter#getCurrentTreeState}
    */
  var treeState: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether a preliminary context is used; defaults to the value of the parameter `preliminaryContext` given
    * on construction of the binding's model, see {@link sap.ui.model.odata.v2.ODataModel}
    */
  var usePreliminaryContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated since 1.102.0, as {@link sap.ui.model.odata.OperationMode.Auto} is deprecated; whether `$filter`
    * statements should be used for the `$count` / `$inlinecount` requests and for the data request if the
    * operation mode is {@link sap.ui.model.odata.OperationMode.Auto OperationMode.Auto}. Use this feature
    * only if your back end supports pre-filtering the tree and is capable of responding with a complete tree
    * hierarchy, including all inner nodes. To construct the hierarchy on the client, it is mandatory that
    * all filter matches include their complete parent chain up to the root level. If {@link sap.ui.model.odata.OperationMode.Client OperationMode.Client }
    * is used, the complete collection without filters is requested; filters are applied on the client side.
    */
  var useServersideApplicationFilters: js.UndefOr[Boolean] = js.undefined
}
object GroupId {
  
  inline def apply(): GroupId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupId] (val x: Self) extends AnyVal {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setCountMode(
      value: typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
    ): Self = StObject.set(x, "countMode", value.asInstanceOf[js.Any])
    
    inline def setCountModeUndefined: Self = StObject.set(x, "countMode", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setNavigation(value: js.Object): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setNumberOfExpandedLevels(value: Double): Self = StObject.set(x, "numberOfExpandedLevels", value.asInstanceOf[js.Any])
    
    inline def setNumberOfExpandedLevelsUndefined: Self = StObject.set(x, "numberOfExpandedLevels", js.undefined)
    
    inline def setOperationMode(
      value: OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
    ): Self = StObject.set(x, "operationMode", value.asInstanceOf[js.Any])
    
    inline def setOperationModeUndefined: Self = StObject.set(x, "operationMode", js.undefined)
    
    inline def setRootLevel(value: Double): Self = StObject.set(x, "rootLevel", value.asInstanceOf[js.Any])
    
    inline def setRootLevelUndefined: Self = StObject.set(x, "rootLevel", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTreeAnnotationProperties(value: HierarchyDrillStateFor): Self = StObject.set(x, "treeAnnotationProperties", value.asInstanceOf[js.Any])
    
    inline def setTreeAnnotationPropertiesUndefined: Self = StObject.set(x, "treeAnnotationProperties", js.undefined)
    
    inline def setTreeState(value: Any): Self = StObject.set(x, "treeState", value.asInstanceOf[js.Any])
    
    inline def setTreeStateUndefined: Self = StObject.set(x, "treeState", js.undefined)
    
    inline def setUsePreliminaryContext(value: Boolean): Self = StObject.set(x, "usePreliminaryContext", value.asInstanceOf[js.Any])
    
    inline def setUsePreliminaryContextUndefined: Self = StObject.set(x, "usePreliminaryContext", js.undefined)
    
    inline def setUseServersideApplicationFilters(value: Boolean): Self = StObject.set(x, "useServersideApplicationFilters", value.asInstanceOf[js.Any])
    
    inline def setUseServersideApplicationFiltersUndefined: Self = StObject.set(x, "useServersideApplicationFilters", js.undefined)
  }
}
