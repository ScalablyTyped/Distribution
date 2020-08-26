package typings.osService.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOptions extends js.Object {
  /**
    * An array of strings specifying other services this service depends on, this is optional
    */
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  /**
    * The services display name, defaults to the name parameter. T
    * his parameter will be used on Windows platforms only
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to nodePath, defaults to []
    */
  var nodeArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fully qualified path to the node binary used to run the service
    * (i.e. c:\Program Files\nodejs\node.exe, defaults to the value of process.execPath
    */
  var nodePath: js.UndefOr[String] = js.native
  /**
    * See the username parameter
    */
  var password: js.UndefOr[String] = js.native
  /**
    * An array of strings specifying parameters to pass to programPath, defaults to []
    */
  var programArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The program to run using nodePath, defaults to the value of process.argv[1]
    */
  var programPath: js.UndefOr[String] = js.native
  /**
    * An array of numbers specifying Linux run-levels at which the service should be started
    * for Linux platforms, defaults to [2, 3, 4, 5], this is only used when chkconfig or
    * update-rc.d is used to install a service
    */
  var runLevels: js.UndefOr[js.Array[Double]] = js.native
  /**
    * For when systemd will be used a target can be specified for the WantedBy
    * attribute under the [Install] section in the generated systemd unit file,
    * defaults to multi-user.target
    */
  var systemdWantedBy: js.UndefOr[String] = js.native
  /**
    * For Windows platforms a username and password can be specified,
    * the service will be run using these credentials when started,
    * see the CreateService() functions win32 API documentation for
    * details on the format of the username, on all other platforms this parameter is ignored
    */
  var username: js.UndefOr[String] = js.native
}

object AddOptions {
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setNodeArgsVarargs(value: String*): Self = this.set("nodeArgs", js.Array(value :_*))
    @scala.inline
    def setNodeArgs(value: js.Array[String]): Self = this.set("nodeArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeArgs: Self = this.set("nodeArgs", js.undefined)
    @scala.inline
    def setNodePath(value: String): Self = this.set("nodePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePath: Self = this.set("nodePath", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setProgramArgsVarargs(value: String*): Self = this.set("programArgs", js.Array(value :_*))
    @scala.inline
    def setProgramArgs(value: js.Array[String]): Self = this.set("programArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramArgs: Self = this.set("programArgs", js.undefined)
    @scala.inline
    def setProgramPath(value: String): Self = this.set("programPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgramPath: Self = this.set("programPath", js.undefined)
    @scala.inline
    def setRunLevelsVarargs(value: Double*): Self = this.set("runLevels", js.Array(value :_*))
    @scala.inline
    def setRunLevels(value: js.Array[Double]): Self = this.set("runLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunLevels: Self = this.set("runLevels", js.undefined)
    @scala.inline
    def setSystemdWantedBy(value: String): Self = this.set("systemdWantedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemdWantedBy: Self = this.set("systemdWantedBy", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

