package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clicks extends js.Object {
  
  var Clicks: Double = js.native
  
  var Date: String = js.native
  
  var Unique: Double = js.native
}
object Clicks {
  
  @scala.inline
  def apply(Clicks: Double, Date: String, Unique: Double): Clicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clicks]
  }
  
  @scala.inline
  implicit class ClicksOps[Self <: Clicks] (val x: Self) extends AnyVal {
    
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
    def setClicks(value: Double): Self = this.set("Clicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Double): Self = this.set("Unique", value.asInstanceOf[js.Any])
  }
}
