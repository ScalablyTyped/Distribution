package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200302403` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonApplicationvndgithubobject
  
  var `302`: Any
  
  var `403`: Content55
  
  var `404`: Content55
}
object `200302403` {
  
  inline def apply(
    `200`: ContentApplicationjsonApplicationvndgithubobject,
    `302`: Any,
    `403`: Content55,
    `404`: Content55
  ): `200302403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("302")(`302`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200302403`]
  }
  
  extension [Self <: `200302403`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonApplicationvndgithubobject): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set302(value: Any): Self = StObject.set(x, "302", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content55): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content55): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
