package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileClasses extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, FileClass: IFileClass): scala.Unit
  def Clone(): IFileClasses
  def Item(Index: scala.Double): IFileClass
  def Remove(Index: scala.Double): scala.Unit
}

