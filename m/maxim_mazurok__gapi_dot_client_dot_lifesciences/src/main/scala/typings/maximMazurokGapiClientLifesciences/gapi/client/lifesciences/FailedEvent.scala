package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedEvent extends StObject {
  
  /** The human-readable description of the cause of the failure. */
  var cause: js.UndefOr[String] = js.native
  
  /** The Google standard error code that best describes this failure. */
  var code: js.UndefOr[String] = js.native
}
object FailedEvent {
  
  @scala.inline
  def apply(): FailedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedEvent]
  }
  
  @scala.inline
  implicit class FailedEventMutableBuilder[Self <: FailedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
