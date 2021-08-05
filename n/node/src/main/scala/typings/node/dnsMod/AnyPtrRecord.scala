package typings.node.dnsMod

import typings.node.nodeStrings.PTR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyPtrRecord
  extends StObject
     with AnyRecord {
  
  var `type`: PTR
  
  var value: String
}
object AnyPtrRecord {
  
  inline def apply(value: String): AnyPtrRecord = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PTR")
    __obj.asInstanceOf[AnyPtrRecord]
  }
  
  extension [Self <: AnyPtrRecord](x: Self) {
    
    inline def setType(value: PTR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
