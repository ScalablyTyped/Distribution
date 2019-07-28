package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.event_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventData[T] extends js.Object {
  /**
    * The identifier of the event
    */
  val __identifier__ : String
  /**
    * The type of the object
    */
  val __type__ : event_data
  var data: T
}

object IEventData {
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : event_data, data: T): IEventData[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__, __type__ = __type__, data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEventData[T]]
  }
}

