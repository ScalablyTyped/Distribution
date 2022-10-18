package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonRepositoryselectionTotalcount` extends StObject {
  
  /** The access the user has to each repository is included in the hash under the `permissions` key. */
  var `200`: ContentApplicationjsonRepositoryselectionTotalcount
  
  var `304`: Any
  
  var `403`: Content6
  
  var `404`: Content6
}
object `200ContentApplicationjsonRepositoryselectionTotalcount` {
  
  inline def apply(
    `200`: ContentApplicationjsonRepositoryselectionTotalcount,
    `304`: Any,
    `403`: Content6,
    `404`: Content6
  ): `200ContentApplicationjsonRepositoryselectionTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonRepositoryselectionTotalcount`]
  }
  
  extension [Self <: `200ContentApplicationjsonRepositoryselectionTotalcount`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonRepositoryselectionTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(value: Any): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content6): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
