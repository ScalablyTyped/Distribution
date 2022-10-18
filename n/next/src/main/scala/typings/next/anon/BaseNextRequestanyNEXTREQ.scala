package typings.next.anon

import typings.next.distServerApiUtilsMod.NextApiRequestCookies
import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next.next/dist/server/base-http.BaseNextRequest<any> & {[NEXT_REQUEST_META] : next.next/dist/server/request-meta.RequestMeta | undefined} */
@js.native
trait BaseNextRequestanyNEXTREQ extends StObject {
  
  /* protected */ var _cookies: js.UndefOr[NextApiRequestCookies] = js.native
  
  var body: Any = js.native
  
  def cookies: js.Object = js.native
  
  var headers: IncomingHttpHeaders = js.native
  
  var method: String = js.native
  
  def parseBody(limit: String): js.Promise[Any] = js.native
  def parseBody(limit: Double): js.Promise[Any] = js.native
  
  var url: String = js.native
}
