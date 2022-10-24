package typings.nextServer

import typings.nextServer.anon.GenerateEtags
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerSendHtmlMod {
  
  @JSImport("next-server/dist/server/send-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendHTML(req: IncomingMessage, res: ServerResponse[IncomingMessage], html: String, param3: GenerateEtags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendHTML")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], html.asInstanceOf[js.Any], param3.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
