package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeColumnMappings extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): scala.Unit
  def Clone(): IObjectTypeColumnMappings
  def Item(Index: scala.Double): IObjectTypeColumnMapping
  def Remove(Index: scala.Double): scala.Unit
}

