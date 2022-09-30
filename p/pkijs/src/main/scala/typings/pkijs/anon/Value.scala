package typings.pkijs.anon

import typings.pkijs.pkijsInts.`2`
import typings.pkijs.pkijsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var `type`: typings.pkijs.pkijsInts.`1` | `2` | `6`
  
  var value: String
}
object Value {
  
  inline def apply(`type`: typings.pkijs.pkijsInts.`1` | `2` | `6`, value: String): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: typings.pkijs.pkijsInts.`1` | `2` | `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
