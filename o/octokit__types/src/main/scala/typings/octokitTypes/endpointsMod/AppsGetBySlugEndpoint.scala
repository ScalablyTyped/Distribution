package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppsGetBySlugEndpoint extends js.Object {
  
  var app_slug: String = js.native
}
object AppsGetBySlugEndpoint {
  
  @scala.inline
  def apply(app_slug: String): AppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(app_slug = app_slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetBySlugEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetBySlugEndpointOps[Self <: AppsGetBySlugEndpoint] (val x: Self) extends AnyVal {
    
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
    def setApp_slug(value: String): Self = this.set("app_slug", value.asInstanceOf[js.Any])
  }
}
