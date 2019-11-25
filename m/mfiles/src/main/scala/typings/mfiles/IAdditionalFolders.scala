package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalFolders extends js.Object {
  val Count: Double
  def Add(Index: Double, AdditionalFolder: IAdditionalFolder): Unit
  def Clone(): IAdditionalFolders
  def Item(Index: Double): IAdditionalFolder
  def Remove(Index: Double): Unit
}

object IAdditionalFolders {
  @scala.inline
  def apply(
    Add: (Double, IAdditionalFolder) => Unit,
    Clone: () => IAdditionalFolders,
    Count: Double,
    Item: Double => IAdditionalFolder,
    Remove: Double => Unit
  ): IAdditionalFolders = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IAdditionalFolders]
  }
}

