package typings.parseDomain

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-domain", JSImport.Namespace)
  @js.native
  def apply(url: String): ParsedDomain | Null = js.native
  @JSImport("parse-domain", JSImport.Namespace)
  @js.native
  def apply(url: String, options: ParseOptions): ParsedDomain | Null = js.native
  
  @js.native
  trait ParseOptions extends StObject {
    
    var customTlds: js.UndefOr[RegExp | js.Array[String]] = js.native
    
    var privateTlds: js.UndefOr[Boolean] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomTlds(value: RegExp | js.Array[String]): Self = StObject.set(x, "customTlds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomTldsUndefined: Self = StObject.set(x, "customTlds", js.undefined)
      
      @scala.inline
      def setCustomTldsVarargs(value: String*): Self = StObject.set(x, "customTlds", js.Array(value :_*))
      
      @scala.inline
      def setPrivateTlds(value: Boolean): Self = StObject.set(x, "privateTlds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateTldsUndefined: Self = StObject.set(x, "privateTlds", js.undefined)
    }
  }
  
  @js.native
  trait ParsedDomain extends StObject {
    
    var domain: String = js.native
    
    var subdomain: String = js.native
    
    var tld: String = js.native
  }
  object ParsedDomain {
    
    @scala.inline
    def apply(domain: String, subdomain: String, tld: String): ParsedDomain = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedDomain]
    }
    
    @scala.inline
    implicit class ParsedDomainMutableBuilder[Self <: ParsedDomain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTld(value: String): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
    }
  }
}
