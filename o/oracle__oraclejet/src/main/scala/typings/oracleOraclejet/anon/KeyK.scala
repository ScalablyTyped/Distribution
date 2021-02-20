package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyK[K] extends StObject {
  
  var key: K = js.native
}
object KeyK {
  
  @scala.inline
  def apply[K](key: K): KeyK[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyK[K]]
  }
  
  @scala.inline
  implicit class KeyKMutableBuilder[Self <: KeyK[_], K] (val x: Self with KeyK[K]) extends AnyVal {
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
