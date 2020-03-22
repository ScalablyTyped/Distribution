package typings.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typings.mongodbMemoryServerCore.typesMod.DownloadProgressT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoBinaryDownload extends js.Object {
  var _downloadingUrl: js.UndefOr[String] = js.undefined
  var arch: String
  var checkMD5: Boolean
  var dlProgress: DownloadProgressT
  var downloadDir: String
  var platform: String
  var version: String
  /**
    * Download file from downloadUrl
    * @param downloadUrl URL to download a File
    */
  def download(downloadUrl: String): js.Promise[String]
  /**
    * Extract given Archive
    * @param mongoDBArchive Archive location
    * @returns extracted directory location
    */
  def extract(mongoDBArchive: String): js.Promise[String]
  /**
    * Get the path of the already downloaded "mongod" file
    * otherwise download it and then return the path
    */
  def getMongodPath(): js.Promise[String]
  /**
    * Downlaod given httpOptions to tempDownloadLocation, then move it to downloadLocation
    * @param httpOptions The httpOptions directly passed to https.get
    * @param downloadLocation The location the File should be after the download
    * @param tempDownloadLocation The location the File should be while downloading
    */
  def httpDownload(httpOptions: HttpDownloadOptions, downloadLocation: String, tempDownloadLocation: String): js.Promise[String]
  /**
    * Test if the location given is already used
    * Does *not* dereference links
    * @param location The Path to test
    */
  def locationExists(location: String): js.Promise[Boolean]
  /**
    * Download MD5 file and check it against the MongoDB Archive
    * @param urlForReferenceMD5 URL to download the MD5
    * @param mongoDBArchive The MongoDB Archive file location
    */
  def makeMD5check(urlForReferenceMD5: String, mongoDBArchive: String): js.Promise[js.UndefOr[Boolean]]
  /**
    * Print the Download Progress to STDOUT
    * @param chunk A chunk to get the length
    */
  def printDownloadProgress(chunk: js.Any): Unit
  /**
    * Download the MongoDB Archive and check it against an MD5
    * @returns The MongoDB Archive location
    */
  def startDownload(): js.Promise[String]
}

object MongoBinaryDownload {
  @scala.inline
  def apply(
    arch: String,
    checkMD5: Boolean,
    dlProgress: DownloadProgressT,
    download: String => js.Promise[String],
    downloadDir: String,
    extract: String => js.Promise[String],
    getMongodPath: () => js.Promise[String],
    httpDownload: (HttpDownloadOptions, String, String) => js.Promise[String],
    locationExists: String => js.Promise[Boolean],
    makeMD5check: (String, String) => js.Promise[js.UndefOr[Boolean]],
    platform: String,
    printDownloadProgress: js.Any => Unit,
    startDownload: () => js.Promise[String],
    version: String,
    _downloadingUrl: String = null
  ): MongoBinaryDownload = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], checkMD5 = checkMD5.asInstanceOf[js.Any], dlProgress = dlProgress.asInstanceOf[js.Any], download = js.Any.fromFunction1(download), downloadDir = downloadDir.asInstanceOf[js.Any], extract = js.Any.fromFunction1(extract), getMongodPath = js.Any.fromFunction0(getMongodPath), httpDownload = js.Any.fromFunction3(httpDownload), locationExists = js.Any.fromFunction1(locationExists), makeMD5check = js.Any.fromFunction2(makeMD5check), platform = platform.asInstanceOf[js.Any], printDownloadProgress = js.Any.fromFunction1(printDownloadProgress), startDownload = js.Any.fromFunction0(startDownload), version = version.asInstanceOf[js.Any])
    if (_downloadingUrl != null) __obj.updateDynamic("_downloadingUrl")(_downloadingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownload]
  }
}

