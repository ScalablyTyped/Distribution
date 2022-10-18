package typings.peculiarJsonSchema

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesErrorsJsonErrorMod {
  
  @JSImport("@peculiar/json-schema/build/types/errors/json_error", "JsonError")
  @js.native
  open class JsonError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, innerError: js.Error) = this()
    
    var innerError: js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
