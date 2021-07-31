package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnOpenCallbackResult extends StObject {
  
  /** 连接成功的 HTTP 响应 Header
    *
    * 最低基础库： `2.0.0` */
  var header: js.Object
}
object OnOpenCallbackResult {
  
  @scala.inline
  def apply(header: js.Object): OnOpenCallbackResult = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOpenCallbackResult]
  }
  
  @scala.inline
  implicit class OnOpenCallbackResultMutableBuilder[Self <: OnOpenCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
