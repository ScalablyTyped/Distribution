package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.node.dnsMod.AnyARecord
  - typings.node.dnsMod.AnyAaaaRecord
  - typings.node.dnsMod.AnyCnameRecord
  - typings.node.dnsMod.AnyMxRecord
  - typings.node.dnsMod.AnyNaptrRecord
  - typings.node.dnsMod.AnyNsRecord
  - typings.node.dnsMod.AnyPtrRecord
  - typings.node.dnsMod.AnySoaRecord
  - typings.node.dnsMod.AnySrvRecord
  - typings.node.dnsMod.AnyTxtRecord
*/
trait AnyRecord extends StObject
object AnyRecord {
  
  inline def AnyARecord(address: String, ttl: Double): typings.node.dnsMod.AnyARecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("A")
    __obj.asInstanceOf[typings.node.dnsMod.AnyARecord]
  }
  
  inline def AnyAaaaRecord(address: String, ttl: Double): typings.node.dnsMod.AnyAaaaRecord = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AAAA")
    __obj.asInstanceOf[typings.node.dnsMod.AnyAaaaRecord]
  }
  
  inline def AnyCnameRecord(value: String): typings.node.dnsMod.AnyCnameRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CNAME")
    __obj.asInstanceOf[typings.node.dnsMod.AnyCnameRecord]
  }
  
  inline def AnyMxRecord(exchange: String, priority: Double): typings.node.dnsMod.AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MX")
    __obj.asInstanceOf[typings.node.dnsMod.AnyMxRecord]
  }
  
  inline def AnyNaptrRecord(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String
  ): typings.node.dnsMod.AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NAPTR")
    __obj.asInstanceOf[typings.node.dnsMod.AnyNaptrRecord]
  }
  
  inline def AnyNsRecord(value: String): typings.node.dnsMod.AnyNsRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NS")
    __obj.asInstanceOf[typings.node.dnsMod.AnyNsRecord]
  }
  
  inline def AnyPtrRecord(value: String): typings.node.dnsMod.AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PTR")
    __obj.asInstanceOf[typings.node.dnsMod.AnyPtrRecord]
  }
  
  inline def AnySoaRecord(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): typings.node.dnsMod.AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SOA")
    __obj.asInstanceOf[typings.node.dnsMod.AnySoaRecord]
  }
  
  inline def AnySrvRecord(name: String, port: Double, priority: Double, weight: Double): typings.node.dnsMod.AnySrvRecord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SRV")
    __obj.asInstanceOf[typings.node.dnsMod.AnySrvRecord]
  }
  
  inline def AnyTxtRecord(entries: js.Array[String]): typings.node.dnsMod.AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TXT")
    __obj.asInstanceOf[typings.node.dnsMod.AnyTxtRecord]
  }
}
