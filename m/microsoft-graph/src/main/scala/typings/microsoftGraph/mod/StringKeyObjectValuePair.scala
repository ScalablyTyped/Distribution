package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringKeyObjectValuePair extends StObject {
  
  var key: js.UndefOr[NullableOption[String]] = js.undefined
}
object StringKeyObjectValuePair {
  
  inline def apply(): StringKeyObjectValuePair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringKeyObjectValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringKeyObjectValuePair] (val x: Self) extends AnyVal {
    
    inline def setKey(value: NullableOption[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
