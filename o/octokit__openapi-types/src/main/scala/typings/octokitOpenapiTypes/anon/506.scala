package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `506` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonRecord
}
object `506` {
  
  inline def apply(`201`: ContentApplicationjsonRecord): `506` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`506`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `506`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRecord): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
