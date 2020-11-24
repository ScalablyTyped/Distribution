package typings.octokitAuthToken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnyResponse = typings.octokitTypes.octokitResponseMod.OctokitResponse[js.Any]
  
  type EndpointDefaults = typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
  
  type EndpointOptions = typings.octokitTypes.endpointOptionsMod.EndpointOptions
  
  type RequestInterface = typings.octokitTypes.requestInterfaceMod.RequestInterface[js.Object]
  
  type RequestParameters = typings.octokitTypes.requestParametersMod.RequestParameters
  
  type Route = typings.octokitTypes.routeMod.Route
  
  type StrategyInterface = typings.octokitTypes.strategyInterfaceMod.StrategyInterface[
    js.Array[typings.octokitAuthToken.typesMod.Token], 
    js.Array[js.Any], 
    typings.octokitAuthToken.typesMod.Authentication
  ]
  
  type Token = java.lang.String
}
