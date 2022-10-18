package typings.pkijs.anon

import typings.pkijs.pkijsInts.`1`
import typings.pkijs.pkijsInts.`2`
import typings.pkijs.pkijsInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: `1` | `2` | `6`
  
  var value: String
}
object Type {
  
  inline def apply(`type`: `1` | `2` | `6`, value: String): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: `1` | `2` | `6`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
