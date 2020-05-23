package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/file-system-watcher/
trait FileSystemWatcher extends Disposable {
  def onDidChange(callback: js.Function1[/* path */ String, Unit]): Unit
}

object FileSystemWatcher {
  @scala.inline
  def apply(dispose: () => Unit, onDidChange: js.Function1[/* path */ String, Unit] => Unit): FileSystemWatcher = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), onDidChange = js.Any.fromFunction1(onDidChange))
    __obj.asInstanceOf[FileSystemWatcher]
  }
}

