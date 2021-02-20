package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMetricDescriptorsResponse extends StObject {
  
  /** The metric descriptors that are available to the project and that match the value of filter, if present. */
  var metricDescriptors: js.UndefOr[js.Array[MetricDescriptor]] = js.native
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListMetricDescriptorsResponse {
  
  @scala.inline
  def apply(): ListMetricDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMetricDescriptorsResponse]
  }
  
  @scala.inline
  implicit class ListMetricDescriptorsResponseMutableBuilder[Self <: ListMetricDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricDescriptors(value: js.Array[MetricDescriptor]): Self = StObject.set(x, "metricDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDescriptorsUndefined: Self = StObject.set(x, "metricDescriptors", js.undefined)
    
    @scala.inline
    def setMetricDescriptorsVarargs(value: MetricDescriptor*): Self = StObject.set(x, "metricDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
