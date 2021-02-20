package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
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
  implicit class FileSystemWatcherMutableBuilder[Self <: FileSystemWatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidChange(value: js.Function1[/* path */ String, Unit] => Unit): Self = StObject.set(x, "onDidChange", js.Any.fromFunction1(value))
  }
}
