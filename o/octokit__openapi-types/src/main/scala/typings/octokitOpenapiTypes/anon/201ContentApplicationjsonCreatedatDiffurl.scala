package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonCreatedatDiffurl` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonCreatedatDiffurl
  
  var `403`: Content36
}
object `201ContentApplicationjsonCreatedatDiffurl` {
  
  inline def apply(`201`: ContentApplicationjsonCreatedatDiffurl, `403`: Content36): `201ContentApplicationjsonCreatedatDiffurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonCreatedatDiffurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonCreatedatDiffurl`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonCreatedatDiffurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
