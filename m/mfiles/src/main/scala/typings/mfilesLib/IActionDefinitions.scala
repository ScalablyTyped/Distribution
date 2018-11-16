package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionDefinitions extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, ActionDefinition: IActionDefinition): scala.Unit = js.native
  def Clone(): IActionDefinitions = js.native
  def Item(Index: scala.Double): IActionDefinition = js.native
  def Item(Index: scala.Double, value: IActionDefinition): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
}

