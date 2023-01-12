package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Note | Contentid
}
object `129` {
  
  inline def apply(applicationSlashjson: Note | Contentid): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `129`] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Note | Contentid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
