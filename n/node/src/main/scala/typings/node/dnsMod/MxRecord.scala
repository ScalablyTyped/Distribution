package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MxRecord extends StObject {
  
  var exchange: String
  
  var priority: Double
}
object MxRecord {
  
  @scala.inline
  def apply(exchange: String, priority: Double): MxRecord = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[MxRecord]
  }
  
  @scala.inline
  implicit class MxRecordMutableBuilder[Self <: MxRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
