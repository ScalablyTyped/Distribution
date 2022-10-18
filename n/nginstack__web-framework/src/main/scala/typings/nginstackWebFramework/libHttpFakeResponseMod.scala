package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpFakeResponseMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/http/FakeResponse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FakeResponse {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var close: Any = js.native
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    override def getBuffer(): String = js.native
    
    /* private */ /* CompleteClass */
    var stop: Any = js.native
    
    /* CompleteClass */
    override def write(value: String): Unit = js.native
    
    /* CompleteClass */
    override def writeln(value: String): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/http/FakeResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FakeResponse extends StObject {
    
    def clear(): Unit
    
    /* private */ var close: Any
    
    var data: String
    
    def getBuffer(): String
    
    /* private */ var stop: Any
    
    def write(value: String): Unit
    
    def writeln(value: String): Unit
  }
  object FakeResponse {
    
    inline def apply(
      clear: () => Unit,
      close: Any,
      data: String,
      getBuffer: () => String,
      stop: Any,
      write: String => Unit,
      writeln: String => Unit
    ): FakeResponse = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), close = close.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getBuffer = js.Any.fromFunction0(getBuffer), stop = stop.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), writeln = js.Any.fromFunction1(writeln))
      __obj.asInstanceOf[FakeResponse]
    }
    
    extension [Self <: FakeResponse](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setClose(value: Any): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGetBuffer(value: () => String): Self = StObject.set(x, "getBuffer", js.Any.fromFunction0(value))
      
      inline def setStop(value: Any): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriteln(value: String => Unit): Self = StObject.set(x, "writeln", js.Any.fromFunction1(value))
    }
  }
}
