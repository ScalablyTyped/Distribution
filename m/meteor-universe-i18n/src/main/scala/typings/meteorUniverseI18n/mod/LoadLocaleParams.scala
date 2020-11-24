package typings.meteorUniverseI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadLocaleParams extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var fresh: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var pathOnHost: js.UndefOr[String] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object LoadLocaleParams {
  
  @scala.inline
  def apply(): LoadLocaleParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadLocaleParams]
  }
  
  @scala.inline
  implicit class LoadLocaleParamsOps[Self <: LoadLocaleParams] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setFresh(value: Boolean): Self = this.set("fresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFresh: Self = this.set("fresh", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPathOnHost(value: String): Self = this.set("pathOnHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathOnHost: Self = this.set("pathOnHost", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
