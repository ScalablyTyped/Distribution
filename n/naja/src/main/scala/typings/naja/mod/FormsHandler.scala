package typings.naja.mod

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormsHandler extends js.Object {
  var netteForms: js.Object = js.native
  def initForms(element: Element): Unit = js.native
  def processForm(event: Event): Unit = js.native
}

object FormsHandler {
  @scala.inline
  def apply(initForms: Element => Unit, netteForms: js.Object, processForm: Event => Unit): FormsHandler = {
    val __obj = js.Dynamic.literal(initForms = js.Any.fromFunction1(initForms), netteForms = netteForms.asInstanceOf[js.Any], processForm = js.Any.fromFunction1(processForm))
    __obj.asInstanceOf[FormsHandler]
  }
  @scala.inline
  implicit class FormsHandlerOps[Self <: FormsHandler] (val x: Self) extends AnyVal {
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
    def setInitForms(value: Element => Unit): Self = this.set("initForms", js.Any.fromFunction1(value))
    @scala.inline
    def setNetteForms(value: js.Object): Self = this.set("netteForms", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessForm(value: Event => Unit): Self = this.set("processForm", js.Any.fromFunction1(value))
  }
  
}

