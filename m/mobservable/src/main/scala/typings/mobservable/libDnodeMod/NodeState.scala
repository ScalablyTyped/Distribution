package typings.mobservable.libDnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeState extends js.Object

@JSImport("mobservable/lib/dnode", "NodeState")
@js.native
object NodeState extends js.Object {
  @js.native
  sealed trait PENDING extends NodeState
  
  @js.native
  sealed trait READY extends NodeState
  
  @js.native
  sealed trait STALE extends NodeState
  
  /* 1 */ val PENDING: typings.mobservable.libDnodeMod.NodeState.PENDING with Double = js.native
  /* 2 */ val READY: typings.mobservable.libDnodeMod.NodeState.READY with Double = js.native
  /* 0 */ val STALE: typings.mobservable.libDnodeMod.NodeState.STALE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeState with Double] = js.native
}

