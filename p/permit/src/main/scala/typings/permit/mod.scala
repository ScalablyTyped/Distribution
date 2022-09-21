package typings.permit

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("permit", "Basic")
  @js.native
  open class Basic protected () extends Permit {
    def this(options: PermitOptions) = this()
  }
  
  @JSImport("permit", "Bearer")
  @js.native
  open class Bearer protected () extends Permit {
    def this(options: BearerOptions) = this()
  }
  
  @JSImport("permit", "Permit")
  @js.native
  open class Permit protected () extends StObject {
    def this(options: PermitOptions) = this()
    
    def check(req: IncomingMessage): Unit = js.native
    
    def fail(res: ServerResponse[IncomingMessage]): Unit = js.native
  }
  
  trait BearerOptions
    extends StObject
       with PermitOptions {
    
    var basic: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
  }
  object BearerOptions {
    
    inline def apply(): BearerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BearerOptions]
    }
    
    extension [Self <: BearerOptions](x: Self) {
      
      inline def setBasic(value: String): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait PermitOptions extends StObject {
    
    var proxy: js.UndefOr[String] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
  }
  object PermitOptions {
    
    inline def apply(): PermitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PermitOptions]
    }
    
    extension [Self <: PermitOptions](x: Self) {
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
}
