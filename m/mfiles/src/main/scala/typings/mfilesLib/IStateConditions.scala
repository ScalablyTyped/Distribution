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
    Clone: () => IStateConditions,
    PropertyConditions: scala.Boolean,
    PropertyConditionsDefinition: ISearchConditions,
    VBScript: scala.Boolean,
    VBScriptDefinition: java.lang.String
  ): IStateConditions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), PropertyConditions = PropertyConditions, PropertyConditionsDefinition = PropertyConditionsDefinition, VBScript = VBScript, VBScriptDefinition = VBScriptDefinition)
  
    __obj.asInstanceOf[IStateConditions]
  }
}

