package typings.mobservable.libDnodeMod

import typings.mobservable.libInterfacesMod.IContextInfoStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/dnode", "DataNode")
@js.native
class DataNode protected () extends js.Object {
  def this(context: IContextInfoStruct) = this()
  var context: IContextInfoStruct = js.native
  var externalRefenceCount: Double = js.native
  var id: Double = js.native
  var isDisposed: Boolean = js.native
  var observers: js.Array[ViewNode] = js.native
  var state: NodeState = js.native
  def addObserver(node: ViewNode): Unit = js.native
  def dispose(): Unit = js.native
  def markReady(stateDidActuallyChange: Boolean): Unit = js.native
  def markStale(): Unit = js.native
  def notifyObserved(): Unit = js.native
  def notifyObservers(): Unit = js.native
  def notifyObservers(stateDidActuallyChange: Boolean): Unit = js.native
  def removeObserver(node: ViewNode): Unit = js.native
  def setRefCount(delta: Double): Unit = js.native
}

