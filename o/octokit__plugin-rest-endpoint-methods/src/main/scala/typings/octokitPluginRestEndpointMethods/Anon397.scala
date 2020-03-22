package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.ReposListInvitationsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon397 extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReposListInvitationsResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReposListInvitationsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReposListInvitationsResponse> */ _
  ] = js.native
}

