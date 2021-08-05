package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Palette extends StObject {
  
  def add(nt: String, `def`: js.Object): Unit
  
  var editor: PaletteEditor
  
  def getCategories(): js.Array[Label]
  
  def hide(nt: String): Unit
  
  def init(): Unit
  
  def refresh(): Unit
  
  def remove(nt: String): Unit
  
  def show(nt: String): Unit
}
object Palette {
  
  inline def apply(
    add: (String, js.Object) => Unit,
    editor: PaletteEditor,
    getCategories: () => js.Array[Label],
    hide: String => Unit,
    init: () => Unit,
    refresh: () => Unit,
    remove: String => Unit,
    show: String => Unit
  ): Palette = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), editor = editor.asInstanceOf[js.Any], getCategories = js.Any.fromFunction0(getCategories), hide = js.Any.fromFunction1(hide), init = js.Any.fromFunction0(init), refresh = js.Any.fromFunction0(refresh), remove = js.Any.fromFunction1(remove), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Palette]
  }
  
  extension [Self <: Palette](x: Self) {
    
    inline def setAdd(value: (String, js.Object) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setEditor(value: PaletteEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setGetCategories(value: () => js.Array[Label]): Self = StObject.set(x, "getCategories", js.Any.fromFunction0(value))
    
    inline def setHide(value: String => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
