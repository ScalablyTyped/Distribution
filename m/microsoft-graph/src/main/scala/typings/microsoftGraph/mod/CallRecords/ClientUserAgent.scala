package typings.microsoftGraph.mod.CallRecords

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientUserAgent extends UserAgent {
  
  /**
    * Identifies the platform used by this endpoint. Possible values are: unknown, windows, macOS, iOS, android, web,
    * ipPhone, roomSystem, surfaceHub, holoLens, unknownFutureValue.
    */
  var platform: js.UndefOr[ClientPlatform] = js.native
  
  /**
    * Identifies the family of application software used by this endpoint. Possible values are: unknown, teams,
    * skypeForBusiness, lync, unknownFutureValue.
    */
  var productFamily: js.UndefOr[ProductFamily] = js.native
}
object ClientUserAgent {
  
  @scala.inline
  def apply(): ClientUserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientUserAgent]
  }
  
  @scala.inline
  implicit class ClientUserAgentOps[Self <: ClientUserAgent] (val x: Self) extends AnyVal {
    
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
    def setPlatform(value: ClientPlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setProductFamily(value: ProductFamily): Self = this.set("productFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductFamily: Self = this.set("productFamily", js.undefined)
  }
}
