package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransition extends js.Object {
  var AccessControlList: IAccessControlList
  var Description: java.lang.String
  var EvaluationOrderNumber: scala.Double
  var FromState: scala.Double
  var ID: scala.Double
  var Name: java.lang.String
  var SemanticAliases: ISemanticAliases
  var SignatureSettings: ISignatureSettings
  var ToState: scala.Double
  var TriggerAllowedByVBScript: java.lang.String
  var TriggerCriteria: ISearchConditions
  var TriggerInDays: scala.Double
  var TriggerMode: mfilesLib.MFilesNs.MFAutoStateTransitionMode
  def Clone(): IStateTransition
}

object IStateTransition {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: js.Function0[IStateTransition],
    Description: java.lang.String,
    EvaluationOrderNumber: scala.Double,
    FromState: scala.Double,
    ID: scala.Double,
    Name: java.lang.String,
    SemanticAliases: ISemanticAliases,
    SignatureSettings: ISignatureSettings,
    ToState: scala.Double,
    TriggerAllowedByVBScript: java.lang.String,
    TriggerCriteria: ISearchConditions,
    TriggerInDays: scala.Double,
    TriggerMode: mfilesLib.MFilesNs.MFAutoStateTransitionMode
  ): IStateTransition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessControlList")(AccessControlList)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("EvaluationOrderNumber")(EvaluationOrderNumber)
    __obj.updateDynamic("FromState")(FromState)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("SemanticAliases")(SemanticAliases)
    __obj.updateDynamic("SignatureSettings")(SignatureSettings)
    __obj.updateDynamic("ToState")(ToState)
    __obj.updateDynamic("TriggerAllowedByVBScript")(TriggerAllowedByVBScript)
    __obj.updateDynamic("TriggerCriteria")(TriggerCriteria)
    __obj.updateDynamic("TriggerInDays")(TriggerInDays)
    __obj.updateDynamic("TriggerMode")(TriggerMode)
    __obj.asInstanceOf[IStateTransition]
  }
}

