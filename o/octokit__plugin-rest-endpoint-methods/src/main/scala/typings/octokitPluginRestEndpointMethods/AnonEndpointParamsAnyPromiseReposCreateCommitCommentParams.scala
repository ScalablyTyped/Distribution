package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReposCreateCommitCommentParams
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReposCreateCommitCommentParamsDeprecatedLine
import typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ReposCreateCommitCommentParamsDeprecatedSha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointParamsAnyPromiseReposCreateCommitCommentParams extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReposCreateCommitCommentResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ReposCreateCommitCommentParamsDeprecatedSha with ReposCreateCommitCommentParamsDeprecatedLine with ReposCreateCommitCommentParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ReposCreateCommitCommentResponse> */ _
  ] = js.native
}

