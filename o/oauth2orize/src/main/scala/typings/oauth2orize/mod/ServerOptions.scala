package typings.oauth2orize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  var loadTransaction: Boolean
  
  var store: js.Any
}
object ServerOptions {
  
  @scala.inline
  def apply(loadTransaction: Boolean, store: js.Any): ServerOptions = {
    val __obj = js.Dynamic.literal(loadTransaction = loadTransaction.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadTransaction(value: Boolean): Self = StObject.set(x, "loadTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
