package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
}
object Error {
  
  @scala.inline
  def apply(): Error = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: (Error, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(value: (Error, /* response */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
