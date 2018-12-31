package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileVers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, FileVer: IFileVer): scala.Unit
  def Clone(): IFileVers
  def Item(Index: scala.Double): IFileVer
  def Remove(Index: scala.Double): scala.Unit
}

