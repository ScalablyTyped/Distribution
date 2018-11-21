package typings
package mendixmodelsdkLib.distSdkConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/config", "configuration")
@js.native
object configurationNs extends js.Object {
  /**
       * The credentials with which a trusted backend client (such as sprintr) connects to the Model API Server.
       */
  
  trait IBackendCredentials extends js.Object {
    /** The OpenID on behalf which the trusted backend service operates. */
    var openid: js.UndefOr[java.lang.String] = js.undefined
    var password: java.lang.String
    var username: java.lang.String
  }
  
  
  trait ICreateWorkingCopyParameters extends js.Object {
    var avatarUrl: js.UndefOr[java.lang.String] = js.undefined
    var description: js.UndefOr[java.lang.String] = js.undefined
    /**
             * Indicates whether the working copy should be long-lived.
             * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
             *  - this excludes regular SDK users for the moment.
             */
    var longLived: js.UndefOr[scala.Boolean] = js.undefined
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
             * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge
             */
    var teamServerBaseBranch: js.UndefOr[java.lang.String] = js.undefined
    /**
             * If this WC is created from a TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge
             * @type {number}
             */
    var teamServerBaseRevision: js.UndefOr[scala.Double] = js.undefined
    /**
             * Path to the (template) MPK file.
             */
    var template: java.lang.String
    /**
             * If specified, this working copy ID is used instead of a randomly-generated one.
             * This parameter can only be set by a trusted backend.
             */
    var workingCopyId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
       * All the details of the connection that's been set up to the Model API Server.
       */
  
  trait ISdkConfig extends js.Object {
    var client: js.UndefOr[mendixmodelsdkLib.distSdkInternalModelDashServerDashClientMod.IModelServerClient] = js.undefined
    var credentials: js.UndefOr[IBackendCredentials | ISdkCredentials] = js.undefined
    var endPoint: js.UndefOr[java.lang.String] = js.undefined
    var transportation: js.UndefOr[mendixmodelsdkLib.distSdkInternalTransportationMod.ITransportation] = js.undefined
  }
  
  
  trait ISdkCredentials extends js.Object {
    var apikey: java.lang.String
    var username: java.lang.String
  }
  
  def assertBackendAccess(config: ISdkConfig): scala.Unit = js.native
  def checkCallbacks(): scala.Unit = js.native
  def checkCallbacks(callback: js.Function): scala.Unit = js.native
  def checkCallbacks(callback: js.Function, errorCallback: js.Function): scala.Unit = js.native
  def checkCallbacks(callback: js.UndefOr[scala.Nothing], errorCallback: js.Function): scala.Unit = js.native
  def checkWorkingCopyId(workingCopyId: java.lang.String): scala.Unit = js.native
  type ICreateWorkingCopyFromTeamServerParameters = stdLib.Pick[
    ICreateWorkingCopyParameters, 
    stdLib.Exclude[
      mendixmodelsdkLib.mendixmodelsdkLibStrings.workingCopyId | mendixmodelsdkLib.mendixmodelsdkLibStrings.name | mendixmodelsdkLib.mendixmodelsdkLibStrings.projectId | mendixmodelsdkLib.mendixmodelsdkLibStrings.description | mendixmodelsdkLib.mendixmodelsdkLibStrings.avatarUrl | mendixmodelsdkLib.mendixmodelsdkLibStrings.template | mendixmodelsdkLib.mendixmodelsdkLibStrings.longLived | mendixmodelsdkLib.mendixmodelsdkLibStrings.setAsDefault | mendixmodelsdkLib.mendixmodelsdkLibStrings.teamServerBaseRevision | mendixmodelsdkLib.mendixmodelsdkLibStrings.teamServerBaseBranch, 
      mendixmodelsdkLib.mendixmodelsdkLibStrings.template
    ]
  ]
}

