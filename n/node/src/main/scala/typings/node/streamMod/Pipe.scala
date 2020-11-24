package typings.node.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipe extends js.Object {
  
  def close(): Unit = js.native
  
  def hasRef(): Boolean = js.native
  
  def ref(): Unit = js.native
  
  def unref(): Unit = js.native
}
object Pipe {
  
  @scala.inline
  def apply(close: () => Unit, hasRef: () => Boolean, ref: () => Unit, unref: () => Unit): Pipe = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
    __obj.asInstanceOf[Pipe]
  }
  
  @scala.inline
  implicit class PipeOps[Self <: Pipe] (val x: Self) extends AnyVal {
    
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
    def setHasRef(value: () => Boolean): Self = this.set("hasRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRef(value: () => Unit): Self = this.set("ref", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnref(value: () => Unit): Self = this.set("unref", js.Any.fromFunction0(value))
  }
}
