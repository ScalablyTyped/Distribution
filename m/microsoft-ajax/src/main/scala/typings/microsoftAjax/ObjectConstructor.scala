package typings.microsoftAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectConstructor extends js.Object {
  /**
    * Formats a number by using the invariant culture.
    */
  def getType(instance: js.Any): Type = js.native
  /**
    * Returns a string that identifies the run-time type name of an object.
    */
  def getTypeName(instance: js.Any): java.lang.String = js.native
}

object ObjectConstructor {
  @scala.inline
  def apply(getType: js.Any => Type, getTypeName: js.Any => java.lang.String): ObjectConstructor = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), getTypeName = js.Any.fromFunction1(getTypeName))
    __obj.asInstanceOf[ObjectConstructor]
  }
  @scala.inline
  implicit class ObjectConstructorOps[Self <: ObjectConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetType(value: js.Any => Type): Self = this.set("getType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTypeName(value: js.Any => java.lang.String): Self = this.set("getTypeName", js.Any.fromFunction1(value))
  }
  
}

