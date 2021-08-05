package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.requestOptionsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("@octokit/endpoint/dist-types/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(options: EndpointDefaults): RequestOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[RequestOptions]
}
