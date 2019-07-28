package typings.pouchdbDashAdapterDashHttp.PouchDBNs.HttpAdapterNs

import typings.pouchdbDashAdapterDashHttp.pouchdbDashAdapterDashHttpStrings.http
import typings.pouchdbDashCore.Anon_Password
import typings.pouchdbDashCore.Fetch
import typings.pouchdbDashCore.PouchDBNs.ConfigurationNs.RemoteDatabaseConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: http
}

object HttpAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: http,
    auth: Anon_Password = null,
    fetch: Fetch = null,
    name: String = null,
    skip_setup: js.UndefOr[Boolean] = js.undefined
  ): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal(adapter = adapter)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup)
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
}

