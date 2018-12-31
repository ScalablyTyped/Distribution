package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalFolders extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, AdditionalFolder: IAdditionalFolder): scala.Unit
  def Clone(): IAdditionalFolders
  def Item(Index: scala.Double): IAdditionalFolder
  def Remove(Index: scala.Double): scala.Unit
}

