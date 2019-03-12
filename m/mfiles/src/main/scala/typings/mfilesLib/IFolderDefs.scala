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

object IFolderDefs {
  @scala.inline
  def apply(
    Add: (scala.Double, IFolderDef) => scala.Unit,
    Clone: () => IFolderDefs,
    Count: scala.Double,
    Item: scala.Double => IFolderDef,
    Remove: scala.Double => scala.Unit
  ): IFolderDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IFolderDefs]
  }
}

