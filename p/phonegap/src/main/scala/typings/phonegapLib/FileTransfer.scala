package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransfer extends js.Object {
  var onprogress: js.Function = js.native
  def abort(): scala.Unit = js.native
  def download(
    source: java.lang.String,
    target: java.lang.String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def download(
    source: java.lang.String,
    target: java.lang.String,
    successCallback: js.Function1[/* fileEntry */ FileEntry, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit],
    options: js.Any
  ): scala.Unit = js.native
  //upload(filePath: string, server: string, successCallback: (metadata: Metadata) => void , errorCallback: (error: FileError) => void , options?: any): void;
  def upload(
    filePath: java.lang.String,
    server: java.lang.String,
    successCallback: js.Function1[/* result */ FileUploadResult, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit]
  ): scala.Unit = js.native
  def upload(
    filePath: java.lang.String,
    server: java.lang.String,
    successCallback: js.Function1[/* result */ FileUploadResult, scala.Unit],
    errorCallback: js.Function1[/* error */ FileError, scala.Unit],
    options: js.Any
  ): scala.Unit = js.native
}

@JSGlobal("FileTransfer")
@js.native
class FileTransferCls () extends FileTransfer

@JSGlobal("FileTransfer")
@js.native
object FileTransfer
  extends org.scalablytyped.runtime.Instantiable0[FileTransfer]

