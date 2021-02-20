package typings.node.dnsMod

import typings.node.nodeStrings.MX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyMxRecord
  extends MxRecord
     with AnyRecord {
  
  var `type`: MX = js.native
}
object AnyMxRecord {
  
  @scala.inline
  def apply(exchange: String, priority: Double, `type`: MX): AnyMxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyMxRecord]
  }
  
  @scala.inline
  implicit class AnyMxRecordMutableBuilder[Self <: AnyMxRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MX): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
