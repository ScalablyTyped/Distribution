package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDnsSrvRecord extends DomainDnsRecord {
  
  // Value to use when configuring the Target property of the SRV record at the DNS host.
  var nameTarget: js.UndefOr[NullableOption[String]] = js.native
  
  // Value to use when configuring the port property of the SRV record at the DNS host.
  var port: js.UndefOr[NullableOption[Double]] = js.native
  
  // Value to use when configuring the priority property of the SRV record at the DNS host.
  var priority: js.UndefOr[NullableOption[Double]] = js.native
  
  // Value to use when configuring the protocol property of the SRV record at the DNS host.
  var protocol: js.UndefOr[NullableOption[String]] = js.native
  
  // Value to use when configuring the service property of the SRV record at the DNS host.
  var service: js.UndefOr[NullableOption[String]] = js.native
  
  // Value to use when configuring the weight property of the SRV record at the DNS host.
  var weight: js.UndefOr[NullableOption[Double]] = js.native
}
object DomainDnsSrvRecord {
  
  @scala.inline
  def apply(): DomainDnsSrvRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsSrvRecord]
  }
  
  @scala.inline
  implicit class DomainDnsSrvRecordMutableBuilder[Self <: DomainDnsSrvRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameTarget(value: NullableOption[String]): Self = StObject.set(x, "nameTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameTargetNull: Self = StObject.set(x, "nameTarget", null)
    
    @scala.inline
    def setNameTargetUndefined: Self = StObject.set(x, "nameTarget", js.undefined)
    
    @scala.inline
    def setPort(value: NullableOption[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNull: Self = StObject.set(x, "port", null)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPriority(value: NullableOption[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProtocol(value: NullableOption[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNull: Self = StObject.set(x, "service", null)
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setWeight(value: NullableOption[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightNull: Self = StObject.set(x, "weight", null)
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
