package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  // User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  // The full process invocation commandline including all parameters.
  var commandLine: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[FileHash] = js.undefined
  // The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
  var integrityLevel: js.UndefOr[ProcessIntegrityLevel] = js.undefined
  // True if the process is elevated.
  var isElevated: js.UndefOr[scala.Boolean] = js.undefined
  // The name of the process' Image file.
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'.
    */
  var parentProcessCreatedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The Process ID (PID) of the parent process.
  var parentProcessId: js.UndefOr[scala.Double] = js.undefined
  // The name of the image file of the parent process.
  var parentProcessName: js.UndefOr[java.lang.String] = js.undefined
  // Full path, including filename.
  var path: js.UndefOr[java.lang.String] = js.undefined
  // The Process ID (PID) of the process.
  var processId: js.UndefOr[scala.Double] = js.undefined
}

object Process {
  @scala.inline
  def apply(
    accountName: java.lang.String = null,
    commandLine: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    fileHash: FileHash = null,
    integrityLevel: ProcessIntegrityLevel = null,
    isElevated: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    parentProcessCreatedDateTime: java.lang.String = null,
    parentProcessId: scala.Int | scala.Double = null,
    parentProcessName: java.lang.String = null,
    path: java.lang.String = null,
    processId: scala.Int | scala.Double = null
  ): Process = {
    val __obj = js.Dynamic.literal()
    if (accountName != null) __obj.updateDynamic("accountName")(accountName)
    if (commandLine != null) __obj.updateDynamic("commandLine")(commandLine)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (fileHash != null) __obj.updateDynamic("fileHash")(fileHash)
    if (integrityLevel != null) __obj.updateDynamic("integrityLevel")(integrityLevel)
    if (!js.isUndefined(isElevated)) __obj.updateDynamic("isElevated")(isElevated)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentProcessCreatedDateTime != null) __obj.updateDynamic("parentProcessCreatedDateTime")(parentProcessCreatedDateTime)
    if (parentProcessId != null) __obj.updateDynamic("parentProcessId")(parentProcessId.asInstanceOf[js.Any])
    if (parentProcessName != null) __obj.updateDynamic("parentProcessName")(parentProcessName)
    if (path != null) __obj.updateDynamic("path")(path)
    if (processId != null) __obj.updateDynamic("processId")(processId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Process]
  }
}

