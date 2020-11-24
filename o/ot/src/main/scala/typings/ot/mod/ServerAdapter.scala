package typings.ot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerAdapter extends js.Object {
  
  def registerCallbacks(callbacks: ServerAdapterCallbacks): Unit = js.native
  
  def sendOperation(revision: Double, operation: SerializedTextOperation): Unit = js.native
  def sendOperation(revision: Double, operation: SerializedTextOperation, selection: Selection): Unit = js.native
  
  def sendSelection(): Unit = js.native
  def sendSelection(selection: Selection): Unit = js.native
}
