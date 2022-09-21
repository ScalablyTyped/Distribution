package typings.nestedErrorStacks

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nested-error-stacks", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Error {
    def this(message: Any) = this()
    def this(message: Any, nested: js.Error) = this()
    def this(message: Unit, nested: js.Error) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  type NestedError = js.Error
}
