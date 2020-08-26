package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredResourceAccess extends js.Object {
  // The list of OAuth2.0 permission scopes and app roles that the application requires from the specified resource.
  var resourceAccess: js.UndefOr[js.Array[ResourceAccess]] = js.native
  /**
    * The unique identifier for the resource that the application requires access to. This should be equal to the appId
    * declared on the target resource application.
    */
  var resourceAppId: js.UndefOr[String] = js.native
}

object RequiredResourceAccess {
  @scala.inline
  def apply(): RequiredResourceAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredResourceAccess]
  }
  @scala.inline
  implicit class RequiredResourceAccessOps[Self <: RequiredResourceAccess] (val x: Self) extends AnyVal {
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
    def setResourceAccessVarargs(value: ResourceAccess*): Self = this.set("resourceAccess", js.Array(value :_*))
    @scala.inline
    def setResourceAccess(value: js.Array[ResourceAccess]): Self = this.set("resourceAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAccess: Self = this.set("resourceAccess", js.undefined)
    @scala.inline
    def setResourceAppId(value: String): Self = this.set("resourceAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceAppId: Self = this.set("resourceAppId", js.undefined)
  }
  
}

