package typings.postmanCollection.mod

import typings.postmanCollection.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlDefinition extends PropertyBaseDefinition {
  var auth: js.UndefOr[Password] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[js.Array[String] | String] = js.undefined
  var path: js.UndefOr[js.Array[String] | String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.undefined
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}

object UrlDefinition {
  @scala.inline
  def apply(
    auth: Password = null,
    description: String | DescriptionDefinition = null,
    hash: String = null,
    host: js.Array[String] | String = null,
    path: js.Array[String] | String = null,
    port: String = null,
    protocol: String = null,
    query: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String = null,
    variable: js.Array[VariableDefinition] = null
  ): UrlDefinition = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlDefinition]
  }
}

