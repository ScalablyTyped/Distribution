package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate

trait DatabaseReplicateOptions extends js.Object {
  // Cancels the replication
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  // Configure the replication to be continuous
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  // Creates the target database. Required administrator’s privileges on target server.
  var create_target: js.UndefOr[scala.Boolean] = js.undefined
  // Array of document IDs to be synchronized
  var doc_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // The name of a filter function.
  var filter: js.UndefOr[java.lang.String] = js.undefined
  // Address of a proxy server through which replication should occur (protocol can be “http” or “socks5”)
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  // Source database name or URL
  var source: js.UndefOr[java.lang.String] = js.undefined
  // Target database name or URL
  var target: js.UndefOr[java.lang.String] = js.undefined
}

