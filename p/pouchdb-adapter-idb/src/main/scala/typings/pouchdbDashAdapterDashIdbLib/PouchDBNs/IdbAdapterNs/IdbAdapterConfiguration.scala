package typings
package pouchdbDashAdapterDashIdbLib.PouchDBNs.IdbAdapterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdbAdapterConfiguration
  extends pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.LocalDatabaseConfiguration {
  @JSName("adapter")
  var adapter_IdbAdapterConfiguration: pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.idb
  /**
    * Configures storage persistence.
    *
    * Only works in Firefox 26+.
    */
  var storage: js.UndefOr[
    pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.persistent | pouchdbDashAdapterDashIdbLib.pouchdbDashAdapterDashIdbLibStrings.temporary
  ] = js.undefined
}

