package typings.ow

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentErrorMod {
  
  @JSImport("ow/dist/source/argument-error", "ArgumentError")
  @js.native
  class ArgumentError protected ()
    extends StObject
       with Error {
    def this(message: String, context: js.Function) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
