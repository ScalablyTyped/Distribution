package typings.precise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Precise = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Precise]
  
  @JSImport("precise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("precise", "Precise")
  @js.native
  class Precise () extends StObject {
    
    /**
      * Returns the nanoseconds from `start()` to `stop()`
      */
    def diff(): Double = js.native
    
    /**
      * Starts a timer
      */
    def start(): Precise = js.native
    
    /**
      * Stops a timer
      */
    def stop(): Precise = js.native
  }
}
