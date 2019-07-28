package typings.minecraftDashScriptingDashTypesDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
  * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
  */
trait ISendUIEventParameters extends js.Object {
  /**
    * The data for the UI event being triggered
    */
  var data: String
  /**
    * The identifier of the UI event
    */
  var eventIdentifier: String
}

object ISendUIEventParameters {
  @scala.inline
  def apply(data: String, eventIdentifier: String): ISendUIEventParameters = {
    val __obj = js.Dynamic.literal(data = data, eventIdentifier = eventIdentifier)
  
    __obj.asInstanceOf[ISendUIEventParameters]
  }
}

