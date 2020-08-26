package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposUpdateStatusCheckPotectionResponseData extends js.Object {
  var contexts: js.Array[String] = js.native
  var contexts_url: String = js.native
  var strict: Boolean = js.native
  var url: String = js.native
}

object ReposUpdateStatusCheckPotectionResponseData {
  @scala.inline
  def apply(contexts: js.Array[String], contexts_url: String, strict: Boolean, url: String): ReposUpdateStatusCheckPotectionResponseData = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], contexts_url = contexts_url.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateStatusCheckPotectionResponseData]
  }
  @scala.inline
  implicit class ReposUpdateStatusCheckPotectionResponseDataOps[Self <: ReposUpdateStatusCheckPotectionResponseData] (val x: Self) extends AnyVal {
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
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def setContexts_url(value: String): Self = this.set("contexts_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

