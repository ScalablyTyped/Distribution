package typings.nodeJsonDb

import typings.std.Error
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("node-json-db/dist/lib/Errors", "DataError")
  @js.native
  class DataError protected () extends NestedError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: Error) = this()
  }
  
  @JSImport("node-json-db/dist/lib/Errors", "DatabaseError")
  @js.native
  class DatabaseError protected () extends NestedError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: Error) = this()
  }
  
  @JSImport("node-json-db/dist/lib/Errors", "NestedError")
  @js.native
  abstract class NestedError protected ()
    extends StObject
       with Error {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: Error) = this()
    
    val id: Number = js.native
    
    val inner: js.UndefOr[Error] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
