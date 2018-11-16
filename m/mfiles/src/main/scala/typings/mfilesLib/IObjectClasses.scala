package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IObjectClasses extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectClass: IObjectClass): scala.Unit
  def Clone(): IObjectClasses
  def Item(Index: scala.Double): IObjectClass
  def Remove(Index: scala.Double): scala.Unit
}

