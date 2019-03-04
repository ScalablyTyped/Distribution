package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
trait DatabaseSessionResponse extends js.Object {
  // Server authentication configuration
  var info: js.Any
  // Operation status
  var ok: scala.Boolean
  // User context for the current user
  var userCtx: js.Any
}

object DatabaseSessionResponse {
  @scala.inline
  def apply(info: js.Any, ok: scala.Boolean, userCtx: js.Any): DatabaseSessionResponse = {
    val __obj = js.Dynamic.literal(info = info, ok = ok, userCtx = userCtx)
  
    __obj.asInstanceOf[DatabaseSessionResponse]
  }
}

