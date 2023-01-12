package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowPlainStrings extends StObject {
  
  /**
    * Whether strings which don't contain a binding are allowed, default is false
    */
  var allowPlainStrings: Boolean
}
object AllowPlainStrings {
  
  inline def apply(allowPlainStrings: Boolean): AllowPlainStrings = {
    val __obj = js.Dynamic.literal(allowPlainStrings = allowPlainStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowPlainStrings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowPlainStrings] (val x: Self) extends AnyVal {
    
    inline def setAllowPlainStrings(value: Boolean): Self = StObject.set(x, "allowPlainStrings", value.asInstanceOf[js.Any])
  }
}
