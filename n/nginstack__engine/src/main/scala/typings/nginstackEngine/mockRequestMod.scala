package typings.nginstackEngine

import typings.nginstackEngine.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockRequestMod {
  
  inline def apply(opt_options: Body): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/testing/http/MockRequest", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MockRequest {
    def this(opt_options: Body) = this()
    
    /* private */ /* CompleteClass */
    var content_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getBody: Any = js.native
    
    /* private */ /* CompleteClass */
    var getContent: Any = js.native
    
    /* private */ /* CompleteClass */
    var getContentLength: Any = js.native
    
    /* private */ /* CompleteClass */
    var getContentType: Any = js.native
    
    /* private */ /* CompleteClass */
    var getHeader: Any = js.native
    
    /* private */ /* CompleteClass */
    var getHeaders: Any = js.native
    
    /* private */ /* CompleteClass */
    var getHost: Any = js.native
    
    /* private */ /* CompleteClass */
    var getMethod: Any = js.native
    
    /* private */ /* CompleteClass */
    var getMethodType: Any = js.native
    
    /* private */ /* CompleteClass */
    var getParams: Any = js.native
    
    /* private */ /* CompleteClass */
    var getPath: Any = js.native
    
    /* private */ /* CompleteClass */
    var headers_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var host_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var limitReadSize_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var method_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var params_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var path_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var position_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var read: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/testing/http/MockRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MockRequest extends StObject {
    
    /* private */ var content_ : Any
    
    /* private */ var getBody: Any
    
    /* private */ var getContent: Any
    
    /* private */ var getContentLength: Any
    
    /* private */ var getContentType: Any
    
    /* private */ var getHeader: Any
    
    /* private */ var getHeaders: Any
    
    /* private */ var getHost: Any
    
    /* private */ var getMethod: Any
    
    /* private */ var getMethodType: Any
    
    /* private */ var getParams: Any
    
    /* private */ var getPath: Any
    
    /* private */ var headers_ : Any
    
    /* private */ var host_ : Any
    
    /* private */ var limitReadSize_ : Any
    
    /* private */ var method_ : Any
    
    /* private */ var params_ : Any
    
    /* private */ var path_ : Any
    
    /* private */ var position_ : Any
    
    /* private */ var read: Any
  }
  object MockRequest {
    
    inline def apply(
      content_ : Any,
      getBody: Any,
      getContent: Any,
      getContentLength: Any,
      getContentType: Any,
      getHeader: Any,
      getHeaders: Any,
      getHost: Any,
      getMethod: Any,
      getMethodType: Any,
      getParams: Any,
      getPath: Any,
      headers_ : Any,
      host_ : Any,
      limitReadSize_ : Any,
      method_ : Any,
      params_ : Any,
      path_ : Any,
      position_ : Any,
      read: Any
    ): MockRequest = {
      val __obj = js.Dynamic.literal(content_ = content_.asInstanceOf[js.Any], getBody = getBody.asInstanceOf[js.Any], getContent = getContent.asInstanceOf[js.Any], getContentLength = getContentLength.asInstanceOf[js.Any], getContentType = getContentType.asInstanceOf[js.Any], getHeader = getHeader.asInstanceOf[js.Any], getHeaders = getHeaders.asInstanceOf[js.Any], getHost = getHost.asInstanceOf[js.Any], getMethod = getMethod.asInstanceOf[js.Any], getMethodType = getMethodType.asInstanceOf[js.Any], getParams = getParams.asInstanceOf[js.Any], getPath = getPath.asInstanceOf[js.Any], headers_ = headers_.asInstanceOf[js.Any], host_ = host_.asInstanceOf[js.Any], limitReadSize_ = limitReadSize_.asInstanceOf[js.Any], method_ = method_.asInstanceOf[js.Any], params_ = params_.asInstanceOf[js.Any], path_ = path_.asInstanceOf[js.Any], position_ = position_.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockRequest]
    }
    
    extension [Self <: MockRequest](x: Self) {
      
      inline def setContent_(value: Any): Self = StObject.set(x, "content_", value.asInstanceOf[js.Any])
      
      inline def setGetBody(value: Any): Self = StObject.set(x, "getBody", value.asInstanceOf[js.Any])
      
      inline def setGetContent(value: Any): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
      
      inline def setGetContentLength(value: Any): Self = StObject.set(x, "getContentLength", value.asInstanceOf[js.Any])
      
      inline def setGetContentType(value: Any): Self = StObject.set(x, "getContentType", value.asInstanceOf[js.Any])
      
      inline def setGetHeader(value: Any): Self = StObject.set(x, "getHeader", value.asInstanceOf[js.Any])
      
      inline def setGetHeaders(value: Any): Self = StObject.set(x, "getHeaders", value.asInstanceOf[js.Any])
      
      inline def setGetHost(value: Any): Self = StObject.set(x, "getHost", value.asInstanceOf[js.Any])
      
      inline def setGetMethod(value: Any): Self = StObject.set(x, "getMethod", value.asInstanceOf[js.Any])
      
      inline def setGetMethodType(value: Any): Self = StObject.set(x, "getMethodType", value.asInstanceOf[js.Any])
      
      inline def setGetParams(value: Any): Self = StObject.set(x, "getParams", value.asInstanceOf[js.Any])
      
      inline def setGetPath(value: Any): Self = StObject.set(x, "getPath", value.asInstanceOf[js.Any])
      
      inline def setHeaders_(value: Any): Self = StObject.set(x, "headers_", value.asInstanceOf[js.Any])
      
      inline def setHost_(value: Any): Self = StObject.set(x, "host_", value.asInstanceOf[js.Any])
      
      inline def setLimitReadSize_(value: Any): Self = StObject.set(x, "limitReadSize_", value.asInstanceOf[js.Any])
      
      inline def setMethod_(value: Any): Self = StObject.set(x, "method_", value.asInstanceOf[js.Any])
      
      inline def setParams_(value: Any): Self = StObject.set(x, "params_", value.asInstanceOf[js.Any])
      
      inline def setPath_(value: Any): Self = StObject.set(x, "path_", value.asInstanceOf[js.Any])
      
      inline def setPosition_(value: Any): Self = StObject.set(x, "position_", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    }
  }
}
