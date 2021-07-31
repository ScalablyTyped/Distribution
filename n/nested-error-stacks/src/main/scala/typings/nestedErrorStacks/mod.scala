package typings.nestedErrorStacks

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nested-error-stacks", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Error {
    def this(message: js.Any) = this()
    def this(message: js.Any, nested: Error) = this()
    def this(message: Unit, nested: Error) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  type NestedError = Error
}
