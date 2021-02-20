package typings.nosleepJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nosleep.js", JSImport.Namespace)
  @js.native
  class ^ () extends NoSleep
  
  @js.native
  trait NoSleep extends StObject {
    
    /**
      * Disables wake lock at some point in the future.
      *
      * @remarks
      * This does not need to be wrapped in any user input.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables wake lock.
      *
      * @remarks
      * This function call must be wrapped in a user input event handler:
      * e.g. a mouse or touch handler.
      */
    def enable(): Unit = js.native
  }
  object NoSleep {
    
    @scala.inline
    def apply(disable: () => Unit, enable: () => Unit): NoSleep = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable))
      __obj.asInstanceOf[NoSleep]
    }
    
    @scala.inline
    implicit class NoSleepMutableBuilder[Self <: NoSleep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
}
