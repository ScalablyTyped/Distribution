package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppId extends StObject {
  
  var appId: String = js.native
  
  var extraData: js.Any = js.native
  
  var sourceServiceId: String = js.native
}
object AppId {
  
  @scala.inline
  def apply(appId: String, extraData: js.Any, sourceServiceId: String): AppId = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], sourceServiceId = sourceServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppId]
  }
  
  @scala.inline
  implicit class AppIdMutableBuilder[Self <: AppId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServiceId(value: String): Self = StObject.set(x, "sourceServiceId", value.asInstanceOf[js.Any])
  }
}
