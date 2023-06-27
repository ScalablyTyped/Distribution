package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `590` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonRecord
}
object `590` {
  
  inline def apply(`201`: ContentApplicationjsonRecord): `590` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`590`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `590`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonRecord): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
