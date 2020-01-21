package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", "load")
@js.native
object load extends js.Object {
  def apply(url: String, callback: js.Function2[/* error */ js.Any, /* font */ js.UndefOr[Font], Unit]): Unit = js.native
}

