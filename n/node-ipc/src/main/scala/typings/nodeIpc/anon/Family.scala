package typings.nodeIpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Family extends js.Object {
  
  /**
    * Default: false
    */
  var family: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    */
  var hints: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    */
  var localAddress: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    */
  var localPort: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    */
  var lookup: js.UndefOr[Boolean] = js.native
}
object Family {
  
  @scala.inline
  def apply(): Family = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit class FamilyOps[Self <: Family] (val x: Self) extends AnyVal {
    
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
    def setFamily(value: Boolean): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setHints(value: Boolean): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: Boolean): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    
    @scala.inline
    def setLocalPort(value: Boolean): Self = this.set("localPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
    
    @scala.inline
    def setLookup(value: Boolean): Self = this.set("lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
  }
}
