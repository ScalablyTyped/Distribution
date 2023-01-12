package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotAfterTime extends StObject {
  
  var notAfterTime: js.UndefOr[String] = js.undefined
  
  var notBeforeTime: js.UndefOr[String] = js.undefined
}
object NotAfterTime {
  
  inline def apply(): NotAfterTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotAfterTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotAfterTime] (val x: Self) extends AnyVal {
    
    inline def setNotAfterTime(value: String): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotAfterTimeUndefined: Self = StObject.set(x, "notAfterTime", js.undefined)
    
    inline def setNotBeforeTime(value: String): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTimeUndefined: Self = StObject.set(x, "notBeforeTime", js.undefined)
  }
}
