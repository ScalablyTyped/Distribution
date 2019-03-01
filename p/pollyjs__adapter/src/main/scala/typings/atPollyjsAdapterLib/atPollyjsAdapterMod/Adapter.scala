package typings
package atPollyjsAdapterLib.atPollyjsAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def connect(): scala.Unit
  def disconnect(): scala.Unit
}

object Adapter {
  @scala.inline
  def apply(connect: js.Function0[scala.Unit], disconnect: js.Function0[scala.Unit]): Adapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.asInstanceOf[Adapter]
  }
}

