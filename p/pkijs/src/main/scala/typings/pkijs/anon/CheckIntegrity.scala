package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIntegrity extends StObject {
  
  var checkIntegrity: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object CheckIntegrity {
  
  inline def apply(): CheckIntegrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIntegrity]
  }
  
  extension [Self <: CheckIntegrity](x: Self) {
    
    inline def setCheckIntegrity(value: Boolean): Self = StObject.set(x, "checkIntegrity", value.asInstanceOf[js.Any])
    
    inline def setCheckIntegrityUndefined: Self = StObject.set(x, "checkIntegrity", js.undefined)
    
    inline def setPassword(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
