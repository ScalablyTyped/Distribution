package typings.mobservable

import typings.mobservable.interfacesMod.IContextInfoStruct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnodeMod {
  
  @JSImport("mobservable/lib/dnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobservable/lib/dnode", "DataNode")
  @js.native
  class DataNode protected () extends StObject {
    def this(context: IContextInfoStruct) = this()
    
    def addObserver(node: ViewNode): Unit = js.native
    
    var context: IContextInfoStruct = js.native
    
    def dispose(): Unit = js.native
    
    var externalRefenceCount: Double = js.native
    
    var id: Double = js.native
    
    var isDisposed: Boolean = js.native
    
    def markReady(stateDidActuallyChange: Boolean): Unit = js.native
    
    def markStale(): Unit = js.native
    
    def notifyObserved(): Unit = js.native
    
    def notifyObservers(): Unit = js.native
    def notifyObservers(stateDidActuallyChange: Boolean): Unit = js.native
    
    var observers: js.Array[ViewNode] = js.native
    
    def removeObserver(node: ViewNode): Unit = js.native
    
    def setRefCount(delta: Double): Unit = js.native
    
    var state: NodeState = js.native
  }
  
  @js.native
  sealed trait NodeState extends StObject
  @JSImport("mobservable/lib/dnode", "NodeState")
  @js.native
  object NodeState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeState & Double] = js.native
    
    @js.native
    sealed trait PENDING
      extends StObject
         with NodeState
    /* 1 */ val PENDING: typings.mobservable.dnodeMod.NodeState.PENDING & Double = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with NodeState
    /* 2 */ val READY: typings.mobservable.dnodeMod.NodeState.READY & Double = js.native
    
    @js.native
    sealed trait STALE
      extends StObject
         with NodeState
    /* 0 */ val STALE: typings.mobservable.dnodeMod.NodeState.STALE & Double = js.native
  }
  
  @JSImport("mobservable/lib/dnode", "ViewNode")
  @js.native
  class ViewNode protected () extends DataNode {
    def this(context: IContextInfoStruct) = this()
    
    /* private */ def bindDependencies(): js.Any = js.native
    
    def compute(): Boolean = js.native
    
    def computeNextState(): Unit = js.native
    
    var dependencyChangeCount: js.Any = js.native
    
    var dependencyStaleCount: js.Any = js.native
    
    /* private */ def findCycle(node: js.Any): js.Any = js.native
    
    var hasCycle: Boolean = js.native
    
    var isSleeping: Boolean = js.native
    
    def notifyStateChange(observable: DataNode, stateDidActuallyChange: Boolean): Unit = js.native
    
    var observing: js.Array[DataNode] = js.native
    
    var onSleepEmitter: js.Any = js.native
    
    def onceSleep(onSleep: js.Function1[/* lastValue */ js.Any, Unit]): Unit = js.native
    
    var prevObserving: js.Any = js.native
    
    /* private */ def trackDependencies(): js.Any = js.native
    
    def tryToSleep(): Unit = js.native
    
    def wakeUp(): Unit = js.native
  }
  
  @scala.inline
  def checkIfStateIsBeingModifiedDuringView(context: IContextInfoStruct): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkIfStateIsBeingModifiedDuringView")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isComputingView(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputingView")().asInstanceOf[Boolean]
  
  @scala.inline
  def isInTransaction(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTransaction")().asInstanceOf[Boolean]
  
  @scala.inline
  def runAfterTransaction(action: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runAfterTransaction")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def stackDepth(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stackDepth")().asInstanceOf[js.Any]
  
  @scala.inline
  def transaction[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transaction")(action.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def untracked[T](action: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("untracked")(action.asInstanceOf[js.Any]).asInstanceOf[T]
}
