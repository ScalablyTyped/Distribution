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

object IFileVers {
  @scala.inline
  def apply(
    Add: (scala.Double, IFileVer) => scala.Unit,
    Clone: () => IFileVers,
    Count: scala.Double,
    Item: scala.Double => IFileVer,
    Remove: scala.Double => scala.Unit
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IFileVers]
  }
}

