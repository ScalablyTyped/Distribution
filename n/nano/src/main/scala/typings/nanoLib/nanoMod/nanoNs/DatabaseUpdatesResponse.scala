package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates

trait DatabaseUpdatesResponse extends js.Object {
  // The last sequence ID reported.
  var last_seq: java.lang.String
  // An array of database events. For longpoll and continuous modes, the entire response is the contents of the
  // results array.
  var results: js.Array[DatabaseUpdatesResultItem]
}

