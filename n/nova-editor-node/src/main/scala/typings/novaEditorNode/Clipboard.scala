package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/clipboard/
@js.native
trait Clipboard extends js.Object {
  
  def readText(): js.Promise[String] = js.native
  
  def writeText(text: String): js.Promise[Unit] = js.native
}
object Clipboard {
  
  @scala.inline
  def apply(readText: () => js.Promise[String], writeText: String => js.Promise[Unit]): Clipboard = {
    val __obj = js.Dynamic.literal(readText = js.Any.fromFunction0(readText), writeText = js.Any.fromFunction1(writeText))
    __obj.asInstanceOf[Clipboard]
  }
  
  @scala.inline
  implicit class ClipboardOps[Self <: Clipboard] (val x: Self) extends AnyVal {
    
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
    def setReadText(value: () => js.Promise[String]): Self = this.set("readText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWriteText(value: String => js.Promise[Unit]): Self = this.set("writeText", js.Any.fromFunction1(value))
  }
}
