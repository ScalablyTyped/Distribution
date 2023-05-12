package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHeadrepositoryid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Headrepositoryid
}
object ApplicationjsonHeadrepositoryid {
  
  inline def apply(applicationSlashjson: Headrepositoryid): ApplicationjsonHeadrepositoryid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHeadrepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonHeadrepositoryid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Headrepositoryid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
