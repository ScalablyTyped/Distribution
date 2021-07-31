package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStorage
  extends StObject
     with AsyncCallback[Unit] {
  
  var data: js.Any
  
  var key: String
}
object SetStorage {
  
  @scala.inline
  def apply(data: js.Any, key: String): SetStorage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStorage]
  }
  
  @scala.inline
  implicit class SetStorageMutableBuilder[Self <: SetStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
