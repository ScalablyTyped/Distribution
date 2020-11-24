package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Out extends js.Object {
  
  def in[T](`val`: T): T = js.native
  
  def out[T](`val`: T): T = js.native
}
object Out {
  
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): Out = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[Out]
  }
  
  @scala.inline
  implicit class OutOps[Self <: Out] (val x: Self) extends AnyVal {
    
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
    def setIn(value: js.Any => js.Any): Self = this.set("in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOut(value: js.Any => js.Any): Self = this.set("out", js.Any.fromFunction1(value))
  }
}
