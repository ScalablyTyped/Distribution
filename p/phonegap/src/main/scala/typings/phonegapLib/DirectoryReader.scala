package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectoryReader extends js.Object {
  def readEntries(
    successCallback: js.Function1[/* entries */ FileSystemEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit
}

