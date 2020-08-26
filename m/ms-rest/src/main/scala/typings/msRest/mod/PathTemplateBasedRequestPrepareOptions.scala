package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathTemplateBasedRequestPrepareOptions extends RequestPrepareOptions {
  var pathTemplate: String = js.native
}

object PathTemplateBasedRequestPrepareOptions {
  @scala.inline
  def apply(deserializationMapper: Mapper, method: String, pathTemplate: String, serializationMapper: Mapper): PathTemplateBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], pathTemplate = pathTemplate.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathTemplateBasedRequestPrepareOptions]
  }
  @scala.inline
  implicit class PathTemplateBasedRequestPrepareOptionsOps[Self <: PathTemplateBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
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
    def setPathTemplate(value: String): Self = this.set("pathTemplate", value.asInstanceOf[js.Any])
  }
  
}

