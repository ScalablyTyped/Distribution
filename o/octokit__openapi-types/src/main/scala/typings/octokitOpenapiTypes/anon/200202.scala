package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200202` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonAltdomain
  
  /** Empty response */
  var `202`: Content4
  
  /** Custom domains are not available for GitHub Pages */
  var `400`: Any
  
  var `404`: Content6
  
  /** There isn't a CNAME for this page */
  var `422`: Any
}
object `200202` {
  
  inline def apply(`200`: ContentApplicationjsonAltdomain, `202`: Content4, `400`: Any, `404`: Content6, `422`: Any): `200202` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200202`]
  }
  
  extension [Self <: `200202`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonAltdomain): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: Content4): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: Any): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
