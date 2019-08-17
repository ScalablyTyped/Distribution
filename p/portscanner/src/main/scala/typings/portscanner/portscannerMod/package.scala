package typings.portscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portscannerMod {
  import typings.std.Error

  type PortCallback = js.Function2[/* error */ Error | Null, /* port */ Double, Unit]
  type StatusCallback = js.Function2[/* error */ Error | Null, /* port */ Status, Unit]
}
