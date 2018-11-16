package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IStatesAdmin extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, StateAdmin: IStateAdmin): scala.Unit
  def Item(Index: scala.Double): IStateAdmin
  def Remove(Index: scala.Double): scala.Unit
}

