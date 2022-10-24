package typings.next

import typings.next.anon.Options
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.nextBooleans.`false`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerSendPayloadMod {
  
  @JSImport("next/dist/server/send-payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendEtagResponse(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEtagResponse")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def sendEtagResponse(req: IncomingMessage, res: ServerResponse[IncomingMessage], etag: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEtagResponse")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], etag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sendRenderResult(param0: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendRenderResult")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setRevalidateHeaders(res: BaseNextResponse[Any], options: PayloadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRevalidateHeaders")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRevalidateHeaders(res: ServerResponse[IncomingMessage], options: PayloadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRevalidateHeaders")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.Private
    - typings.next.anon.Stateful
    - typings.next.anon.Revalidate
  */
  trait PayloadOptions extends StObject
  object PayloadOptions {
    
    inline def Private(): typings.next.anon.Private = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("private")(true)
      __obj.asInstanceOf[typings.next.anon.Private]
    }
    
    inline def Revalidate(`private`: Boolean, revalidate: Double | `false`): typings.next.anon.Revalidate = {
      val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any], stateful = false)
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Revalidate]
    }
    
    inline def Stateful(`private`: Boolean): typings.next.anon.Stateful = {
      val __obj = js.Dynamic.literal(stateful = true)
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Stateful]
    }
  }
}
