package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key[K, D] extends StObject {
  
  var data: D = js.native
  
  var key: K = js.native
}
object Key {
  
  @scala.inline
  def apply[K, D](data: D, key: K): Key[K, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[K, D]]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key[_, _], K, D] (val x: Self with (Key[K, D])) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
