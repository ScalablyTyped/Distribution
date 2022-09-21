package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDelegatesResponse extends StObject {
  
  /** List of the user's delegates (with any verification status). If an account doesn't have delegates, this field doesn't appear. */
  var delegates: js.UndefOr[js.Array[Delegate]] = js.undefined
}
object ListDelegatesResponse {
  
  inline def apply(): ListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatesResponse]
  }
  
  extension [Self <: ListDelegatesResponse](x: Self) {
    
    inline def setDelegates(value: js.Array[Delegate]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    inline def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    inline def setDelegatesVarargs(value: Delegate*): Self = StObject.set(x, "delegates", js.Array(value*))
  }
}
