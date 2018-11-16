package typings
package nanoidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nanoid/random", JSImport.Namespace)
@js.native
object randomMod extends js.Object {
  def apply(size: scala.Double): nodeLib.Buffer = js.native
  def apply(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

