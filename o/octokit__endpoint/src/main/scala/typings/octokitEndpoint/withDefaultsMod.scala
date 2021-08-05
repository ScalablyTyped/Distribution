package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.octokitTypes.requestParametersMod.RequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withDefaultsMod {
  
  @JSImport("@octokit/endpoint/dist-types/with-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withDefaults(oldDefaults: Null, newDefaults: RequestParameters): EndpointInterface[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaults")(oldDefaults.asInstanceOf[js.Any], newDefaults.asInstanceOf[js.Any])).asInstanceOf[EndpointInterface[js.Object]]
  inline def withDefaults(oldDefaults: EndpointDefaults, newDefaults: RequestParameters): EndpointInterface[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDefaults")(oldDefaults.asInstanceOf[js.Any], newDefaults.asInstanceOf[js.Any])).asInstanceOf[EndpointInterface[js.Object]]
}
