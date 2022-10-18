package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationvndgithubv3starjson` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationvndgithubv3starjson
  
  var `304`: Any
  
  var `401`: Content6
  
  var `403`: Content6
}
object `200ContentApplicationvndgithubv3starjson` {
  
  inline def apply(`200`: ContentApplicationvndgithubv3starjson, `304`: Any, `401`: Content6, `403`: Content6): `200ContentApplicationvndgithubv3starjson` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationvndgithubv3starjson`]
  }
  
  extension [Self <: `200ContentApplicationvndgithubv3starjson`](x: Self) {
    
    inline def set200(value: ContentApplicationvndgithubv3starjson): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
