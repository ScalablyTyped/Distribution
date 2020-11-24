package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalAccessPlatforms extends js.Object {
  
  // Possible values are: android, iOS, windows, windowsPhone, macOS, unknownFutureValue.
  var excludePlatforms: js.UndefOr[js.Array[ConditionalAccessDevicePlatform]] = js.native
  
  // Possible values are: android, iOS, windows, windowsPhone, macOS, all, unknownFutureValue.
  var includePlatforms: js.UndefOr[js.Array[ConditionalAccessDevicePlatform]] = js.native
}
object ConditionalAccessPlatforms {
  
  @scala.inline
  def apply(): ConditionalAccessPlatforms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessPlatforms]
  }
  
  @scala.inline
  implicit class ConditionalAccessPlatformsOps[Self <: ConditionalAccessPlatforms] (val x: Self) extends AnyVal {
    
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
    def setExcludePlatformsVarargs(value: ConditionalAccessDevicePlatform*): Self = this.set("excludePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setExcludePlatforms(value: js.Array[ConditionalAccessDevicePlatform]): Self = this.set("excludePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludePlatforms: Self = this.set("excludePlatforms", js.undefined)
    
    @scala.inline
    def setIncludePlatformsVarargs(value: ConditionalAccessDevicePlatform*): Self = this.set("includePlatforms", js.Array(value :_*))
    
    @scala.inline
    def setIncludePlatforms(value: js.Array[ConditionalAccessDevicePlatform]): Self = this.set("includePlatforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePlatforms: Self = this.set("includePlatforms", js.undefined)
  }
}
