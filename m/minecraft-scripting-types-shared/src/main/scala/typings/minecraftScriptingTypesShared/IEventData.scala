package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.event_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventData[T] extends js.Object {
  /**
    * The identifier of the event
    */
  val __identifier__ : String = js.native
  /**
    * The type of the object
    */
  val __type__ : event_data = js.native
  var data: T = js.native
}

object IEventData {
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : event_data, data: T): IEventData[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEventData[T]]
  }
  @scala.inline
  implicit class IEventDataOps[Self <: IEventData[_], T] (val x: Self with IEventData[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set__identifier__(value: String): Self = this.set("__identifier__", value.asInstanceOf[js.Any])
    @scala.inline
    def set__type__(value: event_data): Self = this.set("__type__", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

