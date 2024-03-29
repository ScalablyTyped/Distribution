package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreCase extends StObject {
  
  var ignoreCase: Boolean
}
object IgnoreCase {
  
  inline def apply(ignoreCase: Boolean): IgnoreCase = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreCase] (val x: Self) extends AnyVal {
    
    inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
  }
}
