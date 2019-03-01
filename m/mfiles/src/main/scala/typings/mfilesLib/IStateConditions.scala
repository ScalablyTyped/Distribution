package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateConditions extends js.Object {
  var PropertyConditions: scala.Boolean
  var PropertyConditionsDefinition: ISearchConditions
  var VBScript: scala.Boolean
  var VBScriptDefinition: java.lang.String
  def Clone(): IStateConditions
}

object IStateConditions {
  @scala.inline
  def apply(
    Clone: js.Function0[IStateConditions],
    PropertyConditions: scala.Boolean,
    PropertyConditionsDefinition: ISearchConditions,
    VBScript: scala.Boolean,
    VBScriptDefinition: java.lang.String
  ): IStateConditions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("PropertyConditions")(PropertyConditions)
    __obj.updateDynamic("PropertyConditionsDefinition")(PropertyConditionsDefinition)
    __obj.updateDynamic("VBScript")(VBScript)
    __obj.updateDynamic("VBScriptDefinition")(VBScriptDefinition)
    __obj.asInstanceOf[IStateConditions]
  }
}

