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
    Add: (scala.Double, IAdditionalFolder) => scala.Unit,
    Clone: () => IAdditionalFolders,
    Count: scala.Double,
    Item: scala.Double => IAdditionalFolder,
    Remove: scala.Double => scala.Unit
  ): IAdditionalFolders = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IAdditionalFolders]
  }
}

