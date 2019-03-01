package typings
package pouchdbDashAdapterDashHttpLib.PouchDBNs.HttpAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpAdapterConfiguration
  extends pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.RemoteDatabaseConfiguration {
  @JSName("adapter")
  var adapter_HttpAdapterConfiguration: pouchdbDashAdapterDashHttpLib.pouchdbDashAdapterDashHttpLibStrings.http
}

object HttpAdapterConfiguration {
  @scala.inline
  def apply(
    adapter: pouchdbDashAdapterDashHttpLib.pouchdbDashAdapterDashHttpLibStrings.http,
    auth: pouchdbDashCoreLib.Anon_Password = null,
    fetch: pouchdbDashCoreLib.Fetch = null,
    name: java.lang.String = null,
    skip_setup: js.UndefOr[scala.Boolean] = js.undefined
  ): HttpAdapterConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapter")(adapter)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup)
    __obj.asInstanceOf[HttpAdapterConfiguration]
  }
}

