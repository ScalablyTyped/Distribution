package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVers extends js.Object {
  val Count: Double
  def Add(Index: Double, ObjVer: IObjVer): Unit
  def Clone(): IObjVers
  def GetAllDistinctObjIDs(): IObjIDs
  def Item(Index: Double): IObjVer
  def Remove(Index: Double): Unit
  def ToJSON(): String
}

object IObjVers {
  @scala.inline
  def apply(
    Add: (Double, IObjVer) => Unit,
    Clone: () => IObjVers,
    Count: Double,
    GetAllDistinctObjIDs: () => IObjIDs,
    Item: Double => IObjVer,
    Remove: Double => Unit,
    ToJSON: () => String
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetAllDistinctObjIDs = js.Any.fromFunction0(GetAllDistinctObjIDs), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IObjVers]
  }
}

