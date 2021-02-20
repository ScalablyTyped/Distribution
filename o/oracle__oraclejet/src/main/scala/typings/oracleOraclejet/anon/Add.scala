package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Add
  extends /* key */ StringDictionary[js.Any] {
  
  var add: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* collection */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var fetchSize: js.UndefOr[Double] = js.native
  
  var set: js.UndefOr[Boolean] = js.native
  
  var since: js.UndefOr[js.Any] = js.native
  
  var startID: js.UndefOr[js.Any] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* collection */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var until: js.UndefOr[js.Any] = js.native
}
object Add {
  
  @scala.inline
  def apply(): Add = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setError(value: (Add, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    @scala.inline
    def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setSince(value: js.Any): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    @scala.inline
    def setStartID(value: js.Any): Self = StObject.set(x, "startID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIDUndefined: Self = StObject.set(x, "startID", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setSuccess(value: (Add, /* response */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUntil(value: js.Any): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}
