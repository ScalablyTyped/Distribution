package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserProfilePhotosOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Double] = js.native
}
object GetUserProfilePhotosOptions {
  
  @scala.inline
  def apply(): GetUserProfilePhotosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserProfilePhotosOptions]
  }
  
  @scala.inline
  implicit class GetUserProfilePhotosOptionsMutableBuilder[Self <: GetUserProfilePhotosOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
