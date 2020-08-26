package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkdownRenderRawEndpoint extends js.Object {
  /**
    * data parameter
    */
  var data: String = js.native
  var headers: `8` = js.native
}

object MarkdownRenderRawEndpoint {
  @scala.inline
  def apply(data: String, headers: `8`): MarkdownRenderRawEndpoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderRawEndpoint]
  }
  @scala.inline
  implicit class MarkdownRenderRawEndpointOps[Self <: MarkdownRenderRawEndpoint] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: `8`): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
  
}

