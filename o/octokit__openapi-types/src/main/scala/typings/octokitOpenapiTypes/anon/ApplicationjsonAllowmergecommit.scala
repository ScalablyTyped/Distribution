package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowmergecommit extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowmergecommit
}
object ApplicationjsonAllowmergecommit {
  
  inline def apply(applicationSlashjson: Allowmergecommit): ApplicationjsonAllowmergecommit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowmergecommit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowmergecommit] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Allowmergecommit): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
