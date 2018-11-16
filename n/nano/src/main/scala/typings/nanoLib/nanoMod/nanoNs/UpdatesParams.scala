package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#get--_db_updates

trait UpdatesParams extends js.Object {
  var feed: nanoLib.nanoLibStrings.longpoll | nanoLib.nanoLibStrings.continuous | nanoLib.nanoLibStrings.eventsource
  var heartbeat: scala.Boolean
  var since: java.lang.String
  var timeout: scala.Double
}

