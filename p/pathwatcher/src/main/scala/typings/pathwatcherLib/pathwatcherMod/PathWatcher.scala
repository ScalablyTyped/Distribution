package typings
package pathwatcherLib.pathwatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatcher extends js.Object {
  def close(): scala.Unit
  def onDidChange(callback: js.Function1[/* change */ WatchedFilePathChangedEvent, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable
}

