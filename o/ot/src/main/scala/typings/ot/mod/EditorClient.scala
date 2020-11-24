package typings.ot.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ot.mod.EditorClient.OtherClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ot", "EditorClient")
@js.native
class EditorClient protected () extends Client {
  def this(
    revision: Double,
    clients: js.Array[ClientObj],
    serverAdapter: ServerAdapter,
    editorAdapter: ClientAdapter
  ) = this()
  
  // not sure about all those signatures
  def addClient(clientId: String, clientObj: ClientObj): Unit = js.native
  
  def applyUnredo(operation: TextOperation): Unit = js.native
  
  var clients: StringDictionary[OtherClient] = js.native
  
  var editorAdapter: js.Any = js.native
  
  def getClientObject(clientId: String): ClientObj = js.native
  
  def initializeClientList(): Unit = js.native
  
  def initializeClients(clients: Clients[_]): Unit = js.native
  
  def onBlur(): Unit = js.native
  
  def onChange(textOperation: TextOperation, inverse: TextOperation): Unit = js.native
  
  def onClientLeft(clientId: String): Unit = js.native
  
  def onSelectionChange(): Unit = js.native
  
  def redo(): Unit = js.native
  
  def sendSelection(selection: Selection): Unit = js.native
  
  var serverAdapter: js.Any = js.native
  
  def undo(): Unit = js.native
  
  def updateSelection(): Unit = js.native
}
@JSImport("ot", "EditorClient")
@js.native
object EditorClient extends js.Object {
  
  @js.native
  class OtherClient () extends js.Object
  
  @js.native
  class SelfMeta () extends js.Object
}
