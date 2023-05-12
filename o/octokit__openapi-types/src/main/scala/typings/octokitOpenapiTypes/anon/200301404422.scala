package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200301404422` extends StObject {
  
  /** @description Response */
  var `200`: Content487
  
  var `301`: Content36
  
  var `404`: Content36
  
  var `422`: Content346
}
object `200301404422` {
  
  inline def apply(`200`: Content487, `301`: Content36, `404`: Content36, `422`: Content346): `200301404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200301404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200301404422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content487): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content36): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
