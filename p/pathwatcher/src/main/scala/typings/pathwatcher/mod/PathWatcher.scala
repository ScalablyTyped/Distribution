package typings.pathwatcher.mod

import typings.eventKit.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathWatcher extends js.Object {
  def close(): Unit
  def onDidChange(callback: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit]): Disposable
}

object PathWatcher {
  @scala.inline
  def apply(
    close: () => Unit,
    onDidChange: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit] => Disposable
  ): PathWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), onDidChange = js.Any.fromFunction1(onDidChange))
  
    __obj.asInstanceOf[PathWatcher]
  }
}

