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
    Add: (scala.Double, IObjOrFileVer) => scala.Unit,
    Clone: () => IObjOrFileVers,
    Count: scala.Double,
    Item: scala.Double => IObjOrFileVer,
    Remove: scala.Double => scala.Unit
  ): IObjOrFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjOrFileVers]
  }
}

