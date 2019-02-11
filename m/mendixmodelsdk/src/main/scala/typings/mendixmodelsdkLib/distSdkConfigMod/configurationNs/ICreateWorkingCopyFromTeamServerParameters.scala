package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyFromTeamServerParameters extends ICreateWorkingCopyParametersBase {
  /**
    * Indicates whether this WC is created for the purpose of collaboration between the Desktop modeler and Webmodeler.
    * This parameter can only be set to true when the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var isCollaboration: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("projectId")
  var projectId_ICreateWorkingCopyFromTeamServerParameters: java.lang.String
  @JSName("teamServerBaseBranch")
  var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: java.lang.String
  @JSName("teamServerBaseRevision")
  var teamServerBaseRevision_ICreateWorkingCopyFromTeamServerParameters: scala.Double
}

