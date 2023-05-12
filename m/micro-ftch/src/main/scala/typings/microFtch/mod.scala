package typings.microFtch

import typings.microFtch.anon.PartialFETCHOPT
import typings.microFtch.microFtchBooleans.`false`
import typings.microFtch.microFtchStrings.bytes
import typings.microFtch.microFtchStrings.json
import typings.microFtch.microFtchStrings.text
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micro-ftch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def default(url: String, options: PartialFETCHOPT): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  @JSImport("micro-ftch", "InvalidCertError")
  @js.native
  open class InvalidCertError protected ()
    extends StObject
       with Error {
    def this(msg: String, fingerprint256: String) = this()
    
    val fingerprint256: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("micro-ftch", "InvalidStatusCodeError")
  @js.native
  open class InvalidStatusCodeError protected ()
    extends StObject
       with Error {
    def this(statusCode: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val statusCode: Double = js.native
  }
  
  trait FETCH_OPT extends StObject {
    
    var _redirectCount: Double
    
    var cors: Boolean
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var expectStatusCode: js.UndefOr[Double | `false`] = js.undefined
    
    var full: Boolean
    
    var headers: Record[String, String]
    
    var keepAlive: Boolean
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirect: Boolean
    
    var referrer: Boolean
    
    var sslAllowSelfSigned: Boolean
    
    var sslPinnedCertificates: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: js.UndefOr[text | json | bytes] = js.undefined
  }
  object FETCH_OPT {
    
    inline def apply(
      _redirectCount: Double,
      cors: Boolean,
      full: Boolean,
      headers: Record[String, String],
      keepAlive: Boolean,
      redirect: Boolean,
      referrer: Boolean,
      sslAllowSelfSigned: Boolean
    ): FETCH_OPT = {
      val __obj = js.Dynamic.literal(_redirectCount = _redirectCount.asInstanceOf[js.Any], cors = cors.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], sslAllowSelfSigned = sslAllowSelfSigned.asInstanceOf[js.Any])
      __obj.asInstanceOf[FETCH_OPT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FETCH_OPT] (val x: Self) extends AnyVal {
      
      inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setExpectStatusCode(value: Double | `false`): Self = StObject.set(x, "expectStatusCode", value.asInstanceOf[js.Any])
      
      inline def setExpectStatusCodeUndefined: Self = StObject.set(x, "expectStatusCode", js.undefined)
      
      inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setReferrer(value: Boolean): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setSslAllowSelfSigned(value: Boolean): Self = StObject.set(x, "sslAllowSelfSigned", value.asInstanceOf[js.Any])
      
      inline def setSslPinnedCertificates(value: js.Array[String]): Self = StObject.set(x, "sslPinnedCertificates", value.asInstanceOf[js.Any])
      
      inline def setSslPinnedCertificatesUndefined: Self = StObject.set(x, "sslPinnedCertificates", js.undefined)
      
      inline def setSslPinnedCertificatesVarargs(value: String*): Self = StObject.set(x, "sslPinnedCertificates", js.Array(value*))
      
      inline def setType(value: text | json | bytes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def set_redirectCount(value: Double): Self = StObject.set(x, "_redirectCount", value.asInstanceOf[js.Any])
    }
  }
}
