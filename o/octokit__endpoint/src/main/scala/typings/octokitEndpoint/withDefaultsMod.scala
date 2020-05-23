package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/endpoint/dist-types/with-defaults", JSImport.Namespace)
@js.native
object withDefaultsMod extends js.Object {
  def withDefaults(oldDefaults: Null, newDefaults: RequestParameters): EndpointInterface[js.Object] = js.native
  def withDefaults(oldDefaults: EndpointDefaults, newDefaults: RequestParameters): EndpointInterface[js.Object] = js.native
}

