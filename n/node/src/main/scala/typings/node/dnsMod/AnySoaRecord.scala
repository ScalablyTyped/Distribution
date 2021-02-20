package typings.node.dnsMod

import typings.node.nodeStrings.SOA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnySoaRecord
  extends SoaRecord
     with AnyRecord {
  
  var `type`: SOA = js.native
}
object AnySoaRecord {
  
  @scala.inline
  def apply(
    expire: Double,
    hostmaster: String,
    minttl: Double,
    nsname: String,
    refresh: Double,
    retry: Double,
    serial: Double,
    `type`: SOA
  ): AnySoaRecord = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], hostmaster = hostmaster.asInstanceOf[js.Any], minttl = minttl.asInstanceOf[js.Any], nsname = nsname.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnySoaRecord]
  }
  
  @scala.inline
  implicit class AnySoaRecordMutableBuilder[Self <: AnySoaRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SOA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
