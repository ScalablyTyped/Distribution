package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVer extends js.Object {
  var ID: scala.Double
  var ObjID: IObjID
  var Type: scala.Double
  var Version: scala.Double
  def Clone(): IObjVer
  def CloneFrom(ObjVer: IObjVer): scala.Unit
  def Serialize(): js.Array[scala.Double]
  def SetIDs(ObjType: scala.Double, ID: scala.Double, Version: scala.Double): scala.Unit
  def SetObjIDAndVersion(ObjID: IObjID, Version: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
  def Unserialize(Bytes: js.Array[scala.Double]): scala.Unit
}

object IObjVer {
  @scala.inline
  def apply(
    Clone: () => IObjVer,
    CloneFrom: IObjVer => scala.Unit,
    ID: scala.Double,
    ObjID: IObjID,
    Serialize: () => js.Array[scala.Double],
    SetIDs: (scala.Double, scala.Double, scala.Double) => scala.Unit,
    SetObjIDAndVersion: (IObjID, scala.Double) => scala.Unit,
    ToJSON: () => java.lang.String,
    Type: scala.Double,
    Unserialize: js.Array[scala.Double] => scala.Unit,
    Version: scala.Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), ID = ID, ObjID = ObjID, Serialize = js.Any.fromFunction0(Serialize), SetIDs = js.Any.fromFunction3(SetIDs), SetObjIDAndVersion = js.Any.fromFunction2(SetObjIDAndVersion), ToJSON = js.Any.fromFunction0(ToJSON), Type = Type, Unserialize = js.Any.fromFunction1(Unserialize), Version = Version)
  
    __obj.asInstanceOf[IObjVer]
  }
}

