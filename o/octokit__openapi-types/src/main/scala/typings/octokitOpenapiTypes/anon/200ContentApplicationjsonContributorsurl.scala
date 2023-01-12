package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonContributorsurl` extends StObject {
  
  /** Alternative response with extra repository information */
  var `200`: ContentApplicationjsonContributorsurl
  
  /** Not Found if repository is not managed by this team */
  var `404`: Any
}
object `200ContentApplicationjsonContributorsurl` {
  
  inline def apply(`200`: ContentApplicationjsonContributorsurl, `404`: Any): `200ContentApplicationjsonContributorsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonContributorsurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonContributorsurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonContributorsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
