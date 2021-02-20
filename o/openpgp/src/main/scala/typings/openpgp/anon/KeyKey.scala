package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyKey extends StObject {
  
  var key: typings.openpgp.mod.key.Key = js.native
}
object KeyKey {
  
  @scala.inline
  def apply(key: typings.openpgp.mod.key.Key): KeyKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyKey]
  }
  
  @scala.inline
  implicit class KeyKeyMutableBuilder[Self <: KeyKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
