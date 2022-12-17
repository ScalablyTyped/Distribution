package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAuthorCommentsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AuthorCommentsurl
}
object ApplicationjsonAuthorCommentsurl {
  
  inline def apply(applicationSlashjson: AuthorCommentsurl): ApplicationjsonAuthorCommentsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAuthorCommentsurl]
  }
  
  extension [Self <: ApplicationjsonAuthorCommentsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: AuthorCommentsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
