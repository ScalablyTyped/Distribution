package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveStorageArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  var key: String
}
object RemoveStorageArgs {
  
  @scala.inline
  def apply(key: String): RemoveStorageArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveStorageArgs]
  }
  
  @scala.inline
  implicit class RemoveStorageArgsMutableBuilder[Self <: RemoveStorageArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
