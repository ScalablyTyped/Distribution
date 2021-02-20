package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRangeRequest extends StObject {
  
  /**
    * Required. The prefix length of the IP range. Use usual CIDR range notation. For example, '30' to find unused x.x.x.x/30 CIDR range. Actual range will be determined using allocated
    * range for the consumer peered network and returned in the result.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  
  /**
    * Network name in the consumer project. This network must have been already peered with a shared VPC network using CreateConnection method. Must be in a form
    * 'projects/{project}/global/networks/{network}'. {project} is a project number, as in '12345' {network} is network name.
    */
  var network: js.UndefOr[String] = js.native
}
object SearchRangeRequest {
  
  @scala.inline
  def apply(): SearchRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRangeRequest]
  }
  
  @scala.inline
  implicit class SearchRangeRequestMutableBuilder[Self <: SearchRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpPrefixLength(value: Double): Self = StObject.set(x, "ipPrefixLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpPrefixLengthUndefined: Self = StObject.set(x, "ipPrefixLength", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
  }
}
