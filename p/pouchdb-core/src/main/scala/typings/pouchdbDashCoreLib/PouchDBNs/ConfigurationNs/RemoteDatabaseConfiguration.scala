package typings
package pouchdbDashCoreLib.PouchDBNs.ConfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDatabaseConfiguration
  extends CommonDatabaseConfiguration
     with DatabaseConfiguration {
  var auth: js.UndefOr[pouchdbDashCoreLib.Anon_Password] = js.undefined
  var fetch: js.UndefOr[pouchdbDashCoreLib.Fetch] = js.undefined
  /**
    * Disables automatic creation of databases.
    */
  var skip_setup: js.UndefOr[scala.Boolean] = js.undefined
}

object RemoteDatabaseConfiguration {
  @scala.inline
  def apply(
    adapter: java.lang.String = null,
    auth: pouchdbDashCoreLib.Anon_Password = null,
    fetch: pouchdbDashCoreLib.Fetch = null,
    name: java.lang.String = null,
    skip_setup: js.UndefOr[scala.Boolean] = js.undefined
  ): RemoteDatabaseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(skip_setup)) __obj.updateDynamic("skip_setup")(skip_setup)
    __obj.asInstanceOf[RemoteDatabaseConfiguration]
  }
}

