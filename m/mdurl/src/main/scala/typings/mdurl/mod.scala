package typings.mdurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdurl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(input: String): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(input: String, exclude: String): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("mdurl", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mdurl", "decode.componentChars")
    @js.native
    val componentChars: String = js.native
    
    @JSImport("mdurl", "decode.defaultChars")
    @js.native
    val defaultChars: String = js.native
  }
  
  object encode {
    
    inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(str: String, exclude: String): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(str: String, exclude: String, keepEscaped: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], keepEscaped.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(str: String, exclude: Unit, keepEscaped: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any], keepEscaped.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("mdurl", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mdurl", "encode.componentChars")
    @js.native
    val componentChars: String = js.native
    
    @JSImport("mdurl", "encode.defaultChars")
    @js.native
    val defaultChars: String = js.native
  }
  
  inline def format(url: Url): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(input: String): Url = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Url]
  inline def parse(input: String, slashesDenoteHost: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url]
  
  trait Url extends StObject {
    
    var auth: String
    
    var hash: String
    
    var hostname: String
    
    var pathname: String
    
    var port: String
    
    var protocol: String
    
    var search: String
    
    var slashes: String
  }
  object Url {
    
    inline def apply(
      auth: String,
      hash: String,
      hostname: String,
      pathname: String,
      port: String,
      protocol: String,
      search: String,
      slashes: String
    ): Url = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSlashes(value: String): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    }
  }
}
