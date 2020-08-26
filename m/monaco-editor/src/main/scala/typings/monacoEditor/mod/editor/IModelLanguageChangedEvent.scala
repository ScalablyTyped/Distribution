package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModelLanguageChangedEvent extends js.Object {
  /**
    * New language
    */
  val newLanguage: String = js.native
  /**
    * Previous language
    */
  val oldLanguage: String = js.native
}

object IModelLanguageChangedEvent {
  @scala.inline
  def apply(newLanguage: String, oldLanguage: String): IModelLanguageChangedEvent = {
    val __obj = js.Dynamic.literal(newLanguage = newLanguage.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelLanguageChangedEvent]
  }
  @scala.inline
  implicit class IModelLanguageChangedEventOps[Self <: IModelLanguageChangedEvent] (val x: Self) extends AnyVal {
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
    def setNewLanguage(value: String): Self = this.set("newLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldLanguage(value: String): Self = this.set("oldLanguage", value.asInstanceOf[js.Any])
  }
  
}

