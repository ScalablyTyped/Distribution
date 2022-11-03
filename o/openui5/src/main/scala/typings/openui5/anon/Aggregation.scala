package typings.openui5.anon

import typings.openui5.sapUiModelOdataOperationModeMod.OperationMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregation extends StObject {
  
  /**
    * The value for the "3 System Query Option $apply" (see also OData
    * Extension for Data Aggregation Version 4.0) as an alternative to `$$aggregation`
    */
  @JSName("$apply")
  var $apply: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the "5.1.6 System Query Option $count", useful for creation at the end and {@link sap.ui.model.odata.v4.ODataListBinding#getCount}
    */
  @JSName("$count")
  var $count: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * The value for the "5.1.2 System Query Option $expand" or an object which determines that value. The object
    * is a map from expand path to expand options, where the options are again maps of system query options,
    * typically with string values. $count can also be given as a `boolean` value, $expand can recursively
    * be given as a map, $levels can also be given as a `number` value, and $select can also be given as an
    * array (but without navigation paths). An empty map can also be given as `null` or `true`. See also {@link
    * topic:1ab4f62de6ab467096a2a98b363a1373 Parameters}.
    */
  @JSName("$expand")
  var $expand: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * The value for the "5.1.1 System Query Option $filter" used in addition to `vFilters`
    */
  @JSName("$filter")
  var $filter: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the "5.1.4 System Query Option $orderby" used in addition to `vSorters`
    */
  @JSName("$orderby")
  var $orderby: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The value for the "5.1.7 System Query Option $search"; see also `oAggregation.search` at {@link sap.ui.model.odata.v4.ODataListBinding#setAggregation}
    * and the note there!
    */
  @JSName("$search")
  var $search: js.UndefOr[String] = js.undefined
  
  /**
    * A comma separated list or an array of items which determine the value for the "5.1.3 System Query Option
    * $select". Since 1.75.0, when using the "autoExpandSelect" model parameter (see {@link sap.ui.model.odata.v4.ODataModel#constructor}),
    * paths with navigation properties can be included and will contribute to the "5.1.2 System Query Option
    * $expand".
    */
  @JSName("$select")
  var $select: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * An object holding the information needed for data aggregation, see {@link sap.ui.model.odata.v4.ODataListBinding#setAggregation}
    * for details.
    */
  @JSName("$$aggregation")
  var DollarDollaraggregation: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Whether a binding relative to a {@link sap.ui.model.odata.v4.Context} uses the canonical path computed
    * from its context's path for data service requests; only the value `true` is allowed.
    */
  @JSName("$$canonicalPath")
  var DollarDollarcanonicalPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this binding is considered for a match when {@link #getKeepAliveContext} is called; only the
    * value `true` is allowed. Must not be combined with `$apply`, `$$aggregation`, `$$canonicalPath`, or `$$sharedRequest`.
    * If the binding is relative, `$$ownRequest` must be set as well. Supported since 1.99.0
    */
  @JSName("$$getKeepAliveContext")
  var DollarDollargetKeepAliveContext: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group ID to be used for **read** requests triggered by this binding; if not specified, either the
    * parent binding's group ID (if the binding is relative) or the model's group ID is used, see {@link sap.ui.model.odata.v4.ODataModel#constructor}.
    * Valid values are `undefined`, '$auto', '$auto.*', '$direct' or application group IDs as specified in
    * {@link sap.ui.model.odata.v4.ODataModel}.
    */
  @JSName("$$groupId")
  var DollarDollargroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The operation mode for filtering and sorting with the model's operation mode as default. Since 1.39.0,
    * the operation mode {@link sap.ui.model.odata.OperationMode.Server} is supported. All other operation
    * modes including `undefined` lead to an error if 'vFilters' or 'vSorters' are given or if {@link sap.ui.model.odata.v4.ODataListBinding#filter}
    * or {@link sap.ui.model.odata.v4.ODataListBinding#sort} is called.
    */
  @JSName("$$operationMode")
  var DollarDollaroperationMode: js.UndefOr[
    OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
  ] = js.undefined
  
  /**
    * Whether the binding always uses an own service request to read its data; only the value `true` is allowed.
    */
  @JSName("$$ownRequest")
  var DollarDollarownRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether implicit loading of side effects via PATCH requests is switched off; only the value `true` is
    * allowed. This sets the preference "return=minimal" and requires the service to return an ETag header
    * for "204 No Content" responses. If not specified, the value of the parent binding is used.
    */
  @JSName("$$patchWithoutSideEffects")
  var DollarDollarpatchWithoutSideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether multiple bindings for the same resource path share the data, so that it is requested only once;
    * only the value `true` is allowed. This parameter can be inherited from the model's parameter "sharedRequests",
    * see {@link sap.ui.model.odata.v4.ODataModel#constructor}. Supported since 1.80.0 **Note:** These bindings
    * are read-only, so they may be especially useful for value lists; state messages (since 1.108.0) and the
    * following APIs are **not** allowed
    * 	 for the list binding itself:
    * 	 {@link sap.ui.model.odata.v4.ODataListBinding#create}  {@link sap.ui.model.odata.v4.ODataListBinding#getKeepAliveContext}
    * or {@link #getKeepAliveContext} as far as it affects such a list binding  {@link sap.ui.model.odata.v4.ODataListBinding#resetChanges}
    *   for the {@link sap.ui.model.odata.v4.ODataListBinding#getHeaderContext header context} of
    * a list binding:
    * 	 {@link sap.ui.model.odata.v4.Context#requestSideEffects}   for the context of a list binding
    * representing a single entity:
    * 	 {@link sap.ui.model.odata.v4.Context#delete}  {@link sap.ui.model.odata.v4.Context#refresh}
    * {@link sap.ui.model.odata.v4.Context#replaceWith}  {@link sap.ui.model.odata.v4.Context#requestSideEffects}
    *  {@link sap.ui.model.odata.v4.Context#setKeepAlive}  {@link sap.ui.model.odata.v4.Context#setProperty}
    *  executing a bound operation using `bReplaceWithRVC`, see {@link sap.ui.model.odata.v4.ODataContextBinding#execute}
    *   for a dependent property binding of the list binding:
    * 	 {@link sap.ui.model.odata.v4.ODataPropertyBinding#setValue}
    */
  @JSName("$$sharedRequest")
  var DollarDollarsharedRequest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group ID to be used for **update** requests triggered by this binding; if not specified, either the
    * parent binding's update group ID (if the binding is relative) or the model's update group ID is used,
    * see {@link sap.ui.model.odata.v4.ODataModel#constructor}. For valid values, see parameter "$$groupId".
    */
  @JSName("$$updateGroupId")
  var DollarDollarupdateGroupId: js.UndefOr[String] = js.undefined
}
object Aggregation {
  
  inline def apply(): Aggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregation]
  }
  
  extension [Self <: Aggregation](x: Self) {
    
    inline def set$apply(value: String): Self = StObject.set(x, "$apply", value.asInstanceOf[js.Any])
    
    inline def set$applyUndefined: Self = StObject.set(x, "$apply", js.undefined)
    
    inline def set$count(value: String | Boolean): Self = StObject.set(x, "$count", value.asInstanceOf[js.Any])
    
    inline def set$countUndefined: Self = StObject.set(x, "$count", js.undefined)
    
    inline def set$expand(value: String | js.Object): Self = StObject.set(x, "$expand", value.asInstanceOf[js.Any])
    
    inline def set$expandUndefined: Self = StObject.set(x, "$expand", js.undefined)
    
    inline def set$filter(value: String): Self = StObject.set(x, "$filter", value.asInstanceOf[js.Any])
    
    inline def set$filterUndefined: Self = StObject.set(x, "$filter", js.undefined)
    
    inline def set$orderby(value: String | Double): Self = StObject.set(x, "$orderby", value.asInstanceOf[js.Any])
    
    inline def set$orderbyUndefined: Self = StObject.set(x, "$orderby", js.undefined)
    
    inline def set$search(value: String): Self = StObject.set(x, "$search", value.asInstanceOf[js.Any])
    
    inline def set$searchUndefined: Self = StObject.set(x, "$search", js.undefined)
    
    inline def set$select(value: String | js.Array[String]): Self = StObject.set(x, "$select", value.asInstanceOf[js.Any])
    
    inline def set$selectUndefined: Self = StObject.set(x, "$select", js.undefined)
    
    inline def set$selectVarargs(value: String*): Self = StObject.set(x, "$select", js.Array(value*))
    
    inline def setDollarDollaraggregation(value: js.Object): Self = StObject.set(x, "$$aggregation", value.asInstanceOf[js.Any])
    
    inline def setDollarDollaraggregationUndefined: Self = StObject.set(x, "$$aggregation", js.undefined)
    
    inline def setDollarDollarcanonicalPath(value: Boolean): Self = StObject.set(x, "$$canonicalPath", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarcanonicalPathUndefined: Self = StObject.set(x, "$$canonicalPath", js.undefined)
    
    inline def setDollarDollargetKeepAliveContext(value: Boolean): Self = StObject.set(x, "$$getKeepAliveContext", value.asInstanceOf[js.Any])
    
    inline def setDollarDollargetKeepAliveContextUndefined: Self = StObject.set(x, "$$getKeepAliveContext", js.undefined)
    
    inline def setDollarDollargroupId(value: String): Self = StObject.set(x, "$$groupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollargroupIdUndefined: Self = StObject.set(x, "$$groupId", js.undefined)
    
    inline def setDollarDollaroperationMode(
      value: OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
    ): Self = StObject.set(x, "$$operationMode", value.asInstanceOf[js.Any])
    
    inline def setDollarDollaroperationModeUndefined: Self = StObject.set(x, "$$operationMode", js.undefined)
    
    inline def setDollarDollarownRequest(value: Boolean): Self = StObject.set(x, "$$ownRequest", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarownRequestUndefined: Self = StObject.set(x, "$$ownRequest", js.undefined)
    
    inline def setDollarDollarpatchWithoutSideEffects(value: Boolean): Self = StObject.set(x, "$$patchWithoutSideEffects", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarpatchWithoutSideEffectsUndefined: Self = StObject.set(x, "$$patchWithoutSideEffects", js.undefined)
    
    inline def setDollarDollarsharedRequest(value: Boolean): Self = StObject.set(x, "$$sharedRequest", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarsharedRequestUndefined: Self = StObject.set(x, "$$sharedRequest", js.undefined)
    
    inline def setDollarDollarupdateGroupId(value: String): Self = StObject.set(x, "$$updateGroupId", value.asInstanceOf[js.Any])
    
    inline def setDollarDollarupdateGroupIdUndefined: Self = StObject.set(x, "$$updateGroupId", js.undefined)
  }
}
