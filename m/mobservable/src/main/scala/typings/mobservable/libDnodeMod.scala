package typings.mobservable

import org.scalablytyped.runtime.TopLevel
import typings.mobservable.libDnodeMod.DataNode
import typings.mobservable.libDnodeMod.NodeState
import typings.mobservable.libDnodeMod.NodeState.PENDING
import typings.mobservable.libDnodeMod.NodeState.READY
import typings.mobservable.libDnodeMod.NodeState.STALE
import typings.mobservable.libDnodeMod.ViewNode
import typings.mobservable.libInterfacesMod.IContextInfoStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/dnode", JSImport.Namespace)
@js.native
object libDnodeMod extends js.Object {
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
  
  @js.native
  sealed trait NodeState extends js.Object
  
  @js.native
  class ViewNode () extends DataNode {
    var dependencyChangeCount: js.Any = js.native
    var dependencyStaleCount: js.Any = js.native
    var hasCycle: Boolean = js.native
    var isSleeping: Boolean = js.native
    var observing: js.Array[DataNode] = js.native
    var onSleepEmitter: js.Any = js.native
    var prevObserving: js.Any = js.native
    /* private */ def bindDependencies(): js.Any = js.native
    def compute(): Boolean = js.native
    def computeNextState(): Unit = js.native
    /* private */ def findCycle(node: js.Any): js.Any = js.native
    def notifyStateChange(observable: DataNode, stateDidActuallyChange: Boolean): Unit = js.native
    def onceSleep(onSleep: js.Function1[/* lastValue */ js.Any, Unit]): Unit = js.native
    /* private */ def trackDependencies(): js.Any = js.native
    def tryToSleep(): Unit = js.native
    def wakeUp(): Unit = js.native
  }
  
  def checkIfStateIsBeingModifiedDuringView(context: IContextInfoStruct): Unit = js.native
  def isComputingView(): Boolean = js.native
  def isInTransaction(): Boolean = js.native
  def runAfterTransaction(action: js.Function0[Unit]): Unit = js.native
  def stackDepth(): js.Any = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
  @js.native
  object NodeState extends js.Object {
    @js.native
    sealed trait PENDING extends NodeState
    
    @js.native
    sealed trait READY extends NodeState
    
    @js.native
    sealed trait STALE extends NodeState
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeState with Double] = js.native
    /* 1 */ @js.native
    object PENDING extends TopLevel[PENDING with Double]
    
    /* 2 */ @js.native
    object READY extends TopLevel[READY with Double]
    
    /* 0 */ @js.native
    object STALE extends TopLevel[STALE with Double]
    
  }
  
}

