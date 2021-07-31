package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lang extends StObject {
  
  var id: String
  
  var lang: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object Lang {
  
  @scala.inline
  def apply(id: String, lang: String): Lang = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
  
  @scala.inline
  implicit class LangMutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
