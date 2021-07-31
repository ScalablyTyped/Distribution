package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-line no-empty-interface
trait BeforeSaveRequest
  extends StObject
     with TriggerRequest {
  
  var context: js.Object
}
object BeforeSaveRequest {
  
  @scala.inline
  def apply(
    context: js.Object,
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object[Attributes],
    triggerName: String
  ): BeforeSaveRequest = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSaveRequest]
  }
  
  @scala.inline
  implicit class BeforeSaveRequestMutableBuilder[Self <: BeforeSaveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
