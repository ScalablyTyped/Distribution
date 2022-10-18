package typings.octokitRequest

import typings.nodeFetch.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGetBufferResponseMod {
  
  @JSImport("@octokit/request/dist-types/get-buffer-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(response: Response): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
}
