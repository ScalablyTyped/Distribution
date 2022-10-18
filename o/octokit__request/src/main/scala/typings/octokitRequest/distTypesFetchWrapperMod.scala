package typings.octokitRequest

import typings.octokitRequest.anon.Data
import typings.octokitRequest.anon.Redirect
import typings.octokitTypes.distTypesEndpointInterfaceMod.EndpointInterface
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFetchWrapperMod {
  
  @JSImport("@octokit/request/dist-types/fetch-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(requestOptions: ReturnType[EndpointInterface[js.Object]] & Redirect): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(requestOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
}
