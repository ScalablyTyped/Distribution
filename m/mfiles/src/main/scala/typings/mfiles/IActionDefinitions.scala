package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionDefinitions extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ActionDefinition: IActionDefinition): Unit = js.native
  def Clone(): IActionDefinitions = js.native
  def Item(Index: Double): IActionDefinition = js.native
  def Item(Index: Double, value: IActionDefinition): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

