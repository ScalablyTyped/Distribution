package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateConditions extends js.Object {
  var PropertyConditions: Boolean = js.native
  var PropertyConditionsDefinition: ISearchConditions = js.native
  var VBScript: Boolean = js.native
  var VBScriptDefinition: String = js.native
  def Clone(): IStateConditions = js.native
}

object IStateConditions {
  @scala.inline
  def apply(
    Clone: () => IStateConditions,
    PropertyConditions: Boolean,
    PropertyConditionsDefinition: ISearchConditions,
    VBScript: Boolean,
    VBScriptDefinition: String
  ): IStateConditions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyConditions = PropertyConditions.asInstanceOf[js.Any], PropertyConditionsDefinition = PropertyConditionsDefinition.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any], VBScriptDefinition = VBScriptDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateConditions]
  }
  @scala.inline
  implicit class IStateConditionsOps[Self <: IStateConditions] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IStateConditions): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setPropertyConditions(value: Boolean): Self = this.set("PropertyConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyConditionsDefinition(value: ISearchConditions): Self = this.set("PropertyConditionsDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setVBScript(value: Boolean): Self = this.set("VBScript", value.asInstanceOf[js.Any])
    @scala.inline
    def setVBScriptDefinition(value: String): Self = this.set("VBScriptDefinition", value.asInstanceOf[js.Any])
  }
  
}

