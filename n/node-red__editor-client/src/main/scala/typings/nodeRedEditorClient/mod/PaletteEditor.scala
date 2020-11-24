package typings.nodeRedEditorClient.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaletteEditor extends js.Object {
  
  def init(): Unit = js.native
  
  def install(entry: js.Object, container: js.Object, done: js.Function1[/* ret */ Error | js.Object, Unit]): Unit = js.native
}
object PaletteEditor {
  
  @scala.inline
  def apply(
    init: () => Unit,
    install: (js.Object, js.Object, js.Function1[/* ret */ Error | js.Object, Unit]) => Unit
  ): PaletteEditor = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), install = js.Any.fromFunction3(install))
    __obj.asInstanceOf[PaletteEditor]
  }
  
  @scala.inline
  implicit class PaletteEditorOps[Self <: PaletteEditor] (val x: Self) extends AnyVal {
    
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
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstall(value: (js.Object, js.Object, js.Function1[/* ret */ Error | js.Object, Unit]) => Unit): Self = this.set("install", js.Any.fromFunction3(value))
  }
}
