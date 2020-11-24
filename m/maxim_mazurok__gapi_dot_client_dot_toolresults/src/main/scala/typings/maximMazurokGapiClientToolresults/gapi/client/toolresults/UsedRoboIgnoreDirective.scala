package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsedRoboIgnoreDirective extends js.Object {
  
  /** The name of the resource that was ignored. */
  var resourceName: js.UndefOr[String] = js.native
}
object UsedRoboIgnoreDirective {
  
  @scala.inline
  def apply(): UsedRoboIgnoreDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedRoboIgnoreDirective]
  }
  
  @scala.inline
  implicit class UsedRoboIgnoreDirectiveOps[Self <: UsedRoboIgnoreDirective] (val x: Self) extends AnyVal {
    
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
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
}
