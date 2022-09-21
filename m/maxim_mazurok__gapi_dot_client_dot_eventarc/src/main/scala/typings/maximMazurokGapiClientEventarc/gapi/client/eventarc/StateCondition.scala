package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateCondition extends StObject {
  
  /** The canonical code of the condition. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Human-readable message. */
  var message: js.UndefOr[String] = js.undefined
}
object StateCondition {
  
  inline def apply(): StateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateCondition]
  }
  
  extension [Self <: StateCondition](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
