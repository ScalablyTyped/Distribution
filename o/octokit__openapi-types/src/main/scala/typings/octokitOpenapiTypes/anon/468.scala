package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `468` extends StObject {
  
  var from: js.UndefOr[Securityandanalysis] = js.undefined
}
object `468` {
  
  inline def apply(): `468` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`468`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `468`] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Securityandanalysis): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
  }
}
