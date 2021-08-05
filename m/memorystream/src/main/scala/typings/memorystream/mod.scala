package typings.memorystream

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memorystream", JSImport.Namespace)
  @js.native
  class ^ () extends Duplex {
    def this(data: js.Array[DataType]) = this()
    def this(data: DataType) = this()
    def this(data: js.Array[DataType], options: Options) = this()
    def this(data: Unit, options: Options) = this()
    def this(data: DataType, options: Options) = this()
  }
  
  type DataType = String | Buffer | Stream
  
  type MemoryStream = Duplex
  
  trait Options extends StObject {
    
    var bufoverflow: Double
    
    var frequence: Double
    
    var maxbufsize: Double
    
    var readable: Boolean
    
    var writeable: Boolean
  }
  object Options {
    
    inline def apply(bufoverflow: Double, frequence: Double, maxbufsize: Double, readable: Boolean, writeable: Boolean): Options = {
      val __obj = js.Dynamic.literal(bufoverflow = bufoverflow.asInstanceOf[js.Any], frequence = frequence.asInstanceOf[js.Any], maxbufsize = maxbufsize.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writeable = writeable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBufoverflow(value: Double): Self = StObject.set(x, "bufoverflow", value.asInstanceOf[js.Any])
      
      inline def setFrequence(value: Double): Self = StObject.set(x, "frequence", value.asInstanceOf[js.Any])
      
      inline def setMaxbufsize(value: Double): Self = StObject.set(x, "maxbufsize", value.asInstanceOf[js.Any])
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWriteable(value: Boolean): Self = StObject.set(x, "writeable", value.asInstanceOf[js.Any])
    }
  }
}
