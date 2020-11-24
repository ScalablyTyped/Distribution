package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPv4Range extends IpRange {
  
  // Lower address.
  var lowerAddress: js.UndefOr[String] = js.native
  
  // Upper address.
  var upperAddress: js.UndefOr[String] = js.native
}
object IPv4Range {
  
  @scala.inline
  def apply(): IPv4Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPv4Range]
  }
  
  @scala.inline
  implicit class IPv4RangeOps[Self <: IPv4Range] (val x: Self) extends AnyVal {
    
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
    def setLowerAddress(value: String): Self = this.set("lowerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowerAddress: Self = this.set("lowerAddress", js.undefined)
    
    @scala.inline
    def setUpperAddress(value: String): Self = this.set("upperAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpperAddress: Self = this.set("upperAddress", js.undefined)
  }
}
