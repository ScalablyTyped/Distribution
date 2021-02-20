package typings.microsoftGraph.mod.CallRecords

import org.scalablytyped.runtime.StObject
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
  implicit class ClientUserAgentMutableBuilder[Self <: ClientUserAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: ClientPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setProductFamily(value: ProductFamily): Self = StObject.set(x, "productFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductFamilyUndefined: Self = StObject.set(x, "productFamily", js.undefined)
  }
}
