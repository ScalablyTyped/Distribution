package typings.nextServer

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerServeStaticMod {
  
  @JSImport("next-server/dist/server/serve-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serveStatic(req: IncomingMessage, res: ServerResponse[IncomingMessage], path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
