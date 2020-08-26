package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.PATCH
import typings.octokitTypes.octokitTypesStrings.SlashprojectsSlashcolumnsSlashColoncolumn_id
import typings.octokitTypes.requestHeadersMod.RequestHeaders
import typings.octokitTypes.requestRequestOptionsMod.RequestRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectsUpdateColumnRequestOptions extends js.Object {
  var headers: RequestHeaders = js.native
  var method: PATCH = js.native
  var request: RequestRequestOptions = js.native
  var url: SlashprojectsSlashcolumnsSlashColoncolumn_id = js.native
}

object ProjectsUpdateColumnRequestOptions {
  @scala.inline
  def apply(
    headers: RequestHeaders,
    method: PATCH,
    request: RequestRequestOptions,
    url: SlashprojectsSlashcolumnsSlashColoncolumn_id
  ): ProjectsUpdateColumnRequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateColumnRequestOptions]
  }
  @scala.inline
  implicit class ProjectsUpdateColumnRequestOptionsOps[Self <: ProjectsUpdateColumnRequestOptions] (val x: Self) extends AnyVal {
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
    def setHeaders(value: RequestHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: PATCH): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: RequestRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: SlashprojectsSlashcolumnsSlashColoncolumn_id): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

