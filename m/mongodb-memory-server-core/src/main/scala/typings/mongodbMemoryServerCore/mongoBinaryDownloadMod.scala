package typings.mongodbMemoryServerCore

import typings.mongodbMemoryServerCore.anon.Length
import typings.mongodbMemoryServerCore.anon.RequiredMongoBinaryOpts
import typings.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typings.node.httpsMod.RequestOptions
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mongoBinaryDownloadMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownload", JSImport.Default)
  @js.native
  open class default protected () extends MongoBinaryDownload {
    def this(opts: MongoBinaryOpts) = this()
  }
  
  @JSImport("mongodb-memory-server-core/lib/util/MongoBinaryDownload", "MongoBinaryDownload")
  @js.native
  open class MongoBinaryDownload protected () extends StObject {
    def this(opts: MongoBinaryOpts) = this()
    
    var _downloadingUrl: js.UndefOr[String] = js.native
    
    def arch: String = js.native
    def arch_=(`val`: String): Unit = js.native
    
    /**
      * Helper function to de-duplicate assigning "_downloadingUrl"
      */
    def assignDownloadingURL(url: URL_): String = js.native
    
    /**These options are kind of raw, they are not run through DryMongoBinary.generateOptions */
    var binaryOpts: RequiredMongoBinaryOpts = js.native
    
    def checkMD5: Boolean = js.native
    def checkMD5_=(`val`: Boolean): Unit = js.native
    
    var dlProgress: MongoBinaryDownloadProgress = js.native
    
    /**
      * Download file from downloadUrl
      * @param downloadUrl URL to download a File
      * @returns The Path to the downloaded archive file
      */
    def download(downloadUrl: String): js.Promise[String] = js.native
    
    def downloadDir: String = js.native
    def downloadDir_=(`val`: String): Unit = js.native
    
    /**
      * Extract given Archive
      * @param mongoDBArchive Archive location
      * @returns extracted directory location
      */
    def extract(mongoDBArchive: String): js.Promise[String] = js.native
    
    /**
      * Extract a .tar.gz archive
      * @param mongoDBArchive Archive location
      * @param extractPath Directory to extract to
      * @param filter Method to determine which files to extract
      */
    def extractTarGz(mongoDBArchive: String, extractPath: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
    
    /**
      * Extract a .zip archive
      * @param mongoDBArchive Archive location
      * @param extractPath Directory to extract to
      * @param filter Method to determine which files to extract
      */
    def extractZip(mongoDBArchive: String, extractPath: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
    
    /**
      * Get the path of the already downloaded "mongod" file
      * otherwise download it and then return the path
      */
    def getMongodPath(): js.Promise[String] = js.native
    
    /**
      * Get the full path with filename
      * @returns Absoulte Path with FileName
      */
    /* protected */ def getPath(): js.Promise[String] = js.native
    
    /**
      * Downlaod given httpOptions to tempDownloadLocation, then move it to downloadLocation
      * @param httpOptions The httpOptions directly passed to https.get
      * @param downloadLocation The location the File should be after the download
      * @param tempDownloadLocation The location the File should be while downloading
      */
    def httpDownload(url: URL_, httpOptions: RequestOptions, downloadLocation: String, tempDownloadLocation: String): js.Promise[String] = js.native
    
    /**
      * Download MD5 file and check it against the MongoDB Archive
      * @param urlForReferenceMD5 URL to download the MD5
      * @param mongoDBArchive The MongoDB Archive file location
      *
      * @returns {undefined} if "checkMD5" is falsey
      * @returns {true} if the md5 check was successful
      * @throws if the md5 check failed
      */
    def makeMD5check(urlForReferenceMD5: String, mongoDBArchive: String): js.Promise[js.UndefOr[Boolean]] = js.native
    
    def platform: String = js.native
    def platform_=(`val`: String): Unit = js.native
    
    /**
      * Print the Download Progress to STDOUT
      * @param chunk A chunk to get the length
      */
    def printDownloadProgress(chunk: Length): Unit = js.native
    def printDownloadProgress(chunk: Length, forcePrint: Boolean): Unit = js.native
    
    /**
      * Download the MongoDB Archive and check it against an MD5
      * @returns The MongoDB Archive location
      */
    def startDownload(): js.Promise[String] = js.native
    
    def version: String = js.native
    def version_=(`val`: String): Unit = js.native
  }
  
  trait MongoBinaryDownloadProgress extends StObject {
    
    var current: Double
    
    var lastPrintedAt: Double
    
    var length: Double
    
    var totalMb: Double
  }
  object MongoBinaryDownloadProgress {
    
    inline def apply(current: Double, lastPrintedAt: Double, length: Double, totalMb: Double): MongoBinaryDownloadProgress = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], lastPrintedAt = lastPrintedAt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], totalMb = totalMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[MongoBinaryDownloadProgress]
    }
    
    extension [Self <: MongoBinaryDownloadProgress](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setLastPrintedAt(value: Double): Self = StObject.set(x, "lastPrintedAt", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setTotalMb(value: Double): Self = StObject.set(x, "totalMb", value.asInstanceOf[js.Any])
    }
  }
}
