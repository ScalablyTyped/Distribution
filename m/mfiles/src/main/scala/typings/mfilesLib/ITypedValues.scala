package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITypedValues extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, TypedValue: ITypedValue): scala.Unit
  def Item(Index: scala.Double): ITypedValue
  def Remove(Index: scala.Double): scala.Unit
}

