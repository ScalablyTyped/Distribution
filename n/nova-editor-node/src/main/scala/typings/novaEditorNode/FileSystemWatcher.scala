package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/file-system-watcher/
@js.native
trait FileSystemWatcher extends Disposable {
  
  def onDidChange(callback: js.Function1[/* path */ String, Unit]): Unit = js.native
}
object FileSystemWatcher {
  
  @scala.inline
  def apply(dispose: () => Unit, onDidChange: js.Function1[/* path */ String, Unit] => Unit): FileSystemWatcher = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), onDidChange = js.Any.fromFunction1(onDidChange))
    __obj.asInstanceOf[FileSystemWatcher]
  }
  
  @scala.inline
  implicit class FileSystemWatcherOps[Self <: FileSystemWatcher] (val x: Self) extends AnyVal {
    
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
    def setOnDidChange(value: js.Function1[/* path */ String, Unit] => Unit): Self = this.set("onDidChange", js.Any.fromFunction1(value))
  }
}
