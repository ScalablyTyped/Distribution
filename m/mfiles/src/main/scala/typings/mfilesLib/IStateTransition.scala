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

