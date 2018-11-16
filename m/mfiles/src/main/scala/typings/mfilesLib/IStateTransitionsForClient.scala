package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateTransitionsForClient extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, StateTransitionForClient: IStateTransitionForClient): scala.Unit = js.native
  def Clone(): IStateTransitionsForClient = js.native
  def Item(Index: scala.Double): IStateTransitionForClient = js.native
  def Item(Index: scala.Double, value: IStateTransitionForClient): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

