package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjVers extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, ObjVer: IObjVer): Unit = js.native
  def Clone(): IObjVers = js.native
  def GetAllDistinctObjIDs(): IObjIDs = js.native
  def Item(Index: Double): IObjVer = js.native
  def Remove(Index: Double): Unit = js.native
  def ToJSON(): String = js.native
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
  @scala.inline
  implicit class IObjVersOps[Self <: IObjVers] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, IObjVer) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setClone(value: () => IObjVers): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAllDistinctObjIDs(value: () => IObjIDs): Self = this.set("GetAllDistinctObjIDs", js.Any.fromFunction0(value))
    @scala.inline
    def setItem(value: Double => IObjVer): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("ToJSON", js.Any.fromFunction0(value))
  }
  
}

