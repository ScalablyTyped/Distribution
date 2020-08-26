package typings.phin.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends js.Object {
  var form: StringDictionary[String] = js.native
}

object Form {
  @scala.inline
  def apply(form: StringDictionary[String]): Form = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.asInstanceOf[Form]
  }
  @scala.inline
  implicit class FormOps[Self <: Form] (val x: Self) extends AnyVal {
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
    def setForm(value: StringDictionary[String]): Self = this.set("form", value.asInstanceOf[js.Any])
  }
  
}

