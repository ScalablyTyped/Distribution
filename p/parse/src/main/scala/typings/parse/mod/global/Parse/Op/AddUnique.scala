package typings.parse.mod.global.Parse.Op

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddUnique extends BaseOperation {
  def toJSON(): js.Any = js.native
}

object AddUnique {
  @scala.inline
  def apply(objects: () => js.Array[_], toJSON: () => js.Any): AddUnique = {
    val __obj = js.Dynamic.literal(objects = js.Any.fromFunction0(objects), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AddUnique]
  }
  @scala.inline
  implicit class AddUniqueOps[Self <: AddUnique] (val x: Self) extends AnyVal {
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

