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

object IAdditionalFolders {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IAdditionalFolder, scala.Unit],
    Clone: js.Function0[IAdditionalFolders],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IAdditionalFolder],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IAdditionalFolders = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IAdditionalFolders]
  }
}

