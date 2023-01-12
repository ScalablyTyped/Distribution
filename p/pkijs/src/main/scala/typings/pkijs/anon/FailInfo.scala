package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailInfo extends StObject {
  
  var failInfo: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var statusStrings: js.UndefOr[String] = js.undefined
}
object FailInfo {
  
  inline def apply(): FailInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailInfo] (val x: Self) extends AnyVal {
    
    inline def setFailInfo(value: String): Self = StObject.set(x, "failInfo", value.asInstanceOf[js.Any])
    
    inline def setFailInfoUndefined: Self = StObject.set(x, "failInfo", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusStrings(value: String): Self = StObject.set(x, "statusStrings", value.asInstanceOf[js.Any])
    
    inline def setStatusStringsUndefined: Self = StObject.set(x, "statusStrings", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
