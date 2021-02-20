package typings.octokitRequest

import typings.octokitRequest.anon.Data
import typings.octokitRequest.anon.Redirect
import typings.octokitTypes.endpointInterfaceMod.EndpointInterface
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchWrapperMod {
  
  @JSImport("@octokit/request/dist-types/fetch-wrapper", JSImport.Default)
  @js.native
  def default(requestOptions: ReturnType[EndpointInterface[js.Object]] with Redirect): js.Promise[Data] = js.native
}
