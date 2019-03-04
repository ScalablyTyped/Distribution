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
    Add: js.Function2[scala.Double, IFolderDef, scala.Unit],
    Clone: js.Function0[IFolderDefs],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IFolderDef],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IFolderDefs = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IFolderDefs]
  }
}

