package typings
package mobservableLib.libDnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/dnode", "ViewNode")
@js.native
class ViewNode () extends DataNode {
  var dependencyChangeCount: js.Any = js.native
  var dependencyStaleCount: js.Any = js.native
  var hasCycle: scala.Boolean = js.native
  var isSleeping: scala.Boolean = js.native
  var observing: js.Array[DataNode] = js.native
  var onSleepEmitter: js.Any = js.native
  var prevObserving: js.Any = js.native
  /* private */ def bindDependencies(): js.Any = js.native
  def compute(): scala.Boolean = js.native
  def computeNextState(): scala.Unit = js.native
  /* private */ def findCycle(node: js.Any): js.Any = js.native
  def notifyStateChange(observable: DataNode, stateDidActuallyChange: scala.Boolean): scala.Unit = js.native
  def onceSleep(onSleep: js.Function1[/* lastValue */ js.Any, scala.Unit]): scala.Unit = js.native
  /* private */ def trackDependencies(): js.Any = js.native
  def tryToSleep(): scala.Unit = js.native
  def wakeUp(): scala.Unit = js.native
}

