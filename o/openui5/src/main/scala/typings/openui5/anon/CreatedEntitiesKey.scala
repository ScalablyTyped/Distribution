package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiModelOdataOperationModeMod.OperationMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedEntitiesKey extends StObject {
  
  /**
    * **Deprecated**, use `groupId` instead. Sets the batch group id to be used for requests originating from
    * the binding.
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the count mode of the binding; if not specified, the default count mode of the `oModel` is applied.
    */
  var countMode: js.UndefOr[
    typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
  ] = js.undefined
  
  /**
    * A key used in combination with the resolved path of the binding to identify the entities created by the
    * binding's {@link #create} method.
    *
    * **Note:** Different controls or control aggregation bindings to the same collection must have different
    * `createdEntitiesKey` values.
    */
  var createdEntitiesKey: js.UndefOr[String] = js.undefined
  
  /**
    * An optional map of custom query parameters. Custom parameters must not start with `$`.
    */
  var custom: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Value for the OData `$expand` query option parameter which is included in the data request after URL
    * encoding of the given value.
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * Turns on the fault tolerance mode, data is not reset if a back-end request returns an error.
    */
  var faultTolerant: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The group id to be used for requests originating from the binding
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The operation mode of the binding
    */
  var operationMode: js.UndefOr[
    OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
  ] = js.undefined
  
  /**
    * Value for the OData `$select` query option parameter which is included in the data request after URL
    * encoding of the given value.
    */
  var select: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated since 1.102.0, as {@link sap.ui.model.odata.OperationMode.Auto} is deprecated; the threshold
    * that defines how many entries should be fetched at least by the binding if `operationMode` is set to
    * `Auto`.
    */
  var threshold: js.UndefOr[int] = js.undefined
  
  /**
    * Whether the list binding only requests transition messages from the back end. If messages for entities
    * of this collection need to be updated, use {@link sap.ui.model.odata.v2.ODataModel#read} on the parent
    * entity corresponding to the list binding's context, with the parameter `updateAggregatedMessages` set
    * to `true`.
    */
  var transitionMessagesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a preliminary context is used. When set to `true`, the model can bundle the OData calls for dependent
    * bindings into fewer $batch requests. For more information, see {@link https://ui5.sap.com/#/topic/6c47b2b39db9404582994070ec3d57a2#loio62149734b5c24507868e722fe87a75db Optimizing Dependent Bindings}.
    */
  var usePreliminaryContext: js.UndefOr[Boolean] = js.undefined
}
object CreatedEntitiesKey {
  
  inline def apply(): CreatedEntitiesKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatedEntitiesKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedEntitiesKey] (val x: Self) extends AnyVal {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setCountMode(
      value: typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String)
    ): Self = StObject.set(x, "countMode", value.asInstanceOf[js.Any])
    
    inline def setCountModeUndefined: Self = StObject.set(x, "countMode", js.undefined)
    
    inline def setCreatedEntitiesKey(value: String): Self = StObject.set(x, "createdEntitiesKey", value.asInstanceOf[js.Any])
    
    inline def setCreatedEntitiesKeyUndefined: Self = StObject.set(x, "createdEntitiesKey", js.undefined)
    
    inline def setCustom(value: Record[String, String]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFaultTolerant(value: Boolean): Self = StObject.set(x, "faultTolerant", value.asInstanceOf[js.Any])
    
    inline def setFaultTolerantUndefined: Self = StObject.set(x, "faultTolerant", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setOperationMode(
      value: OperationMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OperationMode * / any */ String)
    ): Self = StObject.set(x, "operationMode", value.asInstanceOf[js.Any])
    
    inline def setOperationModeUndefined: Self = StObject.set(x, "operationMode", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setThreshold(value: int): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTransitionMessagesOnly(value: Boolean): Self = StObject.set(x, "transitionMessagesOnly", value.asInstanceOf[js.Any])
    
    inline def setTransitionMessagesOnlyUndefined: Self = StObject.set(x, "transitionMessagesOnly", js.undefined)
    
    inline def setUsePreliminaryContext(value: Boolean): Self = StObject.set(x, "usePreliminaryContext", value.asInstanceOf[js.Any])
    
    inline def setUsePreliminaryContextUndefined: Self = StObject.set(x, "usePreliminaryContext", js.undefined)
  }
}
