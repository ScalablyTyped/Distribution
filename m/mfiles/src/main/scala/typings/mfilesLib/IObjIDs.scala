package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjIDs extends js.Object {
  val Count: scala.Double = js.native
  def Add(Index: scala.Double, ObjID: IObjID): scala.Unit = js.native
  def Item(Index: scala.Double): IObjID = js.native
  def Item(Index: scala.Double, value: IObjID): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
  def ToJSON(): java.lang.String = js.native
}

