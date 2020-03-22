package typings.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typings.mongodbMemoryServerCore.typesMod.DownloadProgressT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownload", JSImport.Default)
@js.native
class default protected () extends MongoBinaryDownload {
  def this(hasPlatformArchDownloadDirVersionCheckMD5: MongoBinaryDownloadOpts) = this()
  /* CompleteClass */
  override var arch: String = js.native
  /* CompleteClass */
  override var checkMD5: Boolean = js.native
  /* CompleteClass */
  override var dlProgress: DownloadProgressT = js.native
  /* CompleteClass */
  override var downloadDir: String = js.native
  /* CompleteClass */
  override var platform: String = js.native
  /* CompleteClass */
  override var version: String = js.native
  /**
    * Download file from downloadUrl
    * @param downloadUrl URL to download a File
    */
  /* CompleteClass */
  override def download(downloadUrl: String): js.Promise[String] = js.native
  /**
    * Extract given Archive
    * @param mongoDBArchive Archive location
    * @returns extracted directory location
    */
  /* CompleteClass */
  override def extract(mongoDBArchive: String): js.Promise[String] = js.native
  /**
    * Get the path of the already downloaded "mongod" file
    * otherwise download it and then return the path
    */
  /* CompleteClass */
  override def getMongodPath(): js.Promise[String] = js.native
  /**
    * Downlaod given httpOptions to tempDownloadLocation, then move it to downloadLocation
    * @param httpOptions The httpOptions directly passed to https.get
    * @param downloadLocation The location the File should be after the download
    * @param tempDownloadLocation The location the File should be while downloading
    */
  /* CompleteClass */
  override def httpDownload(httpOptions: HttpDownloadOptions, downloadLocation: String, tempDownloadLocation: String): js.Promise[String] = js.native
  /**
    * Test if the location given is already used
    * Does *not* dereference links
    * @param location The Path to test
    */
  /* CompleteClass */
  override def locationExists(location: String): js.Promise[Boolean] = js.native
  /**
    * Download MD5 file and check it against the MongoDB Archive
    * @param urlForReferenceMD5 URL to download the MD5
    * @param mongoDBArchive The MongoDB Archive file location
    */
  /* CompleteClass */
  override def makeMD5check(urlForReferenceMD5: String, mongoDBArchive: String): js.Promise[js.UndefOr[Boolean]] = js.native
  /**
    * Print the Download Progress to STDOUT
    * @param chunk A chunk to get the length
    */
  /* CompleteClass */
  override def printDownloadProgress(chunk: js.Any): Unit = js.native
  /**
    * Download the MongoDB Archive and check it against an MD5
    * @returns The MongoDB Archive location
    */
  /* CompleteClass */
  override def startDownload(): js.Promise[String] = js.native
}

