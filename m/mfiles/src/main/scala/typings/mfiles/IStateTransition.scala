package typings.mfiles

import typings.mfiles.MFiles.MFAutoStateTransitionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransition extends js.Object {
  var AccessControlList: IAccessControlList
  var Description: String
  var EvaluationOrderNumber: Double
  var FromState: Double
  var ID: Double
  var Name: String
  var SemanticAliases: ISemanticAliases
  var SignatureSettings: ISignatureSettings
  var ToState: Double
  var TriggerAllowedByVBScript: String
  var TriggerCriteria: ISearchConditions
  var TriggerInDays: Double
  var TriggerMode: MFAutoStateTransitionMode
  def Clone(): IStateTransition
}

object IStateTransition {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IStateTransition,
    Description: String,
    EvaluationOrderNumber: Double,
    FromState: Double,
    ID: Double,
    Name: String,
    SemanticAliases: ISemanticAliases,
    SignatureSettings: ISignatureSettings,
    ToState: Double,
    TriggerAllowedByVBScript: String,
    TriggerCriteria: ISearchConditions,
    TriggerInDays: Double,
    TriggerMode: MFAutoStateTransitionMode
  ): IStateTransition = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, Clone = js.Any.fromFunction0(Clone), Description = Description, EvaluationOrderNumber = EvaluationOrderNumber, FromState = FromState, ID = ID, Name = Name, SemanticAliases = SemanticAliases, SignatureSettings = SignatureSettings, ToState = ToState, TriggerAllowedByVBScript = TriggerAllowedByVBScript, TriggerCriteria = TriggerCriteria, TriggerInDays = TriggerInDays, TriggerMode = TriggerMode)
  
    __obj.asInstanceOf[IStateTransition]
  }
}

