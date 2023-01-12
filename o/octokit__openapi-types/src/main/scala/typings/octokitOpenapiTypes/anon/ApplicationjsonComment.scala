package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonComment extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Comment
}
object ApplicationjsonComment {
  
  inline def apply(applicationSlashjson: Comment): ApplicationjsonComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonComment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonComment] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Comment): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
