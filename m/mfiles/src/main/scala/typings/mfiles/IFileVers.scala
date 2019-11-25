package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileVers extends js.Object {
  val Count: Double
  def Add(Index: Double, FileVer: IFileVer): Unit
  def Clone(): IFileVers
  def Item(Index: Double): IFileVer
  def Remove(Index: Double): Unit
}

object IFileVers {
  @scala.inline
  def apply(
    Add: (Double, IFileVer) => Unit,
    Clone: () => IFileVers,
    Count: Double,
    Item: Double => IFileVer,
    Remove: Double => Unit
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IFileVers]
  }
}

