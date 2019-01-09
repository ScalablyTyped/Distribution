package typings
package pouchdbDashCoreLib.PouchDBNs.ConfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteDatabaseConfiguration extends CommonDatabaseConfiguration {
  var auth: js.UndefOr[pouchdbDashCoreLib.Anon_Password] = js.undefined
  var fetch: js.UndefOr[pouchdbDashCoreLib.Fetch] = js.undefined
  /**
    * Disables automatic creation of databases.
    */
  var skip_setup: js.UndefOr[scala.Boolean] = js.undefined
}

