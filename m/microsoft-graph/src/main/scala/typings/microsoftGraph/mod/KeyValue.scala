package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValue extends StObject {
  
  // Key for the key-value pair.
  var key: js.UndefOr[NullableOption[String]] = js.native
  
  // Value for the key-value pair.
  var value: js.UndefOr[NullableOption[String]] = js.native
}
object KeyValue {
  
  @scala.inline
  def apply(): KeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit class KeyValueMutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
