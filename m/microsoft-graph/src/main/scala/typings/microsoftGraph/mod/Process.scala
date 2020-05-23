package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  // User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
  var accountName: js.UndefOr[String] = js.undefined
  // The full process invocation commandline including all parameters.
  var commandLine: js.UndefOr[String] = js.undefined
  /**
    * Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.undefined
  // The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
  var integrityLevel: js.UndefOr[ProcessIntegrityLevel] = js.undefined
  // True if the process is elevated.
  var isElevated: js.UndefOr[Boolean] = js.undefined
  // The name of the process' Image file.
  var name: js.UndefOr[String] = js.undefined
  /**
    * DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'.
    */
  var parentProcessCreatedDateTime: js.UndefOr[String] = js.undefined
  // The Process ID (PID) of the parent process.
  var parentProcessId: js.UndefOr[Double] = js.undefined
  // The name of the image file of the parent process.
  var parentProcessName: js.UndefOr[String] = js.undefined
  // Full path, including filename.
  var path: js.UndefOr[String] = js.undefined
  // The Process ID (PID) of the process.
  var processId: js.UndefOr[Double] = js.undefined
}

object Process {
  @scala.inline
  def apply(
    accountName: String = null,
    commandLine: String = null,
    createdDateTime: String = null,
    fileHash: FileHash = null,
    integrityLevel: ProcessIntegrityLevel = null,
    isElevated: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parentProcessCreatedDateTime: String = null,
    parentProcessId: js.UndefOr[Double] = js.undefined,
    parentProcessName: String = null,
    path: String = null,
    processId: js.UndefOr[Double] = js.undefined
  ): Process = {
    val __obj = js.Dynamic.literal()
    if (accountName != null) __obj.updateDynamic("accountName")(accountName.asInstanceOf[js.Any])
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash.asInstanceOf[js.Any])
    if (integrityLevel != null) __obj.updateDynamic("integrityLevel")(integrityLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(isElevated)) __obj.updateDynamic("isElevated")(isElevated.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentProcessCreatedDateTime != null) __obj.updateDynamic("parentProcessCreatedDateTime")(parentProcessCreatedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(parentProcessId)) __obj.updateDynamic("parentProcessId")(parentProcessId.get.asInstanceOf[js.Any])
    if (parentProcessName != null) __obj.updateDynamic("parentProcessName")(parentProcessName.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(processId)) __obj.updateDynamic("processId")(processId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
}

