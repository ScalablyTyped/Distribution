package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redirects extends StObject {
  
  var headers: js.Array[scala.Nothing]
  
  var redirects: js.Array[scala.Nothing]
  
  var rewrites: AfterFilesBeforeFilesFallback
}
object Redirects {
  
  inline def apply(
    headers: js.Array[scala.Nothing],
    redirects: js.Array[scala.Nothing],
    rewrites: AfterFilesBeforeFilesFallback
  ): Redirects = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[Redirects]
  }
  
  extension [Self <: Redirects](x: Self) {
    
    inline def setHeaders(value: js.Array[scala.Nothing]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: scala.Nothing*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setRedirects(value: js.Array[scala.Nothing]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
    
    inline def setRedirectsVarargs(value: scala.Nothing*): Self = StObject.set(x, "redirects", js.Array(value*))
    
    inline def setRewrites(value: AfterFilesBeforeFilesFallback): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
  }
}
