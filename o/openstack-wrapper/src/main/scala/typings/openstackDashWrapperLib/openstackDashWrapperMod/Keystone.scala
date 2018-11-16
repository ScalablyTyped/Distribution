package typings
package openstackDashWrapperLib.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "Keystone")
@js.native
class Keystone protected () extends js.Object {
  def this(endpoint_url: java.lang.String) = this()
  var logger: js.Any = js.native
  var mangleObject: js.Any = js.native
  var mangler: js.Any = js.native
  var request: js.Any = js.native
  var request_id: js.Any = js.native
  var timeout: js.Any = js.native
  var url: js.Any = js.native
  var user_name: js.Any = js.native
  def addRoleAssignment(
    project_token: js.Any,
    project_id: js.Any,
    entry_id: js.Any,
    entry_type: js.Any,
    role_id: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def getProjectByName(admin_access_token: js.Any, project_name: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getProjectToken(access_token: js.Any, project_id: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getProjectTokenByName(
    access_token: js.Any,
    domain_id: js.Any,
    project_name: java.lang.String,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def getProjectTokenForReal(auth_data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getRequestOptions(path: java.lang.String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
  def getToken(username: java.lang.String, password: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listMetaEnvironments(auth_token: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listMetaOwningGroups(auth_token: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listProjectMeta(project_token: js.Any, project_id: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listProjects(admin_access_token: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listRoleAssignments(project_token: js.Any, project_id: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listRoles(project_token: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listUserProjects(username: js.Any, access_token: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeRoleAssignment(
    project_token: js.Any,
    project_id: js.Any,
    entry_id: js.Any,
    entry_type: js.Any,
    role_id: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def setLogger(logger: js.Any): scala.Unit = js.native
  def setMangler(mangle_lib: js.Any): scala.Unit = js.native
  def setRequest(request_lib: js.Any): scala.Unit = js.native
  def setRequestID(request_id: js.Any): scala.Unit = js.native
  def setTimeout(new_timeout: js.Any): scala.Unit = js.native
  def setUserName(user_name: java.lang.String): scala.Unit = js.native
  def updateProjectMeta(
    project_token: js.Any,
    project_id: js.Any,
    new_meta: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
}

