package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCommitterMessage extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CommitterMessage
}
object ApplicationjsonCommitterMessage {
  
  inline def apply(applicationSlashjson: CommitterMessage): ApplicationjsonCommitterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCommitterMessage]
  }
  
  extension [Self <: ApplicationjsonCommitterMessage](x: Self) {
    
    inline def setApplicationSlashjson(value: CommitterMessage): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
