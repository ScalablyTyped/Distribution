package typings.polyfillService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolyfillsOptions extends js.Object {
  
  var excludes: js.UndefOr[js.Array[String]] = js.native
  
  var features: js.UndefOr[Features] = js.native
  
  var uaString: String = js.native
}
object GetPolyfillsOptions {
  
  @scala.inline
  def apply(uaString: String): GetPolyfillsOptions = {
    val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolyfillsOptions]
  }
  
  @scala.inline
  implicit class GetPolyfillsOptionsOps[Self <: GetPolyfillsOptions] (val x: Self) extends AnyVal {
    
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
    def setUaString(value: String): Self = this.set("uaString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setFeatures(value: Features): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
  }
}
