package typings.phantomjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  def atEnd(): Boolean = js.native
  
  def close(): Unit = js.native
  
  def flush(): Unit = js.native
  
  def read(): String = js.native
  
  def readLine(): String = js.native
  
  def seek(position: Double): Unit = js.native
  
  def write(data: String): Unit = js.native
  
  def writeLine(data: String): Unit = js.native
}
object Stream {
  
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    close: () => Unit,
    flush: () => Unit,
    read: () => String,
    readLine: () => String,
    seek: Double => Unit,
    write: String => Unit,
    writeLine: String => Unit
  ): Stream = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), close = js.Any.fromFunction0(close), flush = js.Any.fromFunction0(flush), read = js.Any.fromFunction0(read), readLine = js.Any.fromFunction0(readLine), seek = js.Any.fromFunction1(seek), write = js.Any.fromFunction1(write), writeLine = js.Any.fromFunction1(writeLine))
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtEnd(value: () => Boolean): Self = StObject.set(x, "atEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRead(value: () => String): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadLine(value: () => String): Self = StObject.set(x, "readLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteLine(value: String => Unit): Self = StObject.set(x, "writeLine", js.Any.fromFunction1(value))
  }
}
