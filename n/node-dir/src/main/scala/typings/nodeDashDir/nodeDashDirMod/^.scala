package typings.nodeDashDir.nodeDashDirMod

import typings.nodeDashDir.Anon_Sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def files(dir: String, callback: js.Function2[/* error */ js.Any, /* files */ js.Array[String], Unit]): Unit = js.native
  def files(dir: String, syncOption: Anon_Sync): js.Array[String] = js.native
  def paths(dir: String, callback: js.Function2[/* error */ js.Any, /* paths */ PathsResult, Unit]): Unit = js.native
  def paths(
    dir: String,
    combine: Boolean,
    callback: js.Function2[/* error */ js.Any, /* paths */ js.Array[String] | PathsResult, Unit]
  ): Unit = js.native
  def promiseFiles(dir: String): js.Promise[js.Array[String]] = js.native
  def readFiles(dir: String, fileCallback: FileCallback): Unit = js.native
  def readFiles(dir: String, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = js.native
  def readFiles(dir: String, fileCallback: FileNamedCallback): Unit = js.native
  def readFiles(dir: String, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = js.native
  def readFiles(dir: String, options: Options, fileCallback: FileCallback): Unit = js.native
  def readFiles(dir: String, options: Options, fileCallback: FileCallback, finishedCallback: FinishedCallback): Unit = js.native
  def readFiles(dir: String, options: Options, fileCallback: FileNamedCallback): Unit = js.native
  def readFiles(dir: String, options: Options, fileCallback: FileNamedCallback, finishedCallback: FinishedCallback): Unit = js.native
  def readFilesStream(dir: String, options: Options, streamCallback: StreamCallback): Unit = js.native
  def readFilesStream(dir: String, options: Options, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = js.native
  def readFilesStream(dir: String, streamCallback: StreamCallback): Unit = js.native
  def readFilesStream(dir: String, streamCallback: StreamCallback, finishedCallback: FinishedCallback): Unit = js.native
  def subdirs(dir: String, callback: js.Function2[/* error */ js.Any, /* subdirs */ js.Array[String], Unit]): Unit = js.native
}

