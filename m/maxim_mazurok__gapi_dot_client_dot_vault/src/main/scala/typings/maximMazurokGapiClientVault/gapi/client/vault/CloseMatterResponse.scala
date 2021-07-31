package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseMatterResponse extends StObject {
  
  /** The updated matter, with state CLOSED. */
  var matter: js.UndefOr[Matter] = js.undefined
}
object CloseMatterResponse {
  
  @scala.inline
  def apply(): CloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseMatterResponse]
  }
  
  @scala.inline
  implicit class CloseMatterResponseMutableBuilder[Self <: CloseMatterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatter(value: Matter): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
