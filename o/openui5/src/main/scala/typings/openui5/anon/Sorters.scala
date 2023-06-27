package typings.openui5.anon

import typings.openui5.sapUiModelFilterMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorters extends StObject {
  
  /**
    * Deprecated - use `groupId` instead
    */
  var batchGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, `sPath` has to be relative to the path given with the context.
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * A callback function which is called when the request failed. The handler can have the parameter: `oError`
    * which contains additional error information.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * An array of filters to be included in the request URL
    */
  var filters: js.UndefOr[js.Array[default]] = js.undefined
  
  /**
    * ID of a request group; requests belonging to the same group will be bundled in one batch request
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * An array of sorters to be included in the request URL
    */
  var sorters: js.UndefOr[js.Array[typings.openui5.sapUiModelSorterMod.default]] = js.undefined
  
  /**
    * A callback function which is called when the data has been successfully retrieved. The handler can have
    * the following parameters: `oData` and `response`. The `oData` parameter contains the data of the retrieved
    * data. The `response` parameter contains further information about the response of the request.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * Whether messages for child entities belonging to the same business object as the requested or changed
    * resources are updated. It is considered only if {@link sap.ui.model.odata.MessageScope.BusinessObject }
    * is set using {@link #setMessageScope} and if the OData service supports message scope.
    */
  var updateAggregatedMessages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A map containing the parameters that will be passed as query strings
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object Sorters {
  
  inline def apply(): Sorters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sorters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sorters] (val x: Self) extends AnyVal {
    
    inline def setBatchGroupId(value: String): Self = StObject.set(x, "batchGroupId", value.asInstanceOf[js.Any])
    
    inline def setBatchGroupIdUndefined: Self = StObject.set(x, "batchGroupId", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilters(value: js.Array[default]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: default*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setSorters(value: js.Array[typings.openui5.sapUiModelSorterMod.default]): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    inline def setSortersVarargs(value: typings.openui5.sapUiModelSorterMod.default*): Self = StObject.set(x, "sorters", js.Array(value*))
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUpdateAggregatedMessages(value: Boolean): Self = StObject.set(x, "updateAggregatedMessages", value.asInstanceOf[js.Any])
    
    inline def setUpdateAggregatedMessagesUndefined: Self = StObject.set(x, "updateAggregatedMessages", js.undefined)
    
    inline def setUrlParameters(value: Record[String, String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
