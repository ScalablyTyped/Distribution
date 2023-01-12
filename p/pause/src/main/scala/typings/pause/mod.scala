package typings.pause

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stream: Stream): Handle = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Handle]
  
  @JSImport("pause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Handle extends StObject {
    
    def end(): Unit
    
    def resume(): Unit
  }
  object Handle {
    
    inline def apply(end: () => Unit, resume: () => Unit): Handle = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), resume = js.Any.fromFunction0(resume))
      __obj.asInstanceOf[Handle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    }
  }
}
