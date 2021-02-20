package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoaRecord extends StObject {
  
  var expire: Double = js.native
  
  var hostmaster: String = js.native
  
  var minttl: Double = js.native
  
  var nsname: String = js.native
  
  var refresh: Double = js.native
  
  var retry: Double = js.native
  
  var serial: Double = js.native
}
object SoaRecord {
  
  @scala.inline
  def apply(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double
  ): SoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoaRecord]
  }
  
  @scala.inline
  implicit class SoaRecordMutableBuilder[Self <: SoaRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostmaster(value: String): Self = StObject.set(x, "hostmaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinttl(value: Double): Self = StObject.set(x, "minttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsname(value: String): Self = StObject.set(x, "nsname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: Double): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerial(value: Double): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
  }
}
