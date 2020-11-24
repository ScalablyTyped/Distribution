package typings.plottable.anon

import typings.plottable.plottableStrings.end
import typings.plottable.plottableStrings.middle
import typings.plottable.plottableStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middle extends js.Object {
  
  var end: typings.plottable.plottableStrings.end = js.native
  
  var middle: typings.plottable.plottableStrings.middle = js.native
  
  var start: typings.plottable.plottableStrings.start = js.native
}
object Middle {
  
  @scala.inline
  def apply(end: end, middle: middle, start: start): Middle = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middle]
  }
  
  @scala.inline
  implicit class MiddleOps[Self <: Middle] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: end): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle(value: middle): Self = this.set("middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: start): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
