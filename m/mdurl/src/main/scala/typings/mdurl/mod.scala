package typings.mdurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object decode {
    
    @JSImport("mdurl", "decode")
    @js.native
    def apply(input: String): String = js.native
    @JSImport("mdurl", "decode")
    @js.native
    def apply(input: String, exclude: String): String = js.native
    
    @JSImport("mdurl", "decode.componentChars")
    @js.native
    val componentChars: String = js.native
    
    @JSImport("mdurl", "decode.defaultChars")
    @js.native
    val defaultChars: String = js.native
  }
  
  object encode {
    
    @JSImport("mdurl", "encode")
    @js.native
    def apply(str: String): String = js.native
    @JSImport("mdurl", "encode")
    @js.native
    def apply(str: String, exclude: js.UndefOr[scala.Nothing], keepEscaped: Boolean): String = js.native
    @JSImport("mdurl", "encode")
    @js.native
    def apply(str: String, exclude: String): String = js.native
    @JSImport("mdurl", "encode")
    @js.native
    def apply(str: String, exclude: String, keepEscaped: Boolean): String = js.native
    
    @JSImport("mdurl", "encode.componentChars")
    @js.native
    val componentChars: String = js.native
    
    @JSImport("mdurl", "encode.defaultChars")
    @js.native
    val defaultChars: String = js.native
  }
  
  @JSImport("mdurl", "format")
  @js.native
  def format(url: Url): String = js.native
  
  @JSImport("mdurl", "parse")
  @js.native
  def parse(input: String): Url = js.native
  @JSImport("mdurl", "parse")
  @js.native
  def parse(input: String, slashesDenoteHost: Boolean): Url = js.native
  
  @js.native
  trait Url extends StObject {
    
    var auth: String = js.native
    
    var hash: String = js.native
    
    var hostname: String = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var search: String = js.native
    
    var slashes: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(
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
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashes(value: String): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    }
  }
}
