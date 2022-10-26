package typings.next

import typings.next.anon.SYMBOLCLEAREDCOOKIES
import typings.next.distServerApiUtilsMod.NextApiRequestCookies
import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.typesMod.SizeLimit
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBaseHttpNodeMod {
  
  @JSImport("next/dist/server/base-http/node", "NodeNextRequest")
  @js.native
  open class NodeNextRequest protected () extends BaseNextRequest[Readable] {
    def this(_req: Req) = this()
    
    /* private */ var _req: Any = js.native
    
    def originalRequest: Req = js.native
    def originalRequest_=(value: Req): Unit = js.native
    
    def parseBody(limit: SizeLimit): js.Promise[Any] = js.native
  }
  
  @JSImport("next/dist/server/base-http/node", "NodeNextResponse")
  @js.native
  open class NodeNextResponse protected () extends BaseNextResponse[Writable] {
    def this(_res: ServerResponse[IncomingMessage] & SYMBOLCLEAREDCOOKIES) = this()
    
    /* private */ var _res: Any = js.native
    
    def originalResponse: ServerResponse[IncomingMessage] & SYMBOLCLEAREDCOOKIES = js.native
    
    @JSName("statusCode")
    def statusCode_MNodeNextResponse: Double = js.native
    
    @JSName("statusMessage")
    def statusMessage_MNodeNextResponse: String = js.native
    
    /* private */ var textBody: Any = js.native
  }
  
  @js.native
  trait Req extends IncomingMessage {
    
    var cookies: js.UndefOr[NextApiRequestCookies] = js.native
  }
}
