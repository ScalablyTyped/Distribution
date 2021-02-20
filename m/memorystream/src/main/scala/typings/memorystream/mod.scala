package typings.memorystream

import typings.node.Buffer
import typings.node.streamMod.Duplex
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memorystream", JSImport.Namespace)
  @js.native
  class ^ () extends Duplex {
    def this(data: js.Array[DataType]) = this()
    def this(data: DataType) = this()
    def this(data: js.UndefOr[DataType], options: Options) = this()
    def this(data: js.Array[DataType], options: Options) = this()
  }
  
  type DataType = String | Buffer | Stream
  
  type MemoryStream = Duplex
  
  @js.native
  trait Options extends StObject {
    
    var bufoverflow: Double = js.native
    
    var frequence: Double = js.native
    
    var maxbufsize: Double = js.native
    
    var readable: Boolean = js.native
    
    var writeable: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(bufoverflow: Double, frequence: Double, maxbufsize: Double, readable: Boolean, writeable: Boolean): Options = {
      val __obj = js.Dynamic.literal(bufoverflow = bufoverflow.asInstanceOf[js.Any], frequence = frequence.asInstanceOf[js.Any], maxbufsize = maxbufsize.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writeable = writeable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufoverflow(value: Double): Self = StObject.set(x, "bufoverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequence(value: Double): Self = StObject.set(x, "frequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxbufsize(value: Double): Self = StObject.set(x, "maxbufsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteable(value: Boolean): Self = StObject.set(x, "writeable", value.asInstanceOf[js.Any])
    }
  }
}
