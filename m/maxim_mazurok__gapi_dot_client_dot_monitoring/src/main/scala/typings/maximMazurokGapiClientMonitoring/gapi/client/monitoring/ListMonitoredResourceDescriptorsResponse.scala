package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMonitoredResourceDescriptorsResponse extends StObject {
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The monitored resource descriptors that are available to this project and that match filter, if present. */
  var resourceDescriptors: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.native
}
object ListMonitoredResourceDescriptorsResponse {
  
  @scala.inline
  def apply(): ListMonitoredResourceDescriptorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMonitoredResourceDescriptorsResponse]
  }
  
  @scala.inline
  implicit class ListMonitoredResourceDescriptorsResponseMutableBuilder[Self <: ListMonitoredResourceDescriptorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setResourceDescriptors(value: js.Array[MonitoredResourceDescriptor]): Self = StObject.set(x, "resourceDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDescriptorsUndefined: Self = StObject.set(x, "resourceDescriptors", js.undefined)
    
    @scala.inline
    def setResourceDescriptorsVarargs(value: MonitoredResourceDescriptor*): Self = StObject.set(x, "resourceDescriptors", js.Array(value :_*))
  }
}
