package typings
package pouchdbDashCoreLib.PouchDBNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatabaseInfo extends js.Object {
  /** Name of the database you gave when you called new PouchDB(), and also the unique identifier for the database. */
  var db_name: java.lang.String
  /** Total number of non-deleted documents in the database. */
  var doc_count: scala.Double
  /** Sequence number of the database. It starts at 0 and gets incremented every time a document is added or modified */
  var update_seq: scala.Double | java.lang.String
}

