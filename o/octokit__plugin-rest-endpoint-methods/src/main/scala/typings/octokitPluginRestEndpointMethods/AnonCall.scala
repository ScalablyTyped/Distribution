package typings.octokitPluginRestEndpointMethods

import typings.octokitPluginRestEndpointMethods.typesMod.ActionsCancelWorkflowRunParams
import typings.octokitPluginRestEndpointMethods.typesMod.AnyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[AnyResponse] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsCancelWorkflowRunParams
  ): js.Promise[AnyResponse] = js.native
}

