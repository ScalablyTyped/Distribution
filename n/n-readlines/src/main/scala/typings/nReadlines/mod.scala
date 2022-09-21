package typings.nReadlines

import typings.nReadlines.nReadlinesBooleans.`false`
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("n-readlines", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LineByLine {
    def this(file: Double) = this()
    def this(file: PathLike) = this()
    def this(file: Double, options: Options) = this()
    def this(file: PathLike, options: Options) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Buffer | `false` = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  trait LineByLine extends StObject {
    
    def close(): Unit
    
    def next(): Buffer | `false`
    
    def reset(): Unit
  }
  object LineByLine {
    
    inline def apply(close: () => Unit, next: () => Buffer | `false`, reset: () => Unit): LineByLine = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[LineByLine]
    }
    
    extension [Self <: LineByLine](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => Buffer | `false`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var newLineCharacter: js.UndefOr[String] = js.undefined
    
    var readChunk: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNewLineCharacter(value: String): Self = StObject.set(x, "newLineCharacter", value.asInstanceOf[js.Any])
      
      inline def setNewLineCharacterUndefined: Self = StObject.set(x, "newLineCharacter", js.undefined)
      
      inline def setReadChunk(value: Double): Self = StObject.set(x, "readChunk", value.asInstanceOf[js.Any])
      
      inline def setReadChunkUndefined: Self = StObject.set(x, "readChunk", js.undefined)
    }
  }
}
