package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedEvent extends StObject {
  
  /** The human-readable description of the cause of the failure. */
  var cause: js.UndefOr[String] = js.undefined
  
  /** The Google standard error code that best describes this failure. */
  var code: js.UndefOr[String] = js.undefined
}
object FailedEvent {
  
  inline def apply(): FailedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedEvent]
  }
  
  extension [Self <: FailedEvent](x: Self) {
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
