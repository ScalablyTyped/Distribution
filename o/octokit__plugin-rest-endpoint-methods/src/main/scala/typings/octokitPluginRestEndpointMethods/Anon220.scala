package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.OrgsListInstallationsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon220 extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListInstallationsResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsListInstallationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsListInstallationsResponse> */ _
  ] = js.native
}

