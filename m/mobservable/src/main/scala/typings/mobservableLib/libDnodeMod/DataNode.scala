package typings
package mobservableLib.libDnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/dnode", "DataNode")
@js.native
class DataNode protected () extends js.Object {
  def this(context: mobservableLib.libInterfacesMod.IContextInfoStruct) = this()
  var context: mobservableLib.libInterfacesMod.IContextInfoStruct = js.native
  var externalRefenceCount: scala.Double = js.native
  var id: scala.Double = js.native
  var isDisposed: scala.Boolean = js.native
  var observers: js.Array[ViewNode] = js.native
  var state: NodeState = js.native
  def addObserver(node: ViewNode): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def markReady(stateDidActuallyChange: scala.Boolean): scala.Unit = js.native
  def markStale(): scala.Unit = js.native
  def notifyObserved(): scala.Unit = js.native
  def notifyObservers(): scala.Unit = js.native
  def notifyObservers(stateDidActuallyChange: scala.Boolean): scala.Unit = js.native
  def removeObserver(node: ViewNode): scala.Unit = js.native
  def setRefCount(delta: scala.Double): scala.Unit = js.native
}

