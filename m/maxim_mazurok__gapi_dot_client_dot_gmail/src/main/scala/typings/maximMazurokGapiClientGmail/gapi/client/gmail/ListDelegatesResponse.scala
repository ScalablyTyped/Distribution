package typings.maximMazurokGapiClientGmail.gapi.client.gmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDelegatesResponse extends StObject {
  
  /** List of the user's delegates (with any verification status). If an account doesn't have delegates, this field doesn't appear. */
  var delegates: js.UndefOr[js.Array[Delegate]] = js.undefined
}
object ListDelegatesResponse {
  
  @scala.inline
  def apply(): ListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatesResponse]
  }
  
  @scala.inline
  implicit class ListDelegatesResponseMutableBuilder[Self <: ListDelegatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegates(value: js.Array[Delegate]): Self = StObject.set(x, "delegates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatesUndefined: Self = StObject.set(x, "delegates", js.undefined)
    
    @scala.inline
    def setDelegatesVarargs(value: Delegate*): Self = StObject.set(x, "delegates", js.Array(value :_*))
  }
}
