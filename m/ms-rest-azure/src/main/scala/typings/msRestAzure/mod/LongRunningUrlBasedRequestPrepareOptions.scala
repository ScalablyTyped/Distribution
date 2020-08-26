package typings.msRestAzure.mod

import typings.msRest.mod.Mapper
import typings.msRest.mod.UrlBasedRequestPrepareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongRunningUrlBasedRequestPrepareOptions extends UrlBasedRequestPrepareOptions {
  var deserializationMapperForTerminalResponse: js.UndefOr[Mapper] = js.native
}

object LongRunningUrlBasedRequestPrepareOptions {
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper, url: String): LongRunningUrlBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRunningUrlBasedRequestPrepareOptions]
  }
  @scala.inline
  implicit class LongRunningUrlBasedRequestPrepareOptionsOps[Self <: LongRunningUrlBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
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
    def setDeserializationMapperForTerminalResponse(value: Mapper): Self = this.set("deserializationMapperForTerminalResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeserializationMapperForTerminalResponse: Self = this.set("deserializationMapperForTerminalResponse", js.undefined)
  }
  
}

