package typings.nReadlines

import typings.nReadlines.nReadlinesBooleans.`false`
import typings.node.Buffer
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("n-readlines", JSImport.Namespace)
  @js.native
  class ^ protected () extends LineByLine {
    def this(file: Double) = this()
    def this(file: PathLike) = this()
    def this(file: Double, options: Options) = this()
    def this(file: PathLike, options: Options) = this()
  }
  
  @js.native
  trait LineByLine extends StObject {
    
    def close(): Unit = js.native
    
    def next(): Buffer | `false` = js.native
    
    def reset(): Unit = js.native
  }
  object LineByLine {
    
    @scala.inline
    def apply(close: () => Unit, next: () => Buffer | `false`, reset: () => Unit): LineByLine = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), next = js.Any.fromFunction0(next), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[LineByLine]
    }
    
    @scala.inline
    implicit class LineByLineMutableBuilder[Self <: LineByLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNext(value: () => Buffer | `false`): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var newLineCharacter: js.UndefOr[String] = js.native
    
    var readChunk: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewLineCharacter(value: String): Self = StObject.set(x, "newLineCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineCharacterUndefined: Self = StObject.set(x, "newLineCharacter", js.undefined)
      
      @scala.inline
      def setReadChunk(value: Double): Self = StObject.set(x, "readChunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadChunkUndefined: Self = StObject.set(x, "readChunk", js.undefined)
    }
  }
}
