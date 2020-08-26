package typings.mem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[ReturnType] extends js.Object {
  var data: ReturnType = js.native
  var maxAge: Double = js.native
}

object Data {
  @scala.inline
  def apply[ReturnType](data: ReturnType, maxAge: Double): Data[ReturnType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[ReturnType]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], ReturnType] (val x: Self with Data[ReturnType]) extends AnyVal {
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
    def setData(value: ReturnType): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
  }
  
}

