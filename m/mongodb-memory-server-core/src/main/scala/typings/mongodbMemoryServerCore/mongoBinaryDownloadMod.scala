package typings.mongodbMemoryServerCore

import typings.httpsProxyAgent.mod.HttpsProxyAgent
import typings.mongodbMemoryServerCore.anon.Length
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.GET
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.POST
import typings.mongodbMemoryServerCore.typesMod.DownloadProgressT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoBinaryDownloadMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownload", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with MongoBinaryDownload {
    def this(hasPlatformArchDownloadDirVersionCheckMD5: MongoBinaryDownloadOpts) = this()
    
    /* CompleteClass */
    var arch: String = js.native
    
    /* CompleteClass */
    var checkMD5: Boolean = js.native
    
    /* CompleteClass */
    var dlProgress: DownloadProgressT = js.native
    
    /**
      * Download file from downloadUrl
      * @param downloadUrl URL to download a File
      */
    /* CompleteClass */
    override def download(downloadUrl: String): js.Promise[String] = js.native
    
    /* CompleteClass */
    var downloadDir: String = js.native
    
    /**
      * Extract given Archive
      * @param mongoDBArchive Archive location
      * @returns extracted directory location
      */
    /* CompleteClass */
    override def extract(mongoDBArchive: String): js.Promise[String] = js.native
    
    /**
      * Extract a .tar.gz archive
      * @param mongoDBArchive Archive location
      * @param extractDir Directory to extract to
      * @param filter Method to determine which files to extract
      */
    /* CompleteClass */
    override def extractTarGz(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
    
    /**
      * Extract a .zip archive
      * @param mongoDBArchive Archive location
      * @param extractDir Directory to extract to
      * @param filter Method to determine which files to extract
      */
    /* CompleteClass */
    override def extractZip(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
    
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
    
    /* CompleteClass */
    var platform: String = js.native
    
    /**
      * Print the Download Progress to STDOUT
      * @param chunk A chunk to get the length
      */
    /* CompleteClass */
    override def printDownloadProgress(chunk: Length): Unit = js.native
    
    /**
      * Download the MongoDB Archive and check it against an MD5
      * @returns The MongoDB Archive location
      */
    /* CompleteClass */
    override def startDownload(): js.Promise[String] = js.native
    
    /* CompleteClass */
    var version: String = js.native
  }
  
  trait HttpDownloadOptions extends StObject {
    
    var agent: js.UndefOr[HttpsProxyAgent] = js.undefined
    
    var hostname: String
    
    var method: GET | POST
    
    var path: String
    
    var port: String
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  object HttpDownloadOptions {
    
    @scala.inline
    def apply(hostname: String, method: GET | POST, path: String, port: String): HttpDownloadOptions = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpDownloadOptions]
    }
    
    @scala.inline
    implicit class HttpDownloadOptionsMutableBuilder[Self <: HttpDownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: HttpsProxyAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    }
  }
  
  trait MongoBinaryDownload extends StObject {
    
    var _downloadingUrl: js.UndefOr[String] = js.undefined
    
    var arch: String
    
    var checkMD5: Boolean
    
    var dlProgress: DownloadProgressT
    
    /**
      * Download file from downloadUrl
      * @param downloadUrl URL to download a File
      */
    def download(downloadUrl: String): js.Promise[String]
    
    var downloadDir: String
    
    /**
      * Extract given Archive
      * @param mongoDBArchive Archive location
      * @returns extracted directory location
      */
    def extract(mongoDBArchive: String): js.Promise[String]
    
    /**
      * Extract a .tar.gz archive
      * @param mongoDBArchive Archive location
      * @param extractDir Directory to extract to
      * @param filter Method to determine which files to extract
      */
    def extractTarGz(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit]
    
    /**
      * Extract a .zip archive
      * @param mongoDBArchive Archive location
      * @param extractDir Directory to extract to
      * @param filter Method to determine which files to extract
      */
    def extractZip(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit]
    
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
    
    var platform: String
    
    /**
      * Print the Download Progress to STDOUT
      * @param chunk A chunk to get the length
      */
    def printDownloadProgress(chunk: Length): Unit
    
    /**
      * Download the MongoDB Archive and check it against an MD5
      * @returns The MongoDB Archive location
      */
    def startDownload(): js.Promise[String]
    
    var version: String
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
    implicit class MongoBinaryDownloadMutableBuilder[Self <: MongoBinaryDownload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlProgress(value: DownloadProgressT): Self = StObject.set(x, "dlProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload(value: String => js.Promise[String]): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtract(value: String => js.Promise[String]): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExtractTarGz(value: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit]): Self = StObject.set(x, "extractTarGz", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExtractZip(value: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit]): Self = StObject.set(x, "extractZip", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetMongodPath(value: () => js.Promise[String]): Self = StObject.set(x, "getMongodPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHttpDownload(value: (HttpDownloadOptions, String, String) => js.Promise[String]): Self = StObject.set(x, "httpDownload", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLocationExists(value: String => js.Promise[Boolean]): Self = StObject.set(x, "locationExists", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMakeMD5check(value: (String, String) => js.Promise[js.UndefOr[Boolean]]): Self = StObject.set(x, "makeMD5check", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintDownloadProgress(value: Length => Unit): Self = StObject.set(x, "printDownloadProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartDownload(value: () => js.Promise[String]): Self = StObject.set(x, "startDownload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_downloadingUrl(value: String): Self = StObject.set(x, "_downloadingUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_downloadingUrlUndefined: Self = StObject.set(x, "_downloadingUrl", js.undefined)
    }
  }
  
  trait MongoBinaryDownloadOpts extends StObject {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var checkMD5: js.UndefOr[Boolean] = js.undefined
    
    var downloadDir: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object MongoBinaryDownloadOpts {
    
    @scala.inline
    def apply(): MongoBinaryDownloadOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MongoBinaryDownloadOpts]
    }
    
    @scala.inline
    implicit class MongoBinaryDownloadOptsMutableBuilder[Self <: MongoBinaryDownloadOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setCheckMD5(value: Boolean): Self = StObject.set(x, "checkMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckMD5Undefined: Self = StObject.set(x, "checkMD5", js.undefined)
      
      @scala.inline
      def setDownloadDir(value: String): Self = StObject.set(x, "downloadDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadDirUndefined: Self = StObject.set(x, "downloadDir", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
