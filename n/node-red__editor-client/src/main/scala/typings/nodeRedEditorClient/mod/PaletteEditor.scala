package typings.nodeRedEditorClient.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteEditor extends StObject {
  
  def init(): Unit
  
  def install(entry: js.Object, container: js.Object, done: js.Function1[/* ret */ Error | js.Object, Unit]): Unit
}
object PaletteEditor {
  
  inline def apply(
    init: () => Unit,
    install: (js.Object, js.Object, js.Function1[/* ret */ Error | js.Object, Unit]) => Unit
  ): PaletteEditor = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), install = js.Any.fromFunction3(install))
    __obj.asInstanceOf[PaletteEditor]
  }
  
  extension [Self <: PaletteEditor](x: Self) {
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setInstall(value: (js.Object, js.Object, js.Function1[/* ret */ Error | js.Object, Unit]) => Unit): Self = StObject.set(x, "install", js.Any.fromFunction3(value))
  }
}
