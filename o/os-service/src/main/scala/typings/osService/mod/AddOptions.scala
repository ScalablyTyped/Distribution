package typings.osService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends js.Object {
  /**
    * An array of strings specifying other services this service depends on, this is optional
    */
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The services display name, defaults to the name parameter. T
    * his parameter will be used on Windows platforms only
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The fully qualified path to the node binary used to run the service
    * (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[String] = js.undefined
  /**
    * See the username parameter
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[String] = js.undefined
  /**
    * An array of numbers specifying Linux run-levels at which the service should be started
    * for Linux platforms, defaults to [2, 3, 4, 5], this is only used when chkconfig or
    * update-rc.d is used to install a service
    */
  var runLevels: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * For when systemd will be used a target can be specified for the WantedBy
    * attribute under the [Install] section in the generated systemd unit file,
    * defaults to multi-user.target
    */
  var systemdWantedBy: js.UndefOr[String] = js.undefined
  /**
    * For Windows platforms a username and password can be specified,
    * the service will be run using these credentials when started,
    * see the CreateService() functions win32 API documentation for
    * details on the format of the username, on all other platforms this parameter is ignored
    */
  var username: js.UndefOr[String] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    dependencies: js.Array[String] = null,
    displayName: String = null,
    nodeArgs: js.Array[String] = null,
    nodePath: String = null,
    password: String = null,
    programArgs: js.Array[String] = null,
    programPath: String = null,
    runLevels: js.Array[Double] = null,
    systemdWantedBy: String = null,
    username: String = null
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (nodeArgs != null) __obj.updateDynamic("nodeArgs")(nodeArgs.asInstanceOf[js.Any])
    if (nodePath != null) __obj.updateDynamic("nodePath")(nodePath.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (programArgs != null) __obj.updateDynamic("programArgs")(programArgs.asInstanceOf[js.Any])
    if (programPath != null) __obj.updateDynamic("programPath")(programPath.asInstanceOf[js.Any])
    if (runLevels != null) __obj.updateDynamic("runLevels")(runLevels.asInstanceOf[js.Any])
    if (systemdWantedBy != null) __obj.updateDynamic("systemdWantedBy")(systemdWantedBy.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOptions]
  }
}

