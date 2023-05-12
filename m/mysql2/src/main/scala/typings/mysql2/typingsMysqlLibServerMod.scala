package typings.mysql2

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMysqlLibServerMod {
  
  @JSImport("mysql2/typings/mysql/lib/Server", JSImport.Namespace)
  @js.native
  open class ^ () extends Server
  
  @js.native
  trait Server extends EventEmitter {
    
    def close(callback: js.Function2[/* error */ js.Error, /* count */ Double, Any]): Unit = js.native
    
    var connections: js.Array[typings.mysql2.typingsMysqlLibConnectionMod.^] = js.native
    
    def listen(port: Double): Server = js.native
  }
}
