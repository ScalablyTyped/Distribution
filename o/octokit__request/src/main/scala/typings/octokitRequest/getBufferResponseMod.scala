package typings.octokitRequest

import typings.nodeFetch.mod.Response
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBufferResponseMod {
  
  @JSImport("@octokit/request/dist-types/get-buffer-response", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(response: Response): js.Promise[ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArrayBuffer]]
}
