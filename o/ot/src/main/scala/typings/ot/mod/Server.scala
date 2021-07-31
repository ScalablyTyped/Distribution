package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "Server")
@js.native
class Server protected () extends StObject {
  /**
    * Constructor. Takes the current document as a string and optionally the array
    * of all operations.
    * @param document The doc
    * @param operations The ops
    */
  def this(document: String) = this()
  def this(document: String, operations: js.Array[TextOperation]) = this()
  
  var document: String = js.native
  
  var operations: js.UndefOr[js.Array[TextOperation]] = js.native
  
  /**
    * Call this method whenever you receive an operation from a client.
    * @param revision The revision
    * @param operation The op
    */
  def receiveOperation(revision: Double, operation: TextOperation): TextOperation = js.native
}
