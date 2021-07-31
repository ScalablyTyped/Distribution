package typings.node.dnsMod

import typings.node.nodeStrings.NAPTR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyNaptrRecord
  extends StObject
     with NaptrRecord
     with AnyRecord {
  
  var `type`: NAPTR
}
object AnyNaptrRecord {
  
  @scala.inline
  def apply(
    flags: String,
    order: Double,
    preference: Double,
    regexp: String,
    replacement: String,
    service: String
  ): AnyNaptrRecord = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preference = preference.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], replacement = replacement.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NAPTR")
    __obj.asInstanceOf[AnyNaptrRecord]
  }
  
  @scala.inline
  implicit class AnyNaptrRecordMutableBuilder[Self <: AnyNaptrRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NAPTR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
