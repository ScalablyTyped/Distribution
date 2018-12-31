package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndPropertiesOfMultipleObjects extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectVersionAndProperties: IObjectVersionAndProperties): scala.Unit
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects
  def Item(Index: scala.Double): IObjectVersionAndProperties
  def Remove(Index: scala.Double): scala.Unit
}

