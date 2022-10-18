package typings.octokitEndpoint

import typings.octokitTypes.distTypesEndpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.distTypesRequestOptionsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParseMod {
  
  @JSImport("@octokit/endpoint/dist-types/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(options: EndpointDefaults): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
}
