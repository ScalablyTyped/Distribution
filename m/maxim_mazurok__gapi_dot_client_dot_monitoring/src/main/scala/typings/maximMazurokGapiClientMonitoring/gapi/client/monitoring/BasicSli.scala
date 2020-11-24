package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicSli extends js.Object {
  
  /** Good service is defined to be the count of requests made to this service that return successfully. */
  var availability: js.UndefOr[js.Any] = js.native
  
  /** Good service is defined to be the count of requests made to this service that are fast enough with respect to latency.threshold. */
  var latency: js.UndefOr[LatencyCriteria] = js.native
  
  /**
    * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations will not be used to calculate performance for this SLI. If omitted, this SLI applies to
    * all locations in which the Service has activity. For service types that don't support breaking down by location, setting this field will result in an error.
    */
  var location: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not be used to calculate performance for this SLI. If omitted, this SLI applies to all the
    * Service's methods. For service types that don't support breaking down by method, setting this field will result in an error.
    */
  var method: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API versions will not be used to calculate performance for this SLI. If omitted, this SLI
    * applies to all API versions. For service types that don't support breaking down by version, setting this field will result in an error.
    */
  var version: js.UndefOr[js.Array[String]] = js.native
}
object BasicSli {
  
  @scala.inline
  def apply(): BasicSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicSli]
  }
  
  @scala.inline
  implicit class BasicSliOps[Self <: BasicSli] (val x: Self) extends AnyVal {
    
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
    def setAvailability(value: js.Any): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setLatency(value: LatencyCriteria): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: String*): Self = this.set("location", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: js.Array[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: String*): Self = this.set("method", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: js.Array[String]): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setVersionVarargs(value: String*): Self = this.set("version", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: js.Array[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
