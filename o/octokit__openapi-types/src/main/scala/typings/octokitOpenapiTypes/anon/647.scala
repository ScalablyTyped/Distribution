package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `647` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonNodeidUser
}
object `647` {
  
  inline def apply(`201`: ContentApplicationjsonNodeidUser): `647` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`647`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `647`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonNodeidUser): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
