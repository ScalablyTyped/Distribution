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
    Clone: js.Function0[IObjVer],
    CloneFrom: js.Function1[IObjVer, scala.Unit],
    ID: scala.Double,
    ObjID: IObjID,
    Serialize: js.Function0[js.Array[scala.Double]],
    SetIDs: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    SetObjIDAndVersion: js.Function2[IObjID, scala.Double, scala.Unit],
    ToJSON: js.Function0[java.lang.String],
    Type: scala.Double,
    Unserialize: js.Function1[js.Array[scala.Double], scala.Unit],
    Version: scala.Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("ObjID")(ObjID)
    __obj.updateDynamic("Serialize")(Serialize)
    __obj.updateDynamic("SetIDs")(SetIDs)
    __obj.updateDynamic("SetObjIDAndVersion")(SetObjIDAndVersion)
    __obj.updateDynamic("ToJSON")(ToJSON)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Unserialize")(Unserialize)
    __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[IObjVer]
  }
}

