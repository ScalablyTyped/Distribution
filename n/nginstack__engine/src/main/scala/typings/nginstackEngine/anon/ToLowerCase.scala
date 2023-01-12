package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToLowerCase extends StObject {
  
  var toLowerCase: Boolean
}
object ToLowerCase {
  
  inline def apply(toLowerCase: Boolean): ToLowerCase = {
    val __obj = js.Dynamic.literal(toLowerCase = toLowerCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToLowerCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToLowerCase] (val x: Self) extends AnyVal {
    
    inline def setToLowerCase(value: Boolean): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
  }
}
