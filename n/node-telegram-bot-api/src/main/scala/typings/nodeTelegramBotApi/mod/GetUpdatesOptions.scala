package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUpdatesOptions extends StObject {
  
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object GetUpdatesOptions {
  
  @scala.inline
  def apply(): GetUpdatesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUpdatesOptions]
  }
  
  @scala.inline
  implicit class GetUpdatesOptionsMutableBuilder[Self <: GetUpdatesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed_updates(value: js.Array[String]): Self = StObject.set(x, "allowed_updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_updatesUndefined: Self = StObject.set(x, "allowed_updates", js.undefined)
    
    @scala.inline
    def setAllowed_updatesVarargs(value: String*): Self = StObject.set(x, "allowed_updates", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
