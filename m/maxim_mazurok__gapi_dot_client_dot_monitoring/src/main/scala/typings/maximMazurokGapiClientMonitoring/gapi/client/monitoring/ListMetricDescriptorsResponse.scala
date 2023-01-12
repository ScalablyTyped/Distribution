package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMetricDescriptorsResponse extends StObject {
  
  /** The metric descriptors that are available to the project and that match the value of filter, if present. */
  var metricDescriptors: js.UndefOr[js.Array[MetricDescriptor]] = js.undefined
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListMetricDescriptorsResponse {
  
  inline def apply(): ListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricDescriptorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMetricDescriptorsResponse] (val x: Self) extends AnyVal {
    
    inline def setMetricDescriptors(value: js.Array[MetricDescriptor]): Self = StObject.set(x, "metricDescriptors", value.asInstanceOf[js.Any])
    
    inline def setMetricDescriptorsUndefined: Self = StObject.set(x, "metricDescriptors", js.undefined)
    
    inline def setMetricDescriptorsVarargs(value: MetricDescriptor*): Self = StObject.set(x, "metricDescriptors", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
