package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjVer extends js.Object {
  var ID: Double = js.native
  var ObjID: IObjID = js.native
  var Type: Double = js.native
  var Version: Double = js.native
  def Clone(): IObjVer = js.native
  def CloneFrom(ObjVer: IObjVer): Unit = js.native
  def Serialize(): js.Array[Double] = js.native
  def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit = js.native
  def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit = js.native
  def ToJSON(): String = js.native
  def Unserialize(Bytes: js.Array[Double]): Unit = js.native
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
  @scala.inline
  implicit class IObjVerOps[Self <: IObjVer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IObjVer): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: IObjVer => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjID(value: IObjID): Self = this.set("ObjID", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialize(value: () => js.Array[Double]): Self = this.set("Serialize", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIDs(value: (Double, Double, Double) => Unit): Self = this.set("SetIDs", js.Any.fromFunction3(value))
    @scala.inline
    def setSetObjIDAndVersion(value: (IObjID, Double) => Unit): Self = this.set("SetObjIDAndVersion", js.Any.fromFunction2(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("ToJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnserialize(value: js.Array[Double] => Unit): Self = this.set("Unserialize", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}

