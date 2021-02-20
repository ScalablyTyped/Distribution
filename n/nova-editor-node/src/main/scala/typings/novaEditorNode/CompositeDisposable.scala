package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/composite-disposable/
@js.native
trait CompositeDisposable extends Disposable {
  
  def add(`object`: Disposable): Unit = js.native
  
  def clear(): Unit = js.native
  
  def delete(`object`: Disposable): Unit = js.native
  
  def remove(`object`: Disposable): Unit = js.native
}
object CompositeDisposable {
  
  @scala.inline
  def apply(
    add: Disposable => Unit,
    clear: () => Unit,
    delete: Disposable => Unit,
    dispose: () => Unit,
    remove: Disposable => Unit
  ): CompositeDisposable = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), dispose = js.Any.fromFunction0(dispose), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[CompositeDisposable]
  }
  
  @scala.inline
  implicit class CompositeDisposableMutableBuilder[Self <: CompositeDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Disposable => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: Disposable => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Disposable => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
