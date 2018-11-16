package typings
package nesLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClientNs {
  type Handler = js.Function2[/* message */ js.Any, /* flags */ ClientSubscribeFlags, scala.Unit]
}
