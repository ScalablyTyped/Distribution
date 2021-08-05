package typings.miniprogram

import typings.miniprogram.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorage
  extends StObject
     with AsyncCallback[DataAny] {
  
  var key: String
}
object GetStorage {
  
  inline def apply(key: String): GetStorage = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorage]
  }
  
  extension [Self <: GetStorage](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
