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
  /**
    * Download file from downloadUrl
    * @param downloadUrl URL to download a File
    */
  def download(downloadUrl: String): js.Promise[String] = js.native
  /**
    * Extract given Archive
    * @param mongoDBArchive Archive location
    * @returns extracted directory location
    */
  def extract(mongoDBArchive: String): js.Promise[String] = js.native
  /**
    * Get the path of the already downloaded "mongod" file
    * otherwise download it and then return the path
    */
  def getMongodPath(): js.Promise[String] = js.native
  /**
    * Downlaod given httpOptions to tempDownloadLocation, then move it to downloadLocation
    * @param httpOptions The httpOptions directly passed to https.get
    * @param downloadLocation The location the File should be after the download
    * @param tempDownloadLocation The location the File should be while downloading
    */
  def httpDownload(httpOptions: HttpDownloadOptions, downloadLocation: String, tempDownloadLocation: String): js.Promise[String] = js.native
  /**
    * Test if the location given is already used
    * Does *not* dereference links
    * @param location The Path to test
    */
  def locationExists(location: String): js.Promise[Boolean] = js.native
  /**
    * Download MD5 file and check it against the MongoDB Archive
    * @param urlForReferenceMD5 URL to download the MD5
    * @param mongoDBArchive The MongoDB Archive file location
    */
  def makeMD5check(urlForReferenceMD5: String, mongoDBArchive: String): js.Promise[js.UndefOr[Boolean]] = js.native
  /**
    * Print the Download Progress to STDOUT
    * @param chunk A chunk to get the length
    */
  def printDownloadProgress(chunk: js.Any): Unit = js.native
  /**
    * Download the MongoDB Archive and check it against an MD5
    * @returns The MongoDB Archive location
    */
  def startDownload(): js.Promise[String] = js.native
}

