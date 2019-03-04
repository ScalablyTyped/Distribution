package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlDefinition extends PropertyBaseDefinition {
  var auth: js.UndefOr[postmanDashCollectionLib.Anon_Password] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var path: js.Array[java.lang.String] | java.lang.String
  var port: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String] = js.undefined
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}

object UrlDefinition {
  @scala.inline
  def apply(
    path: js.Array[java.lang.String] | java.lang.String,
    auth: postmanDashCollectionLib.Anon_Password = null,
    description: java.lang.String | DescriptionDefinition = null,
    hash: java.lang.String = null,
    host: js.Array[java.lang.String] | java.lang.String = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    query: js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String = null,
    variable: js.Array[VariableDefinition] = null
  ): UrlDefinition = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[UrlDefinition]
  }
}

