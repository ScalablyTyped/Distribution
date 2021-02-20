package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableMod {
  
  @JSImport("ol/Disposable", JSImport.Default)
  @js.native
  class default () extends Disposable
  
  @js.native
  trait Disposable extends StObject {
    
    /**
      * Clean up.
      */
    def dispose(): Unit = js.native
    
    /**
      * Extension point for disposable objects.
      */
    /* protected */ def disposeInternal(): Unit = js.native
    
    /**
      * The object has already been disposed.
      */
    var disposed: Boolean = js.native
  }
  object Disposable {
    
    @scala.inline
    def apply(dispose: () => Unit, disposeInternal: () => Unit, disposed: Boolean): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeInternal = js.Any.fromFunction0(disposeInternal), disposed = disposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisposeInternal(value: () => Unit): Self = StObject.set(x, "disposeInternal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisposed(value: Boolean): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
    }
  }
}
