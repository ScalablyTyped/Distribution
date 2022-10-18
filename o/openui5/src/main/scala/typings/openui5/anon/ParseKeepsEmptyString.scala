package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseKeepsEmptyString extends StObject {
  
  /**
    * if `true`, the empty string `""` is parsed to `""` and `nullable=false` does not mean "input is mandatory".
    * Otherwise the empty string `""` is parsed to `null` which might be rejected.
    */
  var parseKeepsEmptyString: js.UndefOr[Boolean] = js.undefined
}
object ParseKeepsEmptyString {
  
  inline def apply(): ParseKeepsEmptyString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseKeepsEmptyString]
  }
  
  extension [Self <: ParseKeepsEmptyString](x: Self) {
    
    inline def setParseKeepsEmptyString(value: Boolean): Self = StObject.set(x, "parseKeepsEmptyString", value.asInstanceOf[js.Any])
    
    inline def setParseKeepsEmptyStringUndefined: Self = StObject.set(x, "parseKeepsEmptyString", js.undefined)
  }
}
