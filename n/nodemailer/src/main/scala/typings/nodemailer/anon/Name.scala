package typings.nodemailer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Name extends js.Object {
  /**
    * The name of the tag. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.
    */
  var Name: String = js.native
  /**
    * The value of the tag. The value must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain less than 256 characters.
    */
  var Value: String = js.native
}

object Name {
  @scala.inline
  def apply(Name: String, Value: String): Name = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  @scala.inline
  implicit class NameOps[Self <: Name] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

