package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mobile extends StObject {
  
  var mobile: String = js.native
  
  var name: String = js.native
}
object Mobile {
  
  @scala.inline
  def apply(mobile: String, name: String): Mobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
  
  @scala.inline
  implicit class MobileMutableBuilder[Self <: Mobile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobile(value: String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
