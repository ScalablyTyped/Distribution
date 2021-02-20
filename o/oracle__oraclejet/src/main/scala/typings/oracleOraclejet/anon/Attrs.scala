package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs
  extends /* key */ StringDictionary[js.Any] {
  
  var attrs: js.UndefOr[js.Object] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var patch: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.native
  
  var valdiate: js.UndefOr[Boolean] = js.native
  
  @JSName("wait")
  var wait_FAttrs: js.UndefOr[Boolean] = js.native
}
object Attrs {
  
  @scala.inline
  def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: js.Object): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setError(value: (Attrs, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setSuccess(value: (Attrs, /* response */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setValdiate(value: Boolean): Self = StObject.set(x, "valdiate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValdiateUndefined: Self = StObject.set(x, "valdiate", js.undefined)
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
