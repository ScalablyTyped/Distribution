package typings.nodeJsonDb

import typings.std.Error
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibErrorsMod {
  
  @JSImport("node-json-db/dist/lib/Errors", "DataError")
  @js.native
  open class DataError protected () extends NestedError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
  }
  
  @JSImport("node-json-db/dist/lib/Errors", "DatabaseError")
  @js.native
  open class DatabaseError protected () extends NestedError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
  }
  
  /* note: abstract class */ @JSImport("node-json-db/dist/lib/Errors", "NestedError")
  @js.native
  open class NestedError protected ()
    extends StObject
       with Error {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
    
    val id: Number = js.native
    
    val inner: js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
