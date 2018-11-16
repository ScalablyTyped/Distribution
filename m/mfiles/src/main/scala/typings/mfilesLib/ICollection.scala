package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICollection extends js.Object {
  val Count: scala.Double
  val Events: IEvents
  def Clear(): scala.Unit
  def Find(item: js.Any): scala.Double
  def GetAt(pos: scala.Double): js.Any
  def MoveTo(pos: scala.Double, newPos: scala.Double): scala.Unit
  def NewTo(pos: scala.Double, replace: scala.Boolean): js.Any
  def PutTo(pos: scala.Double, replace: scala.Boolean, item: js.Any): scala.Unit
  def RemoveAt(pos: scala.Double): scala.Unit
}

