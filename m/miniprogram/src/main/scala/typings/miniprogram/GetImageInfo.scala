package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageInfo
  extends StObject
     with AsyncCallback[GetImageInfoCallbackValue] {
  
  var src: String
}
object GetImageInfo {
  
  inline def apply(src: String): GetImageInfo = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImageInfo] (val x: Self) extends AnyVal {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
