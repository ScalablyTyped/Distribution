package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  /**
    * true for asynchronous requests.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified the sPath has to be is relative to the path given with the context.
    */
  var context: js.UndefOr[js.Object] = js.undefined
  
  /**
    * a callback function which is called when the request failed. The handler can have the parameter: oError
    * which contains additional error information.
    */
  var error: js.UndefOr[js.Function] = js.undefined
  
  /**
    * an array of sap.ui.model.Filter to be included in the request URL
    */
  var filters: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * an array of sap.ui.model.Sorter to be included in the request URL
    */
  var sorters: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * a callback function which is called when the data has been successfully retrieved. The handler can have
    * the following parameters: oData and response.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * A map containing the parameters that will be passed as query strings
    */
  var urlParameters: js.UndefOr[Record[String, String]] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setError(value: js.Function): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilters(value: js.Array[Any]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Any*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setSorters(value: js.Array[Any]): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
    
    inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
    
    inline def setSortersVarargs(value: Any*): Self = StObject.set(x, "sorters", js.Array(value*))
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrlParameters(value: Record[String, String]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
    
    inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
  }
}
