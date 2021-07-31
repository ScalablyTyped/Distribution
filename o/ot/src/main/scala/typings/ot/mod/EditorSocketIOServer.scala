package typings.ot.mod

import typings.node.eventsMod.EventEmitter
import typings.ot.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.ot.mod.Server because Inheritance from two classes. Inlined document, operations, receiveOperation */ @js.native
trait EditorSocketIOServer[S /* <: Id */, C] extends EventEmitter {
  
  // new(document: string, operations: TextOperation[], docId: string, mayWrite?: (_: any, cb: (b: boolean) => void) => void): EditorSocketIOServer;
  def addClient(socket: S): Unit = js.native
  
  var document: String = js.native
  
  def getClient(clientId: String): C = js.native
  
  def onDisconnect(socket: S): Unit = js.native
  
  def onOperation(socket: S, revision: Double, operation: String, selection: String): Unit = js.native
  
  var operations: js.UndefOr[js.Array[TextOperation]] = js.native
  
  /**
    * Call this method whenever you receive an operation from a client.
    * @param revision The revision
    * @param operation The op
    */
  def receiveOperation(revision: Double, operation: TextOperation): TextOperation = js.native
  
  def setName(socket: S, name: String): Unit = js.native
  
  def updateSelection(socket: S, selection: String): Unit = js.native
}
