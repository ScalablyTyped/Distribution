package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IFolderDefs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, FolderDef: IFolderDef): scala.Unit
  def Clone(): IFolderDefs
  def Item(Index: scala.Double): IFolderDef
  def Remove(Index: scala.Double): scala.Unit
}

