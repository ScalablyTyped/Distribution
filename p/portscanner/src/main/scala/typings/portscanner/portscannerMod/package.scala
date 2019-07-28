package typings.portscanner

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portscannerMod {
  type PortCallback = js.Function2[/* error */ Error | Null, /* port */ Double, Unit]
  type StatusCallback = js.Function2[/* error */ Error | Null, /* port */ Status, Unit]
}
