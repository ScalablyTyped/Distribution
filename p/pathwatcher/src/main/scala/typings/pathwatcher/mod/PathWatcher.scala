package typings.pathwatcher.mod

import typings.eventKit.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathWatcher extends js.Object {
  def close(): Unit = js.native
  def onDidChange(callback: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit]): Disposable = js.native
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
  @scala.inline
  implicit class PathWatcherOps[Self <: PathWatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDidChange(value: js.Function1[/* change */ WatchedFilePathChangedEvent, Unit] => Disposable): Self = this.set("onDidChange", js.Any.fromFunction1(value))
  }
  
}

