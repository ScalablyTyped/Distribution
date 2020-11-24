package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Compare the state of your heap between two points in time, telling you what has been allocated, and what has been released.
  */
@js.native
trait HeapDiff extends js.Object {
  
  /**
    * Compute the diff.
    */
  def end(): HeapDiffInformation = js.native
}
object HeapDiff {
  
  @scala.inline
  def apply(end: () => HeapDiffInformation): HeapDiff = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
    __obj.asInstanceOf[HeapDiff]
  }
  
  @scala.inline
  implicit class HeapDiffOps[Self <: HeapDiff] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => HeapDiffInformation): Self = this.set("end", js.Any.fromFunction0(value))
  }
}
