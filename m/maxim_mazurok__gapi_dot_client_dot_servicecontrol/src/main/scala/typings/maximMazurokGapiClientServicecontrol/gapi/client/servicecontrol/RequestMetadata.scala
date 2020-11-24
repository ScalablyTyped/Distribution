package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestMetadata extends js.Object {
  
  /**
    * The IP address of the caller. For caller from internet, this will be public IPv4 or IPv6 address. For caller from a Compute Engine VM with external IP address, this will be the VM's
    * external IP address. For caller from a Compute Engine VM without external IP address, if the VM is in the same organization (or project) as the accessed resource, `caller_ip` will
    * be the VM's internal IPv4 address, otherwise the `caller_ip` will be redacted to "gce-internal-ip". See https://cloud.google.com/compute/docs/vpc/ for more information.
    */
  var callerIp: js.UndefOr[String] = js.native
  
  /**
    * The network of the caller. Set only if the network host project is part of the same GCP organization (or project) as the accessed resource. See
    * https://cloud.google.com/compute/docs/vpc/ for more information. This is a scheme-less URI full resource name. For example:
    * "//compute.googleapis.com/projects/PROJECT_ID/global/networks/NETWORK_ID"
    */
  var callerNetwork: js.UndefOr[String] = js.native
  
  /**
    * The user agent of the caller. This information is not authenticated and should be treated accordingly. For example: + `google-api-python-client/1.4.0`: The request was made by the
    * Google API client for Python. + `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`: The request was made by the Google Cloud SDK CLI (gcloud). + `AppEngine-Google;
    * (+http://code.google.com/appengine; appid: s~my-project`: The request was made from the `my-project` App Engine app. NOLINT
    */
  var callerSuppliedUserAgent: js.UndefOr[String] = js.native
  
  /**
    * The destination of a network activity, such as accepting a TCP connection. In a multi hop network activity, the destination represents the receiver of the last hop. Only two fields
    * are used in this message, Peer.port and Peer.ip. These fields are optionally populated by those services utilizing the IAM condition feature.
    */
  var destinationAttributes: js.UndefOr[Peer] = js.native
  
  /**
    * Request attributes used in IAM condition evaluation. This field contains request attributes like request time and access levels associated with the request. To get the whole view of
    * the attributes used in IAM condition evaluation, the user must also look into `AuditLog.authentication_info.resource_attributes`.
    */
  var requestAttributes: js.UndefOr[Request] = js.native
}
object RequestMetadata {
  
  @scala.inline
  def apply(): RequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestMetadata]
  }
  
  @scala.inline
  implicit class RequestMetadataOps[Self <: RequestMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallerIp(value: String): Self = this.set("callerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerIp: Self = this.set("callerIp", js.undefined)
    
    @scala.inline
    def setCallerNetwork(value: String): Self = this.set("callerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerNetwork: Self = this.set("callerNetwork", js.undefined)
    
    @scala.inline
    def setCallerSuppliedUserAgent(value: String): Self = this.set("callerSuppliedUserAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallerSuppliedUserAgent: Self = this.set("callerSuppliedUserAgent", js.undefined)
    
    @scala.inline
    def setDestinationAttributes(value: Peer): Self = this.set("destinationAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationAttributes: Self = this.set("destinationAttributes", js.undefined)
    
    @scala.inline
    def setRequestAttributes(value: Request): Self = this.set("requestAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestAttributes: Self = this.set("requestAttributes", js.undefined)
  }
}
