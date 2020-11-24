package typings.nodegit.submoduleUpdateOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.fetchOptionsMod.FetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmoduleUpdateOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
  
  var cloneCheckoutStrategy: js.UndefOr[Double] = js.native
  
  var fetchOpts: js.UndefOr[FetchOptions] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object SubmoduleUpdateOptions {
  
  @scala.inline
  def apply(): SubmoduleUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmoduleUpdateOptions]
  }
  
  @scala.inline
  implicit class SubmoduleUpdateOptionsOps[Self <: SubmoduleUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckoutOpts(value: CheckoutOptions): Self = this.set("checkoutOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckoutOpts: Self = this.set("checkoutOpts", js.undefined)
    
    @scala.inline
    def setCloneCheckoutStrategy(value: Double): Self = this.set("cloneCheckoutStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneCheckoutStrategy: Self = this.set("cloneCheckoutStrategy", js.undefined)
    
    @scala.inline
    def setFetchOpts(value: FetchOptions): Self = this.set("fetchOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOpts: Self = this.set("fetchOpts", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
