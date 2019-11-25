package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderDefs extends js.Object {
  val Count: Double
  def Add(Index: Double, FolderDef: IFolderDef): Unit
  def Clone(): IFolderDefs
  def Item(Index: Double): IFolderDef
  def Remove(Index: Double): Unit
}

object IFolderDefs {
  @scala.inline
  def apply(
    Add: (Double, IFolderDef) => Unit,
    Clone: () => IFolderDefs,
    Count: Double,
    Item: Double => IFolderDef,
    Remove: Double => Unit
  ): IFolderDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IFolderDefs]
  }
}

