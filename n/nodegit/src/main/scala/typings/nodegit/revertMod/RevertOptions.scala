package typings.nodegit.revertMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import typings.nodegit.mergeOptionsMod.MergeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevertOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
  
  var mainline: js.UndefOr[Double] = js.native
  
  var mergeOpts: js.UndefOr[MergeOptions] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object RevertOptions {
  
  @scala.inline
  def apply(): RevertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertOptions]
  }
  
  @scala.inline
  implicit class RevertOptionsOps[Self <: RevertOptions] (val x: Self) extends AnyVal {
    
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
    def setMainline(value: Double): Self = this.set("mainline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainline: Self = this.set("mainline", js.undefined)
    
    @scala.inline
    def setMergeOpts(value: MergeOptions): Self = this.set("mergeOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeOpts: Self = this.set("mergeOpts", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
