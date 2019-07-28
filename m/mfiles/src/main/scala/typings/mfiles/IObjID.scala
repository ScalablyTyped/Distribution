package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjID extends js.Object {
  var ID: Double
  var Type: Double
  def Clone(): IObjID
  def CloneFrom(ObjID: IObjID): Unit
  def Serialize(): js.Array[Double]
  def SetIDs(ObjType: Double, ID: Double): Unit
  def ToJSON(): String
  def Unserialize(Bytes: js.Array[Double]): Unit
}

object IObjID {
  @scala.inline
  def apply(
    Clone: () => IObjID,
    CloneFrom: IObjID => Unit,
    ID: Double,
    Serialize: () => js.Array[Double],
    SetIDs: (Double, Double) => Unit,
    ToJSON: () => String,
    Type: Double,
    Unserialize: js.Array[Double] => Unit
  ): IObjID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID, Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction2(SetIDs), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type, Unserialize = js.Any.fromFunction1(Unserialize))
  
    __obj.asInstanceOf[IObjID]
  }
}

