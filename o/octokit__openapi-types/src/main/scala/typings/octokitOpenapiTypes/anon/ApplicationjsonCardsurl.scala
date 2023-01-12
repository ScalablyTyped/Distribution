package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCardsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Cardsurl
}
object ApplicationjsonCardsurl {
  
  inline def apply(applicationSlashjson: Cardsurl): ApplicationjsonCardsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCardsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCardsurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Cardsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
