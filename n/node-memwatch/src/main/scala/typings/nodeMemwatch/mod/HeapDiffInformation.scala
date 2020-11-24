package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeapDiffInformation extends js.Object {
  
  var after: HeapDiffSnapshot = js.native
  
  var before: HeapDiffSnapshot = js.native
  
  var change: HeapDiffChange = js.native
}
object HeapDiffInformation {
  
  @scala.inline
  def apply(after: HeapDiffSnapshot, before: HeapDiffSnapshot, change: HeapDiffChange): HeapDiffInformation = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffInformation]
  }
  
  @scala.inline
  implicit class HeapDiffInformationOps[Self <: HeapDiffInformation] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: HeapDiffSnapshot): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: HeapDiffSnapshot): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: HeapDiffChange): Self = this.set("change", value.asInstanceOf[js.Any])
  }
}
