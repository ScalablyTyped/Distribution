package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCommentscount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Commentscount
}
object ApplicationjsonCommentscount {
  
  inline def apply(applicationSlashjson: Commentscount): ApplicationjsonCommentscount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCommentscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCommentscount] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Commentscount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
