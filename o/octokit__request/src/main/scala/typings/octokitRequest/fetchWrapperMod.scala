package typings.octokitRequest

import typings.octokitRequest.anon.Data
import typings.octokitRequest.anon.Redirect
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/request/dist-types/fetch-wrapper", JSImport.Namespace)
@js.native
object fetchWrapperMod extends js.Object {
  def default(requestOptions: ReturnType[EndpointInterface[js.Object]] with Redirect): js.Promise[Data] = js.native
}

