package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjIDs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjID: IObjID): Unit = js.native
  def Item(Index: Double): IObjID = js.native
  def Item(Index: Double, value: IObjID): Unit = js.native
  def Remove(Index: Double): Unit = js.native
  def ToJSON(): String = js.native
}

