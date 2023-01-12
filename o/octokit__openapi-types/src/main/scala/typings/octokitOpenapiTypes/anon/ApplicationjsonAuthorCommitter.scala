package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAuthorCommitter extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AuthorCommitter
}
object ApplicationjsonAuthorCommitter {
  
  inline def apply(applicationSlashjson: AuthorCommitter): ApplicationjsonAuthorCommitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAuthorCommitter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAuthorCommitter] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AuthorCommitter): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
