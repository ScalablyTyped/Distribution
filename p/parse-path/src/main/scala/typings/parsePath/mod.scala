package typings.parsePath

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): ParsedPath = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  @JSImport("parse-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParsedPath extends StObject {
    
    /** The url hash. */
    var hash: String
    
    /** The url domain (including subdomain and port). */
    var host: String
    
    /** The input url. */
    var href: String
    
    /**
      * Whether the parsing failed or not.
      */
    var parse_failed: Boolean
    
    /**
      * @default ''
      */
    var password: String
    
    /** The url pathname. */
    var pathname: String
    
    /**
      * The domain port.
      * @default ''
      */
    var port: String
    
    /** The first protocol, `"ssh"` (if the url is a ssh url) or `"file"`. */
    var protocol: Protocol
    
    /** An array with the url protocols (usually it has one element). */
    var protocols: js.Array[Protocol]
    
    /** The url querystring, parsed as object. */
    var query: Record[String, String]
    
    /** The url domain (including subdomains). */
    var resource: String
    
    /** The url querystring value. */
    var search: String
    
    /** The authentication user (usually for ssh urls). */
    var user: String
  }
  object ParsedPath {
    
    inline def apply(
      hash: String,
      host: String,
      href: String,
      parse_failed: Boolean,
      password: String,
      pathname: String,
      port: String,
      protocol: Protocol,
      protocols: js.Array[Protocol],
      query: Record[String, String],
      resource: String,
      search: String,
      user: String
    ): ParsedPath = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], parse_failed = parse_failed.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setParse_failed(value: Boolean): Self = StObject.set(x, "parse_failed", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: Record[String, String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
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
    
    inline def file: typings.parsePath.parsePathStrings.file = "file".asInstanceOf[typings.parsePath.parsePathStrings.file]
    
    inline def git: typings.parsePath.parsePathStrings.git = "git".asInstanceOf[typings.parsePath.parsePathStrings.git]
    
    inline def http: typings.parsePath.parsePathStrings.http = "http".asInstanceOf[typings.parsePath.parsePathStrings.http]
    
    inline def https: typings.parsePath.parsePathStrings.https = "https".asInstanceOf[typings.parsePath.parsePathStrings.https]
    
    inline def ssh: typings.parsePath.parsePathStrings.ssh = "ssh".asInstanceOf[typings.parsePath.parsePathStrings.ssh]
  }
}
