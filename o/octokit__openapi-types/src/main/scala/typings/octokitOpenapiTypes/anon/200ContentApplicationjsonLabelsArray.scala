package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonLabelsArray` extends StObject {
  
  var `200`: ContentApplicationjsonLabelsArray
  
  var `404`: Content36
}
object `200ContentApplicationjsonLabelsArray` {
  
  inline def apply(`200`: ContentApplicationjsonLabelsArray, `404`: Content36): `200ContentApplicationjsonLabelsArray` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonLabelsArray`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonLabelsArray`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
