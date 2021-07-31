package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuePair extends StObject {
  
  // Name for this key-value pair
  var name: js.UndefOr[String] = js.undefined
  
  // Value for this key-value pair
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object KeyValuePair {
  
  @scala.inline
  def apply(): KeyValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValuePair]
  }
  
  @scala.inline
  implicit class KeyValuePairMutableBuilder[Self <: KeyValuePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
