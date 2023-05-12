package typings.microFtch

import typings.microFtch.microFtchBooleans.`false`
import typings.microFtch.microFtchStrings.bytes
import typings.microFtch.microFtchStrings.json
import typings.microFtch.microFtchStrings.text
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<micro-ftch.micro-ftch.FETCH_OPT> */
  trait PartialFETCHOPT extends StObject {
    
    var _redirectCount: js.UndefOr[Double] = js.undefined
    
    var cors: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var expectStatusCode: js.UndefOr[Double | `false`] = js.undefined
    
    var full: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[Boolean] = js.undefined
    
    var referrer: js.UndefOr[Boolean] = js.undefined
    
    var sslAllowSelfSigned: js.UndefOr[Boolean] = js.undefined
    
    var sslPinnedCertificates: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[text | json | bytes] = js.undefined
  }
  object PartialFETCHOPT {
    
    inline def apply(): PartialFETCHOPT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFETCHOPT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFETCHOPT] (val x: Self) extends AnyVal {
      
      inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExpectStatusCode(value: Double | `false`): Self = StObject.set(x, "expectStatusCode", value.asInstanceOf[js.Any])
      
      inline def setExpectStatusCodeUndefined: Self = StObject.set(x, "expectStatusCode", js.undefined)
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: Boolean): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSslAllowSelfSigned(value: Boolean): Self = StObject.set(x, "sslAllowSelfSigned", value.asInstanceOf[js.Any])
      
      inline def setSslAllowSelfSignedUndefined: Self = StObject.set(x, "sslAllowSelfSigned", js.undefined)
      
      inline def setSslPinnedCertificates(value: js.Array[String]): Self = StObject.set(x, "sslPinnedCertificates", value.asInstanceOf[js.Any])
      
      inline def setSslPinnedCertificatesUndefined: Self = StObject.set(x, "sslPinnedCertificates", js.undefined)
      
      inline def setSslPinnedCertificatesVarargs(value: String*): Self = StObject.set(x, "sslPinnedCertificates", js.Array(value*))
      
      inline def setType(value: text | json | bytes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def set_redirectCount(value: Double): Self = StObject.set(x, "_redirectCount", value.asInstanceOf[js.Any])
      
      inline def set_redirectCountUndefined: Self = StObject.set(x, "_redirectCount", js.undefined)
    }
  }
}
