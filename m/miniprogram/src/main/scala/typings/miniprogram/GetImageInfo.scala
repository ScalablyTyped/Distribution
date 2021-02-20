package typings.miniprogram

import typings.miniprogram.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageInfo extends AsyncCallback[Height] {
  
  var src: String = js.native
}
object GetImageInfo {
  
  @scala.inline
  def apply(src: String): GetImageInfo = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageInfo]
  }
  
  @scala.inline
  implicit class GetImageInfoMutableBuilder[Self <: GetImageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
