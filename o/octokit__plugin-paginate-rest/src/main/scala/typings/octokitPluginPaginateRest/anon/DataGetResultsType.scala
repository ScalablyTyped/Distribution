package typings.octokitPluginPaginateRest.anon

import typings.octokitPluginPaginateRest.typesMod.GetResultsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataGetResultsType[T] extends js.Object {
  var data: GetResultsType[T] = js.native
}

object DataGetResultsType {
  @scala.inline
  def apply[T](data: GetResultsType[T]): DataGetResultsType[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGetResultsType[T]]
  }
  @scala.inline
  implicit class DataGetResultsTypeOps[Self <: DataGetResultsType[_], T] (val x: Self with DataGetResultsType[T]) extends AnyVal {
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
    def setData(value: GetResultsType[T]): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

