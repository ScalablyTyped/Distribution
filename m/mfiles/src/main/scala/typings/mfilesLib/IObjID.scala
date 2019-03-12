package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjID extends js.Object {
  var ID: scala.Double
  var Type: scala.Double
  def Clone(): IObjID
  def CloneFrom(ObjID: IObjID): scala.Unit
  def Serialize(): js.Array[scala.Double]
  def SetIDs(ObjType: scala.Double, ID: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
  def Unserialize(Bytes: js.Array[scala.Double]): scala.Unit
}

object IObjID {
  @scala.inline
  def apply(
    Clone: () => IObjID,
    CloneFrom: IObjID => scala.Unit,
    ID: scala.Double,
    Serialize: () => js.Array[scala.Double],
    SetIDs: (scala.Double, scala.Double) => scala.Unit,
    ToJSON: () => java.lang.String,
    Type: scala.Double,
    Unserialize: js.Array[scala.Double] => scala.Unit
  ): IObjID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID, Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction2(SetIDs), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type, Unserialize = js.Any.fromFunction1(Unserialize))
  
    __obj.asInstanceOf[IObjID]
  }
}

