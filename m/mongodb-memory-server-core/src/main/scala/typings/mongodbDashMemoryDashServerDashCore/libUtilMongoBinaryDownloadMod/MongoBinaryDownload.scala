package typings.mongodbDashMemoryDashServerDashCore.libUtilMongoBinaryDownloadMod

import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.DebugFn
import typings.mongodbDashMemoryDashServerDashCore.libTypesMod.DownloadProgressT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoBinaryDownload extends js.Object {
  var _downloadingUrl: js.UndefOr[String] = js.native
  var arch: String = js.native
  var checkMD5: Boolean = js.native
  @JSName("debug")
  var debug_Original: DebugFn = js.native
  var dlProgress: DownloadProgressT = js.native
  var downloadDir: String = js.native
  var platform: String = js.native
  var version: String = js.native
  def debug(args: js.Any*): js.Any = js.native
  def download(downloadUrl: String): js.Promise[String] = js.native
  def extract(mongoDBArchive: String): js.Promise[String] = js.native
  def getMongodPath(): js.Promise[String] = js.native
  def httpDownload(httpOptions: HttpDownloadOptions, downloadLocation: String, tempDownloadLocation: String): js.Promise[String] = js.native
  def locationExists(location: String): Boolean = js.native
  def makeMD5check(urlForReferenceMD5: String, mongoDBArchive: String): js.Promise[js.UndefOr[Boolean]] = js.native
  def printDownloadProgress(chunk: js.Any): Unit = js.native
  def startDownload(): js.Promise[String] = js.native
}

