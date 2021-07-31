package typings.pause

import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(stream: Stream): Handle = ^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[Handle]
  
  @JSImport("pause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Handle extends StObject {
    
    def end(): Unit
    
    def resume(): Unit
  }
  object Handle {
    
    @scala.inline
    def apply(end: () => Unit, resume: () => Unit): Handle = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), resume = js.Any.fromFunction0(resume))
      __obj.asInstanceOf[Handle]
    }
    
    @scala.inline
    implicit class HandleMutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    }
  }
}
