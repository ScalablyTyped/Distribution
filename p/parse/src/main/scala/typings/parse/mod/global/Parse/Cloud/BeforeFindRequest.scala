package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeFindRequest extends TriggerRequest {
  var count: Boolean = js.native
  var isGet: Boolean = js.native
  var query: Query[Object[Attributes]] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOption] = js.native
}

object BeforeFindRequest {
  @scala.inline
  def apply(
    count: Boolean,
    headers: js.Any,
    ip: String,
    isGet: Boolean,
    log: js.Any,
    `object`: Object[Attributes],
    query: Query[Object[Attributes]],
    triggerName: String
  ): BeforeFindRequest = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], isGet = isGet.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeFindRequest]
  }
  @scala.inline
  implicit class BeforeFindRequestOps[Self <: BeforeFindRequest] (val x: Self) extends AnyVal {
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
    def setCount(value: Boolean): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGet(value: Boolean): Self = this.set("isGet", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: Query[Object[Attributes]]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadPreference(value: ReadPreferenceOption): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
  }
  
}

