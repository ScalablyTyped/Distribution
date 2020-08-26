package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemDefinition extends PropertyDefinition {
  var events: js.UndefOr[js.Array[EventDefinition]] = js.native
  var request: js.UndefOr[RequestDefinition] = js.native
  var response: js.UndefOr[js.Array[ResponseDefinition]] = js.native
}

object ItemDefinition {
  @scala.inline
  def apply(): ItemDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemDefinition]
  }
  @scala.inline
  implicit class ItemDefinitionOps[Self <: ItemDefinition] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: EventDefinition*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[EventDefinition]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setRequest(value: RequestDefinition): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponseVarargs(value: ResponseDefinition*): Self = this.set("response", js.Array(value :_*))
    @scala.inline
    def setResponse(value: js.Array[ResponseDefinition]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

