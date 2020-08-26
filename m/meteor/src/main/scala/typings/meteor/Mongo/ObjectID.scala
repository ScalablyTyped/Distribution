package typings.meteor.Mongo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectID extends js.Object {
  def equals(otherID: ObjectID): Boolean = js.native
  def toHexString(): String = js.native
}

object ObjectID {
  @scala.inline
  def apply(equals: ObjectID => Boolean, toHexString: () => String): ObjectID = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), toHexString = js.Any.fromFunction0(toHexString))
    __obj.asInstanceOf[ObjectID]
  }
  @scala.inline
  implicit class ObjectIDOps[Self <: ObjectID] (val x: Self) extends AnyVal {
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
    def setEquals(value: ObjectID => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setToHexString(value: () => String): Self = this.set("toHexString", js.Any.fromFunction0(value))
  }
  
}

