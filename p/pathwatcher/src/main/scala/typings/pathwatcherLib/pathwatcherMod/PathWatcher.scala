package typings
package pathwatcherLib.pathwatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatcher extends js.Object {
  def close(): scala.Unit
  def onDidChange(callback: js.Function1[/* change */ WatchedFilePathChangedEvent, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable
}

object PathWatcher {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    onDidChange: js.Function1[
      js.Function1[/* change */ WatchedFilePathChangedEvent, scala.Unit], 
      eventDashKitLib.eventDashKitMod.Disposable
    ]
  ): PathWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("onDidChange")(onDidChange)
    __obj.asInstanceOf[PathWatcher]
  }
}

