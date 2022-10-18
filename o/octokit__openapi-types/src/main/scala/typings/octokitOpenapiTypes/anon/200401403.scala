package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200401403` extends StObject {
  
  /** Response */
  var `200`: Content54
  
  var `401`: Content6
  
  var `403`: Content6
}
object `200401403` {
  
  inline def apply(`200`: Content54, `401`: Content6, `403`: Content6): `200401403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200401403`]
  }
  
  extension [Self <: `200401403`](x: Self) {
    
    inline def set200(value: Content54): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content6): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
