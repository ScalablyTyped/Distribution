package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectClassesAdmin extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectClassAdmin: IObjectClassAdmin): scala.Unit
  def Item(Index: scala.Double): IObjectClassAdmin
  def Remove(Index: scala.Double): scala.Unit
}

