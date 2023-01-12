package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PFXJson extends StObject {
  
  var authSafe: ContentInfoJson
  
  var macData: js.UndefOr[MacDataJson] = js.undefined
  
  var version: Double
}
object PFXJson {
  
  inline def apply(authSafe: ContentInfoJson, version: Double): PFXJson = {
    val __obj = js.Dynamic.literal(authSafe = authSafe.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PFXJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PFXJson] (val x: Self) extends AnyVal {
    
    inline def setAuthSafe(value: ContentInfoJson): Self = StObject.set(x, "authSafe", value.asInstanceOf[js.Any])
    
    inline def setMacData(value: MacDataJson): Self = StObject.set(x, "macData", value.asInstanceOf[js.Any])
    
    inline def setMacDataUndefined: Self = StObject.set(x, "macData", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
