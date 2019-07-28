package typings.openstackDashWrapper.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "Glance")
@js.native
class Glance protected () extends js.Object {
  def this(endpoint_url: String, auth_token: String) = this()
  var logger: js.Any = js.native
  var mangleObject: js.Any = js.native
  var mangler: js.Any = js.native
  var request: js.Any = js.native
  var request_id: js.Any = js.native
  var timeout: js.Any = js.native
  var token: js.Any = js.native
  var url: js.Any = js.native
  var user_name: js.Any = js.native
  def getImage(id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getRequestOptions(path: String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
  def listImages(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def queueImage(data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeImage(id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def setLogger(logger: js.Any): Unit = js.native
  def setMangler(mangle_lib: js.Any): Unit = js.native
  def setRequest(request_lib: js.Any): Unit = js.native
  def setRequestID(request_id: js.Any): Unit = js.native
  def setTimeout(new_timeout: js.Any): Unit = js.native
  def setUserName(user_name: String): Unit = js.native
  def updateImage(id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def uploadImage(id: js.Any, stream: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
}

