package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableMod {
  
  /**
    * @module ol/Disposable
    */
  /**
    * @classdesc
    * Objects that need to clean up after themselves.
    */
  @JSImport("ol/Disposable", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Disposable {
    
    /**
      * Clean up.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Extension point for disposable objects.
      * @protected
      */
    /* protected */ /* CompleteClass */
    override def disposeInternal(): Unit = js.native
    
    /**
      * The object has already been disposed.
      * @type {boolean}
      * @protected
      */
    /* protected */ /* CompleteClass */
    var disposed: Boolean = js.native
  }
  
  /**
    * @module ol/Disposable
    */
  /**
    * @classdesc
    * Objects that need to clean up after themselves.
    */
  trait Disposable extends StObject {
    
    /**
      * Clean up.
      */
    def dispose(): Unit
    
    /**
      * Extension point for disposable objects.
      * @protected
      */
    /* protected */ def disposeInternal(): Unit
    
    /**
      * The object has already been disposed.
      * @type {boolean}
      * @protected
      */
    /* protected */ var disposed: Boolean
  }
  object Disposable {
    
    inline def apply(dispose: () => Unit, disposeInternal: () => Unit, disposed: Boolean): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposeInternal = js.Any.fromFunction0(disposeInternal), disposed = disposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDisposeInternal(value: () => Unit): Self = StObject.set(x, "disposeInternal", js.Any.fromFunction0(value))
      
      inline def setDisposed(value: Boolean): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
    }
  }
}
