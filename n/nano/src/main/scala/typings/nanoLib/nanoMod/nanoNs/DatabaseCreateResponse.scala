package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Database scope request and response
// -------------------------------------
// http://docs.couchdb.org/en/latest/api/database/common.html#put--db

trait DatabaseCreateResponse extends js.Object {
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[java.lang.String] = js.undefined
  // Operation status. Available in case of success
  var ok: js.UndefOr[scala.Boolean] = js.undefined
  // Error description. Available if response code is 4xx
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

