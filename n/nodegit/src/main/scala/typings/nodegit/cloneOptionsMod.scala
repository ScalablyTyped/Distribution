package typings.nodegit

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.fetchOptionsMod.FetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneOptionsMod {
  
  @JSImport("nodegit/clone-options", "CloneOptions")
  @js.native
  class CloneOptions () extends StObject {
    
    var bare: js.UndefOr[Double] = js.native
    
    var checkoutBranch: js.UndefOr[String] = js.native
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
    
    var fetchOpts: js.UndefOr[FetchOptions] = js.native
    
    var local: js.UndefOr[Double] = js.native
    
    var remoteCbPayload: js.UndefOr[js.Any] = js.native
    
    var repositoryCbPayload: js.UndefOr[js.Any] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
