package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withDefaultsMod {
  
  @JSImport("@octokit/endpoint/dist-types/with-defaults", "withDefaults")
  @js.native
  def withDefaults(oldDefaults: Null, newDefaults: RequestParameters): EndpointInterface[js.Object] = js.native
  @JSImport("@octokit/endpoint/dist-types/with-defaults", "withDefaults")
  @js.native
  def withDefaults(oldDefaults: EndpointDefaults, newDefaults: RequestParameters): EndpointInterface[js.Object] = js.native
}
