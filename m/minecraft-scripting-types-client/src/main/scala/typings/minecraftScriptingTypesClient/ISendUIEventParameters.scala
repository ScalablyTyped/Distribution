package typings.minecraftScriptingTypesClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
  * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
  */
@js.native
trait ISendUIEventParameters extends StObject {
  
  /**
    * The data for the UI event being triggered
    */
  var data: String = js.native
  
  /**
    * The identifier of the UI event
    */
  var eventIdentifier: String = js.native
}
object ISendUIEventParameters {
  
  @scala.inline
  def apply(data: String, eventIdentifier: String): ISendUIEventParameters = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventIdentifier = eventIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISendUIEventParameters]
  }
  
  @scala.inline
  implicit class ISendUIEventParametersMutableBuilder[Self <: ISendUIEventParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventIdentifier(value: String): Self = StObject.set(x, "eventIdentifier", value.asInstanceOf[js.Any])
  }
}
