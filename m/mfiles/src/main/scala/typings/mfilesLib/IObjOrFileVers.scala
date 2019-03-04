package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOrFileVers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjOrFileVer: IObjOrFileVer): scala.Unit
  def Clone(): IObjOrFileVers
  def Item(Index: scala.Double): IObjOrFileVer
  def Remove(Index: scala.Double): scala.Unit
}

object IObjOrFileVers {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjOrFileVer, scala.Unit],
    Clone: js.Function0[IObjOrFileVers],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IObjOrFileVer],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IObjOrFileVers = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IObjOrFileVers]
  }
}

