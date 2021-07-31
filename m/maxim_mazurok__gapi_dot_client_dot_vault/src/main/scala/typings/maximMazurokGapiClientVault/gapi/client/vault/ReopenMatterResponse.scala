package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReopenMatterResponse extends StObject {
  
  /** The updated matter, with state OPEN. */
  var matter: js.UndefOr[Matter] = js.undefined
}
object ReopenMatterResponse {
  
  @scala.inline
  def apply(): ReopenMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReopenMatterResponse]
  }
  
  @scala.inline
  implicit class ReopenMatterResponseMutableBuilder[Self <: ReopenMatterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatter(value: Matter): Self = StObject.set(x, "matter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterUndefined: Self = StObject.set(x, "matter", js.undefined)
  }
}
