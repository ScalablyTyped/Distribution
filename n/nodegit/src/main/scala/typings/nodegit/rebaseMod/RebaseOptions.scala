package typings.nodegit.rebaseMod

import typings.nodegit.checkoutOptionsMod.CheckoutOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebaseOptions extends js.Object {
  
  var checkoutOptions: CheckoutOptions = js.native
  
  var quiet: Double = js.native
  
  var rewriteNotesRef: String = js.native
  
  var version: Double = js.native
}
object RebaseOptions {
  
  @scala.inline
  def apply(checkoutOptions: CheckoutOptions, quiet: Double, rewriteNotesRef: String, version: Double): RebaseOptions = {
    val __obj = js.Dynamic.literal(checkoutOptions = checkoutOptions.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], rewriteNotesRef = rewriteNotesRef.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebaseOptions]
  }
  
  @scala.inline
  implicit class RebaseOptionsOps[Self <: RebaseOptions] (val x: Self) extends AnyVal {
    
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
    def setCheckoutOptions(value: CheckoutOptions): Self = this.set("checkoutOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: Double): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewriteNotesRef(value: String): Self = this.set("rewriteNotesRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
