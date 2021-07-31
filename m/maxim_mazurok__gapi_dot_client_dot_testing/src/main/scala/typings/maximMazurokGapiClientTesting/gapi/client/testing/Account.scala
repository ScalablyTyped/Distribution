package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /** An automatic google login account. */
  var googleAuto: js.UndefOr[js.Any] = js.undefined
}
object Account {
  
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleAuto(value: js.Any): Self = StObject.set(x, "googleAuto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleAutoUndefined: Self = StObject.set(x, "googleAuto", js.undefined)
  }
}
