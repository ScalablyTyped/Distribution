package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjOrFileVers extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjOrFileVer: IObjOrFileVer): Unit
  def Clone(): IObjOrFileVers
  def Item(Index: Double): IObjOrFileVer
  def Remove(Index: Double): Unit
}

object IObjOrFileVers {
  @scala.inline
  def apply(
    Add: (Double, IObjOrFileVer) => Unit,
    Clone: () => IObjOrFileVers,
    Count: Double,
    Item: Double => IObjOrFileVer,
    Remove: Double => Unit
  ): IObjOrFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IObjOrFileVers]
  }
}

