package typings.pkijs.anon

import typings.pkijs.pkijsInts.`0`
import typings.pkijs.pkijsInts.`3`
import typings.pkijs.pkijsInts.`4`
import typings.pkijs.pkijsInts.`7`
import typings.pkijs.pkijsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var `type`: `0` | `3` | `4` | `7` | `8`
  
  var value: Any
}
object Value {
  
  inline def apply(`type`: `0` | `3` | `4` | `7` | `8`, value: Any): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: `0` | `3` | `4` | `7` | `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
