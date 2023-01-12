package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDnsSrvRecord
  extends StObject
     with DomainDnsRecord {
  
  // Value to use when configuring the Target property of the SRV record at the DNS host.
  var nameTarget: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value to use when configuring the port property of the SRV record at the DNS host.
  var port: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Value to use when configuring the priority property of the SRV record at the DNS host.
  var priority: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Value to use when configuring the protocol property of the SRV record at the DNS host.
  var protocol: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value to use when configuring the service property of the SRV record at the DNS host.
  var service: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Value to use when configuring the weight property of the SRV record at the DNS host.
  var weight: js.UndefOr[NullableOption[Double]] = js.undefined
}
object DomainDnsSrvRecord {
  
  inline def apply(): DomainDnsSrvRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsSrvRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainDnsSrvRecord] (val x: Self) extends AnyVal {
    
    inline def setNameTarget(value: NullableOption[String]): Self = StObject.set(x, "nameTarget", value.asInstanceOf[js.Any])
    
    inline def setNameTargetNull: Self = StObject.set(x, "nameTarget", null)
    
    inline def setNameTargetUndefined: Self = StObject.set(x, "nameTarget", js.undefined)
    
    inline def setPort(value: NullableOption[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPriority(value: NullableOption[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProtocol(value: NullableOption[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setService(value: NullableOption[String]): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setWeight(value: NullableOption[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
