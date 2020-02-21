package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.PullsGetCommentsForReviewParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.PullsGetCommentsForReviewParamsDeprecatedNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsAnyPromisePullsGetCommentsForReviewParams extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetCommentsForReviewResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsGetCommentsForReviewParamsDeprecatedNumber with PullsGetCommentsForReviewParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsGetCommentsForReviewResponse> */ _
  ] = js.native
}

