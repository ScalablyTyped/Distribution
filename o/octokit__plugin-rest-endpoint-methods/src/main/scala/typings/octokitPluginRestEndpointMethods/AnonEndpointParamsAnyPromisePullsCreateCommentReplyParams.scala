package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.PullsCreateCommentReplyParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.PullsCreateCommentReplyParamsDeprecatedInReplyTo
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.PullsCreateCommentReplyParamsDeprecatedNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsAnyPromisePullsCreateCommentReplyParams extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateCommentReplyResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with PullsCreateCommentReplyParamsDeprecatedNumber with PullsCreateCommentReplyParamsDeprecatedInReplyTo with PullsCreateCommentReplyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<PullsCreateCommentReplyResponse> */ _
  ] = js.native
}

