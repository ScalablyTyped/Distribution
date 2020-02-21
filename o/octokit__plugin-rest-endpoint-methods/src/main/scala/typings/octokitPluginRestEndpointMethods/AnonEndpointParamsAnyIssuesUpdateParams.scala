package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.IssuesUpdateParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.IssuesUpdateParamsDeprecatedAssignee
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.IssuesUpdateParamsDeprecatedNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsAnyIssuesUpdateParams extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with IssuesUpdateParamsDeprecatedNumber with IssuesUpdateParamsDeprecatedAssignee with IssuesUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<IssuesUpdateResponse> */ _
  ] = js.native
}

