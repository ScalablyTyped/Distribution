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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriType] (val x: Self) extends AnyVal {
    
    inline def setOriType(value: String): Self = StObject.set(x, "oriType", value.asInstanceOf[js.Any])
    
    inline def setOriTypeUndefined: Self = StObject.set(x, "oriType", js.undefined)
    
    inline def setOriValue(value: String): Self = StObject.set(x, "oriValue", value.asInstanceOf[js.Any])
    
    inline def setOriValueUndefined: Self = StObject.set(x, "oriValue", js.undefined)
  }
}
