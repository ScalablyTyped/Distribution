package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content122` extends StObject {
  
  /** Alternative response with extra repository information */
  var `200`: Content122
  
  /** Not Found if repository is not managed by this team */
  var `404`: Any
}
object `200Content122` {
  
  inline def apply(`200`: Content122, `404`: Any): `200Content122` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content122`]
  }
  
  extension [Self <: `200Content122`](x: Self) {
    
    inline def set200(value: Content122): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Any): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
