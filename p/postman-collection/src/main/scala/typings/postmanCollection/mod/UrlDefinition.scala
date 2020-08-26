package typings.postmanCollection.mod

import typings.postmanCollection.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlDefinition extends PropertyBaseDefinition {
  var auth: js.UndefOr[Password] = js.native
  var hash: js.UndefOr[String] = js.native
  var host: js.UndefOr[js.Array[String] | String] = js.native
  var path: js.UndefOr[js.Array[String] | String] = js.native
  var port: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
}

object UrlDefinition {
  @scala.inline
  def apply(): UrlDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDefinition]
  }
  @scala.inline
  implicit class UrlDefinitionOps[Self <: UrlDefinition] (val x: Self) extends AnyVal {
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
    def setAuth(value: Password): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setHostVarargs(value: String*): Self = this.set("host", js.Array(value :_*))
    @scala.inline
    def setHost(value: js.Array[String] | String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String] | String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setQueryVarargs(value: QueryParamDefinition*): Self = this.set("query", js.Array(value :_*))
    @scala.inline
    def setQuery(value: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setVariableVarargs(value: VariableDefinition*): Self = this.set("variable", js.Array(value :_*))
    @scala.inline
    def setVariable(value: js.Array[VariableDefinition]): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariable: Self = this.set("variable", js.undefined)
  }
  
}

