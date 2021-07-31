package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangReq extends StObject {
  
  var lang: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object LangReq {
  
  @scala.inline
  def apply(lang: String): LangReq = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangReq]
  }
  
  @scala.inline
  implicit class LangReqMutableBuilder[Self <: LangReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
