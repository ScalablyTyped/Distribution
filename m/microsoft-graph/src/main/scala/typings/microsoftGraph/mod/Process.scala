package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends js.Object {
  // User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
  var accountName: js.UndefOr[String] = js.native
  // The full process invocation commandline including all parameters.
  var commandLine: js.UndefOr[String] = js.native
  /**
    * Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.native
  // The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
  var integrityLevel: js.UndefOr[ProcessIntegrityLevel] = js.native
  // True if the process is elevated.
  var isElevated: js.UndefOr[Boolean] = js.native
  // The name of the process' Image file.
  var name: js.UndefOr[String] = js.native
  /**
    * DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'.
    */
  var parentProcessCreatedDateTime: js.UndefOr[String] = js.native
  // The Process ID (PID) of the parent process.
  var parentProcessId: js.UndefOr[Double] = js.native
  // The name of the image file of the parent process.
  var parentProcessName: js.UndefOr[String] = js.native
  // Full path, including filename.
  var path: js.UndefOr[String] = js.native
  // The Process ID (PID) of the process.
  var processId: js.UndefOr[Double] = js.native
}

object Process {
  @scala.inline
  def apply(): Process = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Process]
  }
  @scala.inline
  implicit class ProcessOps[Self <: Process] (val x: Self) extends AnyVal {
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setCommandLine(value: String): Self = this.set("commandLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandLine: Self = this.set("commandLine", js.undefined)
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    @scala.inline
    def setFileHash(value: FileHash): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
    @scala.inline
    def setIntegrityLevel(value: ProcessIntegrityLevel): Self = this.set("integrityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrityLevel: Self = this.set("integrityLevel", js.undefined)
    @scala.inline
    def setIsElevated(value: Boolean): Self = this.set("isElevated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsElevated: Self = this.set("isElevated", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentProcessCreatedDateTime(value: String): Self = this.set("parentProcessCreatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProcessCreatedDateTime: Self = this.set("parentProcessCreatedDateTime", js.undefined)
    @scala.inline
    def setParentProcessId(value: Double): Self = this.set("parentProcessId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProcessId: Self = this.set("parentProcessId", js.undefined)
    @scala.inline
    def setParentProcessName(value: String): Self = this.set("parentProcessName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentProcessName: Self = this.set("parentProcessName", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessId: Self = this.set("processId", js.undefined)
  }
  
}

