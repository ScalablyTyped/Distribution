package typings
package mendixmodelsdkLib.distSdkConfigMod.configurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateWorkingCopyParametersBase extends js.Object {
  var avatarUrl: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the working copy should be long-lived.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var longLived: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Force the working copy state to be marked to contain changes.
    *  - this excludes regular SDK users for the moment.
    */
  var markAsChanged: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  /**
    * Mendix project id. Needed for deployment and team server commits
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether the new working copy should be the default working copy associated with the provided projectId.
    * This means that this working copy will be opened in the Web Modeler for the given project.
    * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
    *  - this excludes regular SDK users for the moment.
    */
  var setAsDefault: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    */
  var teamServerBaseBranch: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
    * @type {number}
    */
  var teamServerBaseRevision: js.UndefOr[scala.Double] = js.undefined
}

