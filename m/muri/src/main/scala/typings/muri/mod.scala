package typings.muri

import typings.muri.anon.Pass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("muri", JSImport.Namespace)
  @js.native
  def apply(uri: String): ParsedUri = js.native
  
  @js.native
  trait DefaultHost extends Host {
    
    var host: String = js.native
    
    var port: Double = js.native
  }
  object DefaultHost {
    
    @scala.inline
    def apply(host: String, port: Double): DefaultHost = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultHost]
    }
    
    @scala.inline
    implicit class DefaultHostMutableBuilder[Self <: DefaultHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.muri.mod.DefaultHost
    - typings.muri.mod.SocketHost
  */
  trait Host extends StObject
  object Host {
    
    @scala.inline
    def DefaultHost(host: String, port: Double): typings.muri.mod.DefaultHost = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.muri.mod.DefaultHost]
    }
    
    @scala.inline
    def SocketHost(ipc: String): typings.muri.mod.SocketHost = {
      val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.muri.mod.SocketHost]
    }
  }
  
  @js.native
  trait ParsedUri extends StObject {
    
    var auth: js.UndefOr[Pass] = js.native
    
    var db: String = js.native
    
    var hosts: js.Array[Host] = js.native
    
    var options: js.Any = js.native
  }
  object ParsedUri {
    
    @scala.inline
    def apply(db: String, hosts: js.Array[Host], options: js.Any): ParsedUri = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUri]
    }
    
    @scala.inline
    implicit class ParsedUriMutableBuilder[Self <: ParsedUri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Pass): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHosts(value: js.Array[Host]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostsVarargs(value: Host*): Self = StObject.set(x, "hosts", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SocketHost extends Host {
    
    var ipc: String = js.native
  }
  object SocketHost {
    
    @scala.inline
    def apply(ipc: String): SocketHost = {
      val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketHost]
    }
    
    @scala.inline
    implicit class SocketHostMutableBuilder[Self <: SocketHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIpc(value: String): Self = StObject.set(x, "ipc", value.asInstanceOf[js.Any])
    }
  }
}
