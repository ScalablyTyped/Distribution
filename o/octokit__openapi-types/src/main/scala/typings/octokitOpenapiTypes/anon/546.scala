package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `546` extends StObject {
  
  var from: js.UndefOr[Securityandanalysis] = js.undefined
}
object `546` {
  
  inline def apply(): `546` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`546`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `546`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Securityandanalysis): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
  }
}
