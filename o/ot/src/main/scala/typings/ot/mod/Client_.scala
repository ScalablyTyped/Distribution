package typings.ot.mod

import typings.ot.mod.Client.Synchronized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "Client")
@js.native
class Client_ protected () extends js.Object {
  def this(revision: Double) = this()
  
  /**
    * Call this method when the user changes the document.
    * @param operation The op
    */
  def applyClient(operation: TextOperation): Unit = js.native
  
  /**
    * Override this method.
    * @param operation The op
    */
  def applyOperation(operation: TextOperation): Unit = js.native
  
  /**
    * Call this method with a new operation from the server
    * @param operation The op
    */
  def applyServer(operation: TextOperation): Unit = js.native
  
  var revision: Double = js.native
  
  /**
    * Override this method.
    * @param revision The revision
    * @param operation The op
    */
  def sendOperation(revision: Double, operation: TextOperation): Unit = js.native
  
  def serverAck(): Unit = js.native
  
  def serverReconnect(): Unit = js.native
  
  def setState(state: Synchronized): Unit = js.native
  
  var state: Synchronized = js.native
  
  /**
    * Transforms a selection from the latest known server state to the current
    * client state. For example, if we get from the server the information that
    * another user's cursor is at position 3, but the server hasn't yet received
    * our newest operation, an insertion of 5 characters at the beginning of the
    * document, the correct position of the other user's cursor in our current
    * document is 8.
    * @param selection The selection
    */
  def transformSelection(selection: Selection): Selection = js.native
}
