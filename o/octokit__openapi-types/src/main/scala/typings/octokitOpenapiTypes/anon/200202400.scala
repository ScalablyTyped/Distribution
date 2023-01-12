package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200202400` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAltdomain
  
  /** Empty response */
  var `202`: Content40
  
  /** Custom domains are not available for GitHub Pages */
  var `400`: Any
  
  var `404`: Content48
  
  /** There isn't a CNAME for this page */
  var `422`: Any
}
object `200202400` {
  
  inline def apply(`200`: ContentApplicationjsonAltdomain, `202`: Content40, `400`: Any, `404`: Content48, `422`: Any): `200202400` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200202400`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200202400`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonAltdomain): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content40): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: Any): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
