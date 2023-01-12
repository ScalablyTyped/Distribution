package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParkMessageDesc extends StObject {
  
  var subject: js.UndefOr[Double] = js.undefined
  
  var text: String
  
  var `type`: ParkMessageType
}
object ParkMessageDesc {
  
  inline def apply(text: String, `type`: ParkMessageType): ParkMessageDesc = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParkMessageDesc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParkMessageDesc] (val x: Self) extends AnyVal {
    
    inline def setSubject(value: Double): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParkMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
