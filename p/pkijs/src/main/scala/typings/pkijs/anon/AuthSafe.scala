package typings.pkijs.anon

import typings.pkijs.mod.ContentInfoSchema
import typings.pkijs.mod.MacDataSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthSafe extends StObject {
  
  var authSafe: js.UndefOr[ContentInfoSchema] = js.undefined
  
  var macData: js.UndefOr[MacDataSchema] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object AuthSafe {
  
  inline def apply(): AuthSafe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthSafe]
  }
  
  extension [Self <: AuthSafe](x: Self) {
    
    inline def setAuthSafe(value: ContentInfoSchema): Self = StObject.set(x, "authSafe", value.asInstanceOf[js.Any])
    
    inline def setAuthSafeUndefined: Self = StObject.set(x, "authSafe", js.undefined)
    
    inline def setMacData(value: MacDataSchema): Self = StObject.set(x, "macData", value.asInstanceOf[js.Any])
    
    inline def setMacDataUndefined: Self = StObject.set(x, "macData", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
