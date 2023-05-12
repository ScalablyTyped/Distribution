package typings.memorystream

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memorystream", JSImport.Namespace)
  @js.native
  open class ^ () extends Duplex {
    def this(data: js.Array[DataType]) = this()
    def this(data: DataType) = this()
    def this(data: js.Array[DataType], options: Options) = this()
    def this(data: Unit, options: Options) = this()
    def this(data: DataType, options: Options) = this()
  }
  @JSImport("memorystream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("memorystream", "createReadStream")
  @js.native
  def createReadStream: js.Function2[
    /* data */ js.UndefOr[DataType | js.Array[DataType]], 
    /* options */ js.UndefOr[Options], 
    MemoryStream
  ] = js.native
  inline def createReadStream_=(
    x: js.Function2[
      /* data */ js.UndefOr[DataType | js.Array[DataType]], 
      /* options */ js.UndefOr[Options], 
      MemoryStream
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createReadStream")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("memorystream", "createWriteStream")
  @js.native
  def createWriteStream: js.Function2[
    /* data */ js.UndefOr[DataType | js.Array[DataType]], 
    /* options */ js.UndefOr[Options], 
    MemoryStream
  ] = js.native
  inline def createWriteStream_=(
    x: js.Function2[
      /* data */ js.UndefOr[DataType | js.Array[DataType]], 
      /* options */ js.UndefOr[Options], 
      MemoryStream
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createWriteStream")(x.asInstanceOf[js.Any])
  
  type DataType = String | Buffer | Stream
  
  type MemoryStream = Duplex
  
  trait Options extends StObject {
    
    var bufoverflow: js.UndefOr[Double] = js.undefined
    
    var frequence: js.UndefOr[Double] = js.undefined
    
    var maxbufsize: js.UndefOr[Double] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var writeable: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBufoverflow(value: Double): Self = StObject.set(x, "bufoverflow", value.asInstanceOf[js.Any])
      
      inline def setBufoverflowUndefined: Self = StObject.set(x, "bufoverflow", js.undefined)
      
      inline def setFrequence(value: Double): Self = StObject.set(x, "frequence", value.asInstanceOf[js.Any])
      
      inline def setFrequenceUndefined: Self = StObject.set(x, "frequence", js.undefined)
      
      inline def setMaxbufsize(value: Double): Self = StObject.set(x, "maxbufsize", value.asInstanceOf[js.Any])
      
      inline def setMaxbufsizeUndefined: Self = StObject.set(x, "maxbufsize", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setWriteable(value: Boolean): Self = StObject.set(x, "writeable", value.asInstanceOf[js.Any])
      
      inline def setWriteableUndefined: Self = StObject.set(x, "writeable", js.undefined)
    }
  }
}
