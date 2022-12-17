package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriType extends StObject {
  
  var oriType: js.UndefOr[String] = js.undefined
  
  var oriValue: js.UndefOr[String] = js.undefined
}
object OriType {
  
  inline def apply(): OriType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriType]
  }
  
  extension [Self <: OriType](x: Self) {
    
    inline def setOriType(value: String): Self = StObject.set(x, "oriType", value.asInstanceOf[js.Any])
    
    inline def setOriTypeUndefined: Self = StObject.set(x, "oriType", js.undefined)
    
    inline def setOriValue(value: String): Self = StObject.set(x, "oriValue", value.asInstanceOf[js.Any])
    
    inline def setOriValueUndefined: Self = StObject.set(x, "oriValue", js.undefined)
  }
}
