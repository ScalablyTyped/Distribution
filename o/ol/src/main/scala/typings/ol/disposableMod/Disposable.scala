package typings.ol.disposableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disposable extends js.Object {
  
  /**
    * Clean up.
    */
  def dispose(): Unit = js.native
  
  /**
    * Extension point for disposable objects.
    */
  /* protected */ def disposeInternal(): Unit = js.native
  
  /**
    * The object has already been disposed.
    */
  var disposed: Boolean = js.native
}
object Disposable {
  
  @scala.inline
  def apply(dispose: () => Unit, disposeInternal: () => Unit, disposed: Boolean): Disposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeInternal = js.Any.fromFunction0(disposeInternal), disposed = disposed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disposable]
  }
  
  @scala.inline
  implicit class DisposableOps[Self <: Disposable] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposeInternal(value: () => Unit): Self = this.set("disposeInternal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisposed(value: Boolean): Self = this.set("disposed", value.asInstanceOf[js.Any])
  }
}
