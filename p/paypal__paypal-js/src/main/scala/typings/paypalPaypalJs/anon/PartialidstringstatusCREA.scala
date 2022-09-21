package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.APPROVED
import typings.paypalPaypalJs.paypalPaypalJsStrings.CREATED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  id :string,   status :'CREATED' | 'APPROVED'}> */
trait PartialidstringstatusCREA extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[CREATED | APPROVED] = js.undefined
}
object PartialidstringstatusCREA {
  
  inline def apply(): PartialidstringstatusCREA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialidstringstatusCREA]
  }
  
  extension [Self <: PartialidstringstatusCREA](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: CREATED | APPROVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
