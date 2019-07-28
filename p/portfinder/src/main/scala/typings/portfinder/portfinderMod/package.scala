package typings.portfinder

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portfinderMod {
  type PortfinderCallback = js.Function2[/* err */ Error, /* port */ Double, Unit]
}
