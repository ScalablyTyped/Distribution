package typings.netconf

import typings.netconf.anon.Action
import typings.netconf.anon.Host
import typings.netconf.anon.Hostname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("netconf", "Client")
  @js.native
  open class Client protected () extends StObject {
    /**
      * Creates a new Client object by passing in the connection parameters. Both password and private key authentication methods are supported
      */
    def this(params: Host) = this()
    
    /**
      * Closes the session
      */
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    /**
      * Commits candidate configuration to device
      */
    def commit(callback: js.Function2[/* err */ Any, /* reply */ Any, Unit]): Unit = js.native
    
    /**
      * Shows difference between running and candidate-config. Equivalent to "show | compare".
      */
    def compare(callback: js.Function2[/* err */ Any, /* diff */ Any, Unit]): Unit = js.native
    
    /**
      * Collects some useful information from several RPC calls and presents the results back
      */
    def facts(callback: js.Function2[/* err */ Any, /* facts */ Hostname, Unit]): Unit = js.native
    
    /**
      * Loads configuration data into candidate-config using NETCONF. Default options are equivalent to "load merge" and would expect configuration data in JunOS curly-brace format
      */
    def load(args: String, callback: js.Function2[/* err */ Any, /* reply */ Any, Unit]): Unit = js.native
    def load(args: Action, callback: js.Function2[/* err */ Any, /* reply */ Any, Unit]): Unit = js.native
    
    /**
      * Opens a session
      */
    def open(callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
    
    /**
      * Discards candidate configuration on device
      */
    def rollback(callback: js.Function2[/* err */ Any, /* reply */ Any, Unit]): Unit = js.native
    
    /**
      * Sends requests. Requests are sent using the .rpc() method
      */
    def rpc(request: Any, callback: js.Function2[/* err */ Any, /* reply */ Any, Unit]): Unit = js.native
  }
}
