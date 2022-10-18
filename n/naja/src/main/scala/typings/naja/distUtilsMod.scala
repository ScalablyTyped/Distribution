package typings.naja

import typings.std.Error
import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("naja/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("naja/dist/utils", "AssertionError")
  @js.native
  open class AssertionError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def assert(condition: Boolean): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
  inline def assert(condition: Boolean, description: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(condition.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def onDomReady(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDomReady")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type TypedEventListener[ET /* <: EventTarget */, E /* <: Event */] = (TypedEventListenerFunction[ET, E]) | TypedEventListenerObject[E] | Null
  
  type TypedEventListenerFunction[ET /* <: EventTarget */, E /* <: Event */] = js.ThisFunction1[/* this */ ET, /* event */ E, Boolean | Unit | js.Promise[Unit]]
  
  trait TypedEventListenerObject[E /* <: Event */] extends StObject {
    
    def handleEvent(event: E): Unit | js.Promise[Unit]
  }
  object TypedEventListenerObject {
    
    inline def apply[E /* <: Event */](handleEvent: E => Unit | js.Promise[Unit]): TypedEventListenerObject[E] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[TypedEventListenerObject[E]]
    }
    
    extension [Self <: TypedEventListenerObject[?], E /* <: Event */](x: Self & TypedEventListenerObject[E]) {
      
      inline def setHandleEvent(value: E => Unit | js.Promise[Unit]): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
}
