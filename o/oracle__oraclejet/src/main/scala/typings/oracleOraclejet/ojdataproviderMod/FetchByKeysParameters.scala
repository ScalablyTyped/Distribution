package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByKeysParameters[K] extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  
  var keys: Set[K] = js.native
}
object FetchByKeysParameters {
  
  @scala.inline
  def apply[K](keys: Set[K]): FetchByKeysParameters[K] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysParameters[K]]
  }
  
  @scala.inline
  implicit class FetchByKeysParametersMutableBuilder[Self <: FetchByKeysParameters[_], K] (val x: Self with FetchByKeysParameters[K]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: Set[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
