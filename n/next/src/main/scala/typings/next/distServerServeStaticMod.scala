package typings.next

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerServeStaticMod {
  
  @JSImport("next/dist/server/serve-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContentType(extWithoutDot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentType")(extWithoutDot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getExtension(contentType: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(contentType.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def serveStatic(req: IncomingMessage, res: ServerResponse[IncomingMessage], path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("serveStatic")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
