package typings.openfin.platformMod

import typings.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  var windows: js.Array[WindowOption]
}

object Snapshot {
  @scala.inline
  def apply(windows: js.Array[WindowOption]): Snapshot = {
    val __obj = js.Dynamic.literal(windows = windows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Snapshot]
  }
}

