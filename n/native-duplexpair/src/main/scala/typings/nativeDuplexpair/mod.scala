package typings.nativeDuplexpair

import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("native-duplexpair", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DuplexPair {
    def this(options: DuplexOptions) = this()
    
    /* CompleteClass */
    override val socket1: Duplex = js.native
    
    /* CompleteClass */
    override val socket2: Duplex = js.native
  }
  
  trait DuplexPair extends StObject {
    
    val socket1: Duplex
    
    val socket2: Duplex
  }
  object DuplexPair {
    
    inline def apply(socket1: Duplex, socket2: Duplex): DuplexPair = {
      val __obj = js.Dynamic.literal(socket1 = socket1.asInstanceOf[js.Any], socket2 = socket2.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuplexPair]
    }
    
    extension [Self <: DuplexPair](x: Self) {
      
      inline def setSocket1(value: Duplex): Self = StObject.set(x, "socket1", value.asInstanceOf[js.Any])
      
      inline def setSocket2(value: Duplex): Self = StObject.set(x, "socket2", value.asInstanceOf[js.Any])
    }
  }
}
