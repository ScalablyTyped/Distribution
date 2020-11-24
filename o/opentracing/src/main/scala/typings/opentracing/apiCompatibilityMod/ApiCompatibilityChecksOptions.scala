package typings.opentracing.apiCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiCompatibilityChecksOptions extends js.Object {
  
  /** a boolean that controls whether or not to verify certain API functionality */
  var skipBaggageChecks: js.UndefOr[Boolean] = js.native
  
  var skipInjectExtractChecks: js.UndefOr[Boolean] = js.native
}
object ApiCompatibilityChecksOptions {
  
  @scala.inline
  def apply(): ApiCompatibilityChecksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiCompatibilityChecksOptions]
  }
  
  @scala.inline
  implicit class ApiCompatibilityChecksOptionsOps[Self <: ApiCompatibilityChecksOptions] (val x: Self) extends AnyVal {
    
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
    def setSkipBaggageChecks(value: Boolean): Self = this.set("skipBaggageChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipBaggageChecks: Self = this.set("skipBaggageChecks", js.undefined)
    
    @scala.inline
    def setSkipInjectExtractChecks(value: Boolean): Self = this.set("skipInjectExtractChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipInjectExtractChecks: Self = this.set("skipInjectExtractChecks", js.undefined)
  }
}
