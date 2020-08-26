package typings.nodePowershell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellOptions extends js.Object {
  /**
    * Determines whether to log verbose to the console.
    */
  var debugMsg: js.UndefOr[Boolean] = js.native
  /**
    * Sets the default execution policy for the current shell session
    */
  var executionPolicy: js.UndefOr[String] = js.native
  /**
    * Sets the input encoding for the current shell.
    */
  var inputEncoding: js.UndefOr[String] = js.native
  /**
    * Determines whether to load the Windows PS profile
    */
  var noProfile: js.UndefOr[Boolean] = js.native
  /**
    * Sets the output encoding for the current shell.
    */
  var outputEncoding: js.UndefOr[String] = js.native
  /**
    * Instructs the Shell the use pwsh as the PowerShell runspace
    */
  var pwsh: js.UndefOr[Boolean] = js.native
  /**
    * Instruct the Shell to use pwsh-preview as the PowerShell runspace.
    */
  var pwshPrev: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether to log verbose to the console.
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object ShellOptions {
  @scala.inline
  def apply(): ShellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellOptions]
  }
  @scala.inline
  implicit class ShellOptionsOps[Self <: ShellOptions] (val x: Self) extends AnyVal {
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
    def setDebugMsg(value: Boolean): Self = this.set("debugMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugMsg: Self = this.set("debugMsg", js.undefined)
    @scala.inline
    def setExecutionPolicy(value: String): Self = this.set("executionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionPolicy: Self = this.set("executionPolicy", js.undefined)
    @scala.inline
    def setInputEncoding(value: String): Self = this.set("inputEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputEncoding: Self = this.set("inputEncoding", js.undefined)
    @scala.inline
    def setNoProfile(value: Boolean): Self = this.set("noProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoProfile: Self = this.set("noProfile", js.undefined)
    @scala.inline
    def setOutputEncoding(value: String): Self = this.set("outputEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputEncoding: Self = this.set("outputEncoding", js.undefined)
    @scala.inline
    def setPwsh(value: Boolean): Self = this.set("pwsh", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePwsh: Self = this.set("pwsh", js.undefined)
    @scala.inline
    def setPwshPrev(value: Boolean): Self = this.set("pwshPrev", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePwshPrev: Self = this.set("pwshPrev", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

