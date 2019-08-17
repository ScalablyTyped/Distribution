package typings.portfinder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portfinderMod {
  import typings.std.Error

  type PortfinderCallback = js.Function2[/* err */ Error, /* port */ Double, Unit]
}
