package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlBasedRequestPrepareOptions extends RequestPrepareOptions {
  var url: String = js.native
}

object UrlBasedRequestPrepareOptions {
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper, url: String): UrlBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlBasedRequestPrepareOptions]
  }
  @scala.inline
  implicit class UrlBasedRequestPrepareOptionsOps[Self <: UrlBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

