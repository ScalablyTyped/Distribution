package typings.parse.mod.global.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseOperation extends js.Object {
  def objects(): js.Array[_] = js.native
}

object BaseOperation {
  @scala.inline
  def apply(objects: () => js.Array[_]): BaseOperation = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects))
    __obj.asInstanceOf[BaseOperation]
  }
  @scala.inline
  implicit class BaseOperationOps[Self <: BaseOperation] (val x: Self) extends AnyVal {
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
    def setObjects(value: () => js.Array[_]): Self = this.set("objects", js.Any.fromFunction0(value))
  }
  
}

