package typings.postmark.statsMod

import typings.postmark.anon.HTML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickLocationCounts extends js.Object {
  
  var Days: js.Array[HTML] = js.native
  
  var HTML: Double = js.native
  
  var Text: Double = js.native
}
object ClickLocationCounts {
  
  @scala.inline
  def apply(Days: js.Array[HTML], HTML: Double, Text: Double): ClickLocationCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], HTML = HTML.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLocationCounts]
  }
  
  @scala.inline
  implicit class ClickLocationCountsOps[Self <: ClickLocationCounts] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: HTML*): Self = this.set("Days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[HTML]): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTML(value: Double): Self = this.set("HTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Double): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
}
