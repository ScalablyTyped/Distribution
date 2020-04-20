package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateConditions extends js.Object {
  var PropertyConditions: Boolean
  var PropertyConditionsDefinition: ISearchConditions
  var VBScript: Boolean
  var VBScriptDefinition: String
  def Clone(): IStateConditions
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
}

