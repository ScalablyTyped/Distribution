package typings.postmark.anon

import typings.postmark.messageSupportingTypesMod.LinkClickLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickLocation extends js.Object {
  
  var ClickLocation: LinkClickLocation = js.native
  
  var Link: String = js.native
  
  var Summary: String = js.native
}
object ClickLocation {
  
  @scala.inline
  def apply(ClickLocation: LinkClickLocation, Link: String, Summary: String): ClickLocation = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLocation]
  }
  
  @scala.inline
  implicit class ClickLocationOps[Self <: ClickLocation] (val x: Self) extends AnyVal {
    
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
    def setClickLocation(value: LinkClickLocation): Self = this.set("ClickLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("Link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = this.set("Summary", value.asInstanceOf[js.Any])
  }
}
