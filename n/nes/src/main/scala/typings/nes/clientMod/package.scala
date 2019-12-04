package typings.nes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type Handler = js.Function2[/* message */ js.Any, /* flags */ ClientSubscribeFlags, Unit]
}
