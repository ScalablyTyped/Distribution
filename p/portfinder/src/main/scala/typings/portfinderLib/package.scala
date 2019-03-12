package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object portfinderLib {
  type PortfinderCallback = js.Function2[/* err */ stdLib.Error, /* port */ scala.Double, scala.Unit]
}
