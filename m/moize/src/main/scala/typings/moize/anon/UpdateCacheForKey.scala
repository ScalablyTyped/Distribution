package typings.moize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCacheForKey[UpdateWhen /* <: typings.moize.mod.UpdateCacheForKey */] extends StObject {
  
  var updateCacheForKey: UpdateWhen
}
object UpdateCacheForKey {
  
  inline def apply[UpdateWhen /* <: typings.moize.mod.UpdateCacheForKey */](updateCacheForKey: UpdateWhen): UpdateCacheForKey[UpdateWhen] = {
    val __obj = js.Dynamic.literal(updateCacheForKey = updateCacheForKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCacheForKey[UpdateWhen]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCacheForKey[?], UpdateWhen /* <: typings.moize.mod.UpdateCacheForKey */] (val x: Self & UpdateCacheForKey[UpdateWhen]) extends AnyVal {
    
    inline def setUpdateCacheForKey(value: UpdateWhen): Self = StObject.set(x, "updateCacheForKey", value.asInstanceOf[js.Any])
  }
}
