package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.OrgsUpdateParams
import typings.octokitPluginRestEndpointMethods.typesMod.OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon233 extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with OrgsUpdateParamsDeprecatedMembersAllowedRepositoryCreationType with OrgsUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<OrgsUpdateResponse> */ _
  ] = js.native
}

