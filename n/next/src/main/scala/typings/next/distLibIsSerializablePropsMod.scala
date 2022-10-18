package typings.next

import typings.next.nextBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIsSerializablePropsMod {
  
  @JSImport("next/dist/lib/is-serializable-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/lib/is-serializable-props", "SerializableError")
  @js.native
  open class SerializableError protected ()
    extends StObject
       with Error {
    def this(page: String, method: String, path: String, message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def isSerializableProps(page: String, method: String, input: Any): `true` = (^.asInstanceOf[js.Dynamic].applyDynamic("isSerializableProps")(page.asInstanceOf[js.Any], method.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[`true`]
}
