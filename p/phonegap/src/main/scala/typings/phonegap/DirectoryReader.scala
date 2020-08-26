package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryReader extends js.Object {
  def readEntries(
    successCallback: js.Function1[/* entries */ FileSystemEntry, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
}

object DirectoryReader {
  @scala.inline
  def apply(
    readEntries: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Unit
  ): DirectoryReader = {
    val __obj = js.Dynamic.literal(readEntries = js.Any.fromFunction2(readEntries))
    __obj.asInstanceOf[DirectoryReader]
  }
  @scala.inline
  implicit class DirectoryReaderOps[Self <: DirectoryReader] (val x: Self) extends AnyVal {
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
    def setReadEntries(
      value: (js.Function1[/* entries */ FileSystemEntry, Unit], js.Function1[/* error */ FileError, Unit]) => Unit
    ): Self = this.set("readEntries", js.Any.fromFunction2(value))
  }
  
}

