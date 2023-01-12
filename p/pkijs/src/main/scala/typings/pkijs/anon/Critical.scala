package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Critical extends StObject {
  
  var critical: js.UndefOr[String] = js.undefined
  
  var extnID: js.UndefOr[String] = js.undefined
  
  var extnValue: js.UndefOr[String] = js.undefined
}
object Critical {
  
  inline def apply(): Critical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Critical]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Critical] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: String): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtnID(value: String): Self = StObject.set(x, "extnID", value.asInstanceOf[js.Any])
    
    inline def setExtnIDUndefined: Self = StObject.set(x, "extnID", js.undefined)
    
    inline def setExtnValue(value: String): Self = StObject.set(x, "extnValue", value.asInstanceOf[js.Any])
    
    inline def setExtnValueUndefined: Self = StObject.set(x, "extnValue", js.undefined)
  }
}
