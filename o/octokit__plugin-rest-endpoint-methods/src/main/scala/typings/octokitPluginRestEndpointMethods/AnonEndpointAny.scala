package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.ActionsDeleteArtifactParams
import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEndpointAny extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[AnyResponse] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsDeleteArtifactParams
  ): js.Promise[AnyResponse] = js.native
}

