package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjVer: IObjVer): scala.Unit
  def Clone(): IObjVers
  def GetAllDistinctObjIDs(): IObjIDs
  def Item(Index: scala.Double): IObjVer
  def Remove(Index: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
}

object IObjVers {
  @scala.inline
  def apply(
    Add: (scala.Double, IObjVer) => scala.Unit,
    Clone: () => IObjVers,
    Count: scala.Double,
    GetAllDistinctObjIDs: () => IObjIDs,
    Item: scala.Double => IObjVer,
    Remove: scala.Double => scala.Unit,
    ToJSON: () => java.lang.String
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, GetAllDistinctObjIDs = js.Any.fromFunction0(GetAllDistinctObjIDs), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove), ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IObjVers]
  }
}

