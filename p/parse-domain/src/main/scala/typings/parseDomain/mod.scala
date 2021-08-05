package typings.parseDomain

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): ParsedDomain | Null = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[ParsedDomain | Null]
  inline def apply(url: String, options: ParseOptions): ParsedDomain | Null = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedDomain | Null]
  
  @JSImport("parse-domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParseOptions extends StObject {
    
    var customTlds: js.UndefOr[RegExp | js.Array[String]] = js.undefined
    
    var privateTlds: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setCustomTlds(value: RegExp | js.Array[String]): Self = StObject.set(x, "customTlds", value.asInstanceOf[js.Any])
      
      inline def setCustomTldsUndefined: Self = StObject.set(x, "customTlds", js.undefined)
      
      inline def setCustomTldsVarargs(value: String*): Self = StObject.set(x, "customTlds", js.Array(value :_*))
      
      inline def setPrivateTlds(value: Boolean): Self = StObject.set(x, "privateTlds", value.asInstanceOf[js.Any])
      
      inline def setPrivateTldsUndefined: Self = StObject.set(x, "privateTlds", js.undefined)
    }
  }
  
  trait ParsedDomain extends StObject {
    
    var domain: String
    
    var subdomain: String
    
    var tld: String
  }
  object ParsedDomain {
    
    inline def apply(domain: String, subdomain: String, tld: String): ParsedDomain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedDomain]
    }
    
    extension [Self <: ParsedDomain](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setTld(value: String): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
    }
  }
}
