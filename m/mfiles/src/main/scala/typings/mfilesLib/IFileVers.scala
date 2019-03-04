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
    Add: js.Function2[scala.Double, IFileVer, scala.Unit],
    Clone: js.Function0[IFileVers],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IFileVer],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IFileVers]
  }
}

