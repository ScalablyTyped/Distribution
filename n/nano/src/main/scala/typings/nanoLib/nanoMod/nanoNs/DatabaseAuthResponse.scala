package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication

trait DatabaseAuthResponse extends js.Object {
  // Username
  var name: java.lang.String
  // Operation status
  var ok: scala.Boolean
  // List of user roles
  var roles: js.Array[java.lang.String]
}

