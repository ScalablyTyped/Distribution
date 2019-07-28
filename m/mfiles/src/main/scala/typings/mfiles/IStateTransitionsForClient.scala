package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateTransitionsForClient extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, StateTransitionForClient: IStateTransitionForClient): Unit = js.native
  def Clone(): IStateTransitionsForClient = js.native
  def Item(Index: Double): IStateTransitionForClient = js.native
  def Item(Index: Double, value: IStateTransitionForClient): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

