package typings.openstackDashWrapper.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getSimpleProject(
    username: String,
    password: String,
    project_id: String,
    keystone_url: String,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
}

