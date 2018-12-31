package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectClassAdmin extends js.Object {
  val AdditionalClassInfo: IAdditionalClassInfo
  var AssociatedPropertyDefs: IAssociatedPropertyDefs
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  var ForceWorkflow: scala.Boolean
  var ID: scala.Double
  var Name: java.lang.String
  var NamePropertyDef: scala.Double
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  var Predefined: scala.Boolean
  var SemanticAliases: ISemanticAliases
  var Workflow: scala.Double
  def Clone(): IObjectClassAdmin
}

