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
    Clone: js.Function0[IObjID],
    CloneFrom: js.Function1[IObjID, scala.Unit],
    ID: scala.Double,
    Serialize: js.Function0[js.Array[scala.Double]],
    SetIDs: js.Function2[scala.Double, scala.Double, scala.Unit],
    ToJSON: js.Function0[java.lang.String],
    Type: scala.Double,
    Unserialize: js.Function1[js.Array[scala.Double], scala.Unit]
  ): IObjID = {
    val __obj = js.Dynamic.literal(Clone = Clone, CloneFrom = CloneFrom, ID = ID, Serialize = Serialize, SetIDs = SetIDs, ToJSON = ToJSON, Type = Type, Unserialize = Unserialize)
  
    __obj.asInstanceOf[IObjID]
  }
}

