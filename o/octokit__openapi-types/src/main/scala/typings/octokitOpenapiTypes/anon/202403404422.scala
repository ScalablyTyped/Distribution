package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202403404422` extends StObject {
  
  var `202`: ContentApplicationjsonRecord
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `422`: Content414
  
  var `500`: Content41
}
object `202403404422` {
  
  inline def apply(
    `202`: ContentApplicationjsonRecord,
    `403`: Content41,
    `404`: Content41,
    `422`: Content414,
    `500`: Content41
  ): `202403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202403404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202403404422`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
