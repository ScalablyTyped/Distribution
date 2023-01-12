package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200301404422` extends StObject {
  
  /** Response */
  var `200`: Content425
  
  var `301`: Content48
  
  var `404`: Content48
  
  var `422`: Content397
}
object `200301404422` {
  
  inline def apply(`200`: Content425, `301`: Content48, `404`: Content48, `422`: Content397): `200301404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200301404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200301404422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content425): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content48): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
