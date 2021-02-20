package typings.miniprogram

import typings.miniprogram.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStorage extends AsyncCallback[DataAny] {
  
  var key: String = js.native
}
object GetStorage {
  
  @scala.inline
  def apply(key: String): GetStorage = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorage]
  }
  
  @scala.inline
  implicit class GetStorageMutableBuilder[Self <: GetStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
