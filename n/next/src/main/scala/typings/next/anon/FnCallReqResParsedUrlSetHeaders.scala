package typings.next.anon

import typings.next.distServerBaseHttpMod.BaseNextRequest
import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallReqResParsedUrlSetHeaders extends StObject {
  
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any]): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: BaseNextResponse[Any],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: ServerResponse[IncomingMessage],
    parsedUrl: Unit,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: BaseNextRequest[Any], res: ServerResponse[IncomingMessage], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: BaseNextRequest[Any],
    res: ServerResponse[IncomingMessage],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any]): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: BaseNextResponse[Any], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: BaseNextResponse[Any],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage]): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: Unit, setHeaders: Boolean): js.Promise[Unit] = js.native
  def apply(req: IncomingMessage, res: ServerResponse[IncomingMessage], parsedUrl: NextUrlWithParsedQuery): js.Promise[Unit] = js.native
  def apply(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    parsedUrl: NextUrlWithParsedQuery,
    setHeaders: Boolean
  ): js.Promise[Unit] = js.native
}
