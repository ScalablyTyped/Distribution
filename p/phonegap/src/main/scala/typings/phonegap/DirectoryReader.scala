package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryReader extends js.Object {
  def readEntries(
    successCallback: js.Function1[/* entries */ FileSystemEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit
}

object DirectoryReader {
  @scala.inline
  def apply(
    readEntries: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Unit
  ): DirectoryReader = {
    val __obj = js.Dynamic.literal(readEntries = js.Any.fromFunction2(readEntries))
  
    __obj.asInstanceOf[DirectoryReader]
  }
}

