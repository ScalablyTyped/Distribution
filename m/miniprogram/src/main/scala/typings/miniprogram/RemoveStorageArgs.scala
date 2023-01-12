package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveStorageArgs
  extends StObject
     with AsyncVoidCallback {
  
  var key: String
}
object RemoveStorageArgs {
  
  inline def apply(key: String): RemoveStorageArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveStorageArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveStorageArgs] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
