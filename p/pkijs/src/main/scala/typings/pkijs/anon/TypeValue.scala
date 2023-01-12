package typings.pkijs.anon

import typings.pkijs.pkijsInts.`3`
import typings.pkijs.pkijsInts.`4`
import typings.pkijs.pkijsInts.`7`
import typings.pkijs.pkijsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue extends StObject {
  
  var `type`: typings.pkijs.pkijsInts.`0` | `3` | `4` | `7` | `8`
  
  var value: Any
}
object TypeValue {
  
  inline def apply(`type`: typings.pkijs.pkijsInts.`0` | `3` | `4` | `7` | `8`, value: Any): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.pkijs.pkijsInts.`0` | `3` | `4` | `7` | `8`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
