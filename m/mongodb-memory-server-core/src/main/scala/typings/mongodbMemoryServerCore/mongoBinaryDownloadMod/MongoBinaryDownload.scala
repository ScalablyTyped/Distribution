package typings.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typings.mongodbMemoryServerCore.anon.Length
import typings.mongodbMemoryServerCore.typesMod.DownloadProgressT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MongoBinaryDownload extends js.Object {
  
  var _downloadingUrl: js.UndefOr[String] = js.native
  
  var arch: String = js.native
  
  var checkMD5: Boolean = js.native
  
  var dlProgress: DownloadProgressT = js.native
  
  /**
    * Download file from downloadUrl
    * @param downloadUrl URL to download a File
    */
  def download(downloadUrl: String): js.Promise[String] = js.native
  
  var downloadDir: String = js.native
  
  /**
    * Extract given Archive
    * @param mongoDBArchive Archive location
    * @returns extracted directory location
    */
  def extract(mongoDBArchive: String): js.Promise[String] = js.native
  
  /**
    * Extract a .tar.gz archive
    * @param mongoDBArchive Archive location
    * @param extractDir Directory to extract to
    * @param filter Method to determine which files to extract
    */
  def extractTarGz(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
  
  /**
    * Extract a .zip archive
    * @param mongoDBArchive Archive location
    * @param extractDir Directory to extract to
    * @param filter Method to determine which files to extract
    */
  def extractZip(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
  
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
  
  var platform: String = js.native
  
  /**
    * Print the Download Progress to STDOUT
    * @param chunk A chunk to get the length
    */
  def printDownloadProgress(chunk: Length): Unit = js.native
  
  /**
    * Download the MongoDB Archive and check it against an MD5
    * @returns The MongoDB Archive location
    */
  def startDownload(): js.Promise[String] = js.native
  
  var version: String = js.native
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
    extractTarGz: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit],
    extractZip: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit],
    getMongodPath: () => js.Promise[String],
    httpDownload: (HttpDownloadOptions, String, String) => js.Promise[String],
    locationExists: String => js.Promise[Boolean],
    makeMD5check: (String, String) => js.Promise[js.UndefOr[Boolean]],
    platform: String,
    printDownloadProgress: Length => Unit,
    startDownload: () => js.Promise[String],
    version: String
  ): MongoBinaryDownload = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], checkMD5 = checkMD5.asInstanceOf[js.Any], dlProgress = dlProgress.asInstanceOf[js.Any], download = js.Any.fromFunction1(download), downloadDir = downloadDir.asInstanceOf[js.Any], extract = js.Any.fromFunction1(extract), extractTarGz = js.Any.fromFunction3(extractTarGz), extractZip = js.Any.fromFunction3(extractZip), getMongodPath = js.Any.fromFunction0(getMongodPath), httpDownload = js.Any.fromFunction3(httpDownload), locationExists = js.Any.fromFunction1(locationExists), makeMD5check = js.Any.fromFunction2(makeMD5check), platform = platform.asInstanceOf[js.Any], printDownloadProgress = js.Any.fromFunction1(printDownloadProgress), startDownload = js.Any.fromFunction0(startDownload), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownload]
  }
  
  @scala.inline
  implicit class MongoBinaryDownloadOps[Self <: MongoBinaryDownload] (val x: Self) extends AnyVal {
    
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckMD5(value: Boolean): Self = this.set("checkMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlProgress(value: DownloadProgressT): Self = this.set("dlProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload(value: String => js.Promise[String]): Self = this.set("download", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDownloadDir(value: String): Self = this.set("downloadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtract(value: String => js.Promise[String]): Self = this.set("extract", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtractTarGz(value: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit]): Self = this.set("extractTarGz", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExtractZip(value: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit]): Self = this.set("extractZip", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetMongodPath(value: () => js.Promise[String]): Self = this.set("getMongodPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHttpDownload(value: (HttpDownloadOptions, String, String) => js.Promise[String]): Self = this.set("httpDownload", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLocationExists(value: String => js.Promise[Boolean]): Self = this.set("locationExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMakeMD5check(value: (String, String) => js.Promise[js.UndefOr[Boolean]]): Self = this.set("makeMD5check", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintDownloadProgress(value: Length => Unit): Self = this.set("printDownloadProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDownload(value: () => js.Promise[String]): Self = this.set("startDownload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_downloadingUrl(value: String): Self = this.set("_downloadingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_downloadingUrl: Self = this.set("_downloadingUrl", js.undefined)
  }
}
