package typings.parsePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: String): ParsedPath = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  @JSImport("parse-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParsedPath extends StObject {
    
    /** The url hash. */
    var hash: String
    
    /** The input url. */
    var href: String
    
    /** The url pathname. */
    var pathname: String
    
    /** The domain port. */
    var port: Null | Double
    
    /** The first protocol, `"ssh"` (if the url is a ssh url) or `"file"`. */
    var protocol: Protocol
    
    /** An array with the url protocols (usually it has one element). */
    var protocols: js.Array[Protocol]
    
    /** The url querystring, parsed as object. */
    var query: js.Any
    
    /** The url domain (including subdomains). */
    var resource: String
    
    /** The url querystring value. */
    var search: String
    
    /** The authentication user (usually for ssh urls). */
    var user: String
  }
  object ParsedPath {
    
    @scala.inline
    def apply(
      hash: String,
      href: String,
      pathname: String,
      protocol: Protocol,
      protocols: js.Array[Protocol],
      query: js.Any,
      resource: String,
      search: String,
      user: String
    ): ParsedPath = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], port = null)
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit class ParsedPathMutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.parsePath.parsePathStrings.http
    - typings.parsePath.parsePathStrings.https
    - typings.parsePath.parsePathStrings.ssh
    - typings.parsePath.parsePathStrings.file
    - typings.parsePath.parsePathStrings.git
  */
  trait Protocol extends StObject
  object Protocol {
    
    @scala.inline
    def file: typings.parsePath.parsePathStrings.file = "file".asInstanceOf[typings.parsePath.parsePathStrings.file]
    
    @scala.inline
    def git: typings.parsePath.parsePathStrings.git = "git".asInstanceOf[typings.parsePath.parsePathStrings.git]
    
    @scala.inline
    def http: typings.parsePath.parsePathStrings.http = "http".asInstanceOf[typings.parsePath.parsePathStrings.http]
    
    @scala.inline
    def https: typings.parsePath.parsePathStrings.https = "https".asInstanceOf[typings.parsePath.parsePathStrings.https]
    
    @scala.inline
    def ssh: typings.parsePath.parsePathStrings.ssh = "ssh".asInstanceOf[typings.parsePath.parsePathStrings.ssh]
  }
}
