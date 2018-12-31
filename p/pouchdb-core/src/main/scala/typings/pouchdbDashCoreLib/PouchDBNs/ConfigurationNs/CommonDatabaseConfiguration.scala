package typings
package pouchdbDashCoreLib.PouchDBNs.ConfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonDatabaseConfiguration extends js.Object {
  /**
    * Database adapter to use.
    *
    * If unspecified, PouchDB will infer this automatically, preferring
    * IndexedDB to WebSQL in browsers that support both (i.e. Chrome,
    * Opera and Android 4.4+).
    */
  var adapter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Database name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

