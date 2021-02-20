package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Success
  extends /* key */ StringDictionary[js.Any] {
  
  var error: js.UndefOr[js.Function3[/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[_]], Unit]] = js.native
}
object Success {
  
  @scala.inline
  def apply(): Success = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: (/* xhr */ js.Any, /* status */ js.Any, /* error */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* json */ js.UndefOr[js.Array[_]] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
