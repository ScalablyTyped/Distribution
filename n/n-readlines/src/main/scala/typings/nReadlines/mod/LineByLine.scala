package typings.nReadlines.mod

import typings.nReadlines.nReadlinesBooleans.`false`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineByLine extends js.Object {
  
  def close(): Unit = js.native
  
  def next(): Buffer | `false` = js.native
  
  def reset(): Unit = js.native
}
object LineByLine {
  
  @scala.inline
  def apply(close: () => Unit, next: () => Buffer | `false`, reset: () => Unit): LineByLine = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[LineByLine]
  }
  
  @scala.inline
  implicit class LineByLineOps[Self <: LineByLine] (val x: Self) extends AnyVal {
    
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
    def setNext(value: () => Buffer | `false`): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
  }
}
