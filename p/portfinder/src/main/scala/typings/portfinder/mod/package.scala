package typings.portfinder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PortfinderCallback = js.Function2[/* err */ typings.std.Error, /* port */ scala.Double, scala.Unit]
}
