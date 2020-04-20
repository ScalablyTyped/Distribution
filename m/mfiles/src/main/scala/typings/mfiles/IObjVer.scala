package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVer extends js.Object {
  var ID: Double
  var ObjID: IObjID
  var Type: Double
  var Version: Double
  def Clone(): IObjVer
  def CloneFrom(ObjVer: IObjVer): Unit
  def Serialize(): js.Array[Double]
  def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit
  def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit
  def ToJSON(): String
  def Unserialize(Bytes: js.Array[Double]): Unit
}

object IObjVer {
  @scala.inline
  def apply(
    Clone: () => IObjVer,
    CloneFrom: IObjVer => Unit,
    ID: Double,
    ObjID: IObjID,
    Serialize: () => js.Array[Double],
    SetIDs: (Double, Double, Double) => Unit,
    SetObjIDAndVersion: (IObjID, Double) => Unit,
    ToJSON: () => String,
    Type: Double,
    Unserialize: js.Array[Double] => Unit,
    Version: Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID.asInstanceOf[js.Any], ObjID = ObjID.asInstanceOf[js.Any], Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction3(SetIDs), SetObjIDAndVersion = js.Any.fromFunction2(SetObjIDAndVersion), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1(Unserialize), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjVer]
  }
}

