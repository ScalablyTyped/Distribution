package typings
package mobservableLib.libDnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeState extends js.Object

@JSImport("mobservable/lib/dnode", "NodeState")
@js.native
object NodeState extends js.Object {
  @js.native
  sealed trait PENDING
    extends mobservableLib.libDnodeMod.NodeState
  
  @js.native
  sealed trait READY
    extends mobservableLib.libDnodeMod.NodeState
  
  @js.native
  sealed trait STALE
    extends mobservableLib.libDnodeMod.NodeState
  
  /* 1 */ val PENDING: PENDING with scala.Double = js.native
  /* 2 */ val READY: READY with scala.Double = js.native
  /* 0 */ val STALE: STALE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mobservableLib.libDnodeMod.NodeState with scala.Double] = js.native
}

