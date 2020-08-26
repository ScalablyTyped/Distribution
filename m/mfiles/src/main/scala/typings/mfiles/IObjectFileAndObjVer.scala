package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectFileAndObjVer extends js.Object {
  val ObjVer: IObjVer = js.native
  val ObjectFile: IObjectFile = js.native
  def Clone(): IObjectFileAndObjVer = js.native
  def ToJSON(): String = js.native
}

object IObjectFileAndObjVer {
  @scala.inline
  def apply(Clone: () => IObjectFileAndObjVer, ObjVer: IObjVer, ObjectFile: IObjectFile, ToJSON: () => String): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer.asInstanceOf[js.Any], ObjectFile = ObjectFile.asInstanceOf[js.Any], ToJSON = js.Any.fromFunction0(ToJSON))
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
  @scala.inline
  implicit class IObjectFileAndObjVerOps[Self <: IObjectFileAndObjVer] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IObjectFileAndObjVer): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectFile(value: IObjectFile): Self = this.set("ObjectFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("ToJSON", js.Any.fromFunction0(value))
  }
  
}

