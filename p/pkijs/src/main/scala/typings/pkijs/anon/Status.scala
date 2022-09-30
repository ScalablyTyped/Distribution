package typings.pkijs.anon

import typings.pkijs.mod.ContentInfoSchema
import typings.pkijs.mod.PKIStatusInfoSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: js.UndefOr[PKIStatusInfoSchema] = js.undefined
  
  var timeStampToken: js.UndefOr[ContentInfoSchema] = js.undefined
}
object Status {
  
  inline def apply(): Status = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: PKIStatusInfoSchema): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimeStampToken(value: ContentInfoSchema): Self = StObject.set(x, "timeStampToken", value.asInstanceOf[js.Any])
    
    inline def setTimeStampTokenUndefined: Self = StObject.set(x, "timeStampToken", js.undefined)
  }
}
