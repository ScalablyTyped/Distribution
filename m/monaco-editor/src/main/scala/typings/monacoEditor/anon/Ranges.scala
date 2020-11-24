package typings.monacoEditor.anon

import typings.monacoEditor.mod.IRange
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ranges extends js.Object {
  
  var ranges: js.Array[IRange] = js.native
  
  var wordPattern: js.UndefOr[RegExp] = js.native
}
object Ranges {
  
  @scala.inline
  def apply(ranges: js.Array[IRange]): Ranges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranges]
  }
  
  @scala.inline
  implicit class RangesOps[Self <: Ranges] (val x: Self) extends AnyVal {
    
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
    def setRangesVarargs(value: IRange*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[IRange]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordPattern(value: RegExp): Self = this.set("wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordPattern: Self = this.set("wordPattern", js.undefined)
  }
}
