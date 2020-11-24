package typings.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolyfillStringOptions extends GetPolyfillsOptions {
  
  var minify: js.UndefOr[Boolean] = js.native
  
  var unknown: js.UndefOr[Unknown] = js.native
}
object GetPolyfillStringOptions {
  
  @scala.inline
  def apply(uaString: String): GetPolyfillStringOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolyfillStringOptions]
  }
  
  @scala.inline
  implicit class GetPolyfillStringOptionsOps[Self <: GetPolyfillStringOptions] (val x: Self) extends AnyVal {
    
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
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setUnknown(value: Unknown): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
}
