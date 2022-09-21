package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseMatterResponse extends StObject {
  
  /** The updated matter, with state **CLOSED**. */
  var matter: js.UndefOr[Matter] = js.undefined
}
object CloseMatterResponse {
  
  inline def apply(): CloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseMatterResponse]
  }
  
  extension [Self <: CloseMatterResponse](x: Self) {
    
    inline def setMatter(value: Matter): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    inline def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
