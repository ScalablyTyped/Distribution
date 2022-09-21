package typings.parseUri

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uri: String): URI = ^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any]).asInstanceOf[URI]
  inline def apply(uri: String, opts: Options): URI = (^.asInstanceOf[js.Dynamic].apply(uri.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[URI]
  
  @JSImport("parse-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var strictMode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
    }
  }
  
  trait URI extends StObject {
    
    var anchor: String
    
    var authority: String
    
    var directory: String
    
    var file: String
    
    var host: String
    
    var password: String
    
    var path: String
    
    var port: String
    
    var protocol: String
    
    var query: String
    
    var queryKey: Record[String, String]
    
    var relative: String
    
    var source: String
    
    var user: String
    
    var userInfo: String
  }
  object URI {
    
    inline def apply(
      anchor: String,
      authority: String,
      directory: String,
      file: String,
      host: String,
      password: String,
      path: String,
      port: String,
      protocol: String,
      query: String,
      queryKey: Record[String, String],
      relative: String,
      source: String,
      user: String,
      userInfo: String
    ): URI = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[URI]
    }
    
    extension [Self <: URI](x: Self) {
      
      inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryKey(value: Record[String, String]): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: String): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
}
