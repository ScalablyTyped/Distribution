package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `401404422` extends StObject {
  
  /** @description Response */
  var `200`: Content490
  
  var `401`: Content36
  
  var `404`: Content36
  
  var `422`: Content346
}
object `401404422` {
  
  inline def apply(`200`: Content490, `401`: Content36, `404`: Content36, `422`: Content346): `401404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`401404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `401404422`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content490): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content36): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
