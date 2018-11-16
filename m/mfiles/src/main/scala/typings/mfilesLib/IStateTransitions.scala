package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStateTransitions extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, StateTransition: IStateTransition): scala.Unit
  def Item(Index: scala.Double): IStateTransition
  def Remove(Index: scala.Double): scala.Unit
}

