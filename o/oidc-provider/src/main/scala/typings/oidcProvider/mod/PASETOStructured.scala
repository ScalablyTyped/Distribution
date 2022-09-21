package typings.oidcProvider.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PASETOStructured extends StObject {
  
  var assertion: js.UndefOr[String | Buffer] = js.undefined
  
  var footer: js.UndefOr[UnknownObject] = js.undefined
  
  var payload: UnknownObject
}
object PASETOStructured {
  
  inline def apply(payload: UnknownObject): PASETOStructured = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PASETOStructured]
  }
  
  extension [Self <: PASETOStructured](x: Self) {
    
    inline def setAssertion(value: String | Buffer): Self = StObject.set(x, "assertion", value.asInstanceOf[js.Any])
    
    inline def setAssertionUndefined: Self = StObject.set(x, "assertion", js.undefined)
    
    inline def setFooter(value: UnknownObject): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setPayload(value: UnknownObject): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
