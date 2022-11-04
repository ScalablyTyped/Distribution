package typings.nextAuth.anon

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  cookies :next.next/server.NextRequest['cookies'] | next.next.NextApiRequest['cookies'],   headers :next.next/server.NextRequest['headers'] | next.next.NextApiRequest['headers']}> */
trait PartialcookiesNextRequest extends StObject {
  
  var cookies: js.UndefOr[
    (/* import warning: importer.ImportType#apply Failed type conversion: next.next/server.NextRequest['cookies'] */ js.Any) | js.Object
  ] = js.undefined
  
  var headers: js.UndefOr[typings.std.Headers | IncomingHttpHeaders] = js.undefined
}
object PartialcookiesNextRequest {
  
  inline def apply(): PartialcookiesNextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcookiesNextRequest]
  }
  
  extension [Self <: PartialcookiesNextRequest](x: Self) {
    
    inline def setCookies(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: next.next/server.NextRequest['cookies'] */ js.Any) | js.Object
    ): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setHeaders(value: typings.std.Headers | IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
