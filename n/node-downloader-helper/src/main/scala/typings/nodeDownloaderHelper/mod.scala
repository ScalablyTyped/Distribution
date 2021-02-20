package typings.nodeDownloaderHelper

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.streamMod.Readable
import typings.nodeDownloaderHelper.anon.Delay
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.download
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.end
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.error
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.pause
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.progress
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.renamed
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.resume
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.retry
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.start
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.stateChanged
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.stop
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait DH_STATES extends StObject
  @JSImport("node-downloader-helper", "DH_STATES")
  @js.native
  object DH_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DH_STATES with String] = js.native
    
    @js.native
    sealed trait DOWNLOADING extends DH_STATES
    /* "DOWNLOADING" */ val DOWNLOADING: typings.nodeDownloaderHelper.mod.DH_STATES.DOWNLOADING with String = js.native
    
    @js.native
    sealed trait FAILED extends DH_STATES
    /* "FAILED" */ val FAILED: typings.nodeDownloaderHelper.mod.DH_STATES.FAILED with String = js.native
    
    @js.native
    sealed trait FINISHED extends DH_STATES
    /* "FINISHED" */ val FINISHED: typings.nodeDownloaderHelper.mod.DH_STATES.FINISHED with String = js.native
    
    @js.native
    sealed trait IDLE extends DH_STATES
    /* "IDLE" */ val IDLE: typings.nodeDownloaderHelper.mod.DH_STATES.IDLE with String = js.native
    
    @js.native
    sealed trait PAUSED extends DH_STATES
    /* "PAUSED" */ val PAUSED: typings.nodeDownloaderHelper.mod.DH_STATES.PAUSED with String = js.native
    
    @js.native
    sealed trait RESUMED extends DH_STATES
    /* "RESUMED" */ val RESUMED: typings.nodeDownloaderHelper.mod.DH_STATES.RESUMED with String = js.native
    
    @js.native
    sealed trait STARTED extends DH_STATES
    /* "STARTED" */ val STARTED: typings.nodeDownloaderHelper.mod.DH_STATES.STARTED with String = js.native
    
    @js.native
    sealed trait STOPPED extends DH_STATES
    /* "STOPPED" */ val STOPPED: typings.nodeDownloaderHelper.mod.DH_STATES.STOPPED with String = js.native
  }
  
  @JSImport("node-downloader-helper", "DownloaderHelper")
  @js.native
  class DownloaderHelper protected () extends EventEmitter {
    def this(url: String, destFolder: String) = this()
    def this(url: String, destFolder: String, options: Options) = this()
    
    // Unpipe an stream , if a stream is not specified, then all pipes are detached.
    def getDownloadPath(): String = js.native
    
    // updates the options, can be use on pause/resume events
    def getStats(): Stats = js.native
    
    // gets the full path where the file will be downloaded (available after the start phase)
    def isResumable(): Boolean = js.native
    
    def on(event: String, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_download(event: download, callback: js.Function1[/* downloadInfo */ DownloadInfo, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, callback: js.Function1[/* finalDownloadInfo */ FinalDownloadInfo, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* error */ DownloaderError, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, callback: js.Function1[/* stats */ Stats, Unit]): this.type = js.native
    @JSName("on")
    def on_renamed(event: renamed, callback: js.Function1[/* filePaths */ FilePaths, Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, callback: js.Function1[/* isResume */ Boolean, Unit]): this.type = js.native
    @JSName("on")
    def on_retry(event: retry, callback: js.Function2[/* attempt */ Double, /* retryOpts */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_stateChanged(event: stateChanged, callback: js.Function1[/* state */ DH_STATES, Unit]): this.type = js.native
    @JSName("on")
    def on_stop(event: stop, callback: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_timeout(event: timeout, callback: js.Function0[Unit]): this.type = js.native
    
    def pause(): js.Promise[Boolean] = js.native
    
    def pipe(readableStream: Readable): Readable = js.native
    def pipe(readableStream: Readable, options: js.Any): Readable = js.native
    
    def resume(): js.Promise[Boolean] = js.native
    
    def start(): js.Promise[Boolean] = js.native
    
    def stop(): js.Promise[Boolean] = js.native
    
    // Add pipes to the pipe list that will be applied later when the download starts
    def unpipe(): Unit = js.native
    def unpipe(readableStream: Readable): Unit = js.native
    
    // return tru/false if the download can be resumable (available after the start phase)
    def updateOptions(options: Options): Unit = js.native
  }
  
  @js.native
  trait DownloadInfo extends StObject {
    
    // if the download is a resume,
    var downloadedSize: Double = js.native
    
    // total file size got from the server
    var fileName: String = js.native
    
    // assigned name
    var filePath: String = js.native
    
    // download path
    var isResumed: Boolean = js.native
    
    var totalSize: Double = js.native
  }
  object DownloadInfo {
    
    @scala.inline
    def apply(downloadedSize: Double, fileName: String, filePath: String, isResumed: Boolean, totalSize: Double): DownloadInfo = {
      val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], isResumed = isResumed.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadInfo]
    }
    
    @scala.inline
    implicit class DownloadInfoMutableBuilder[Self <: DownloadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadedSize(value: Double): Self = StObject.set(x, "downloadedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResumed(value: Boolean): Self = StObject.set(x, "isResumed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DownloaderError extends StObject {
    
    // Http status response if available
    var body: js.UndefOr[String] = js.native
    
    var message: String = js.native
    
    // Error message
    var status: js.UndefOr[Double] = js.native
  }
  object DownloaderError {
    
    @scala.inline
    def apply(message: String): DownloaderError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloaderError]
    }
    
    @scala.inline
    implicit class DownloaderErrorMutableBuilder[Self <: DownloaderError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait FilePaths extends StObject {
    
    // modified path name
    var fileName: String = js.native
    
    var path: String = js.native
    
    // original path name
    var prevFileName: String = js.native
    
    // modified file name
    var prevPath: String = js.native
  }
  object FilePaths {
    
    @scala.inline
    def apply(fileName: String, path: String, prevFileName: String, prevPath: String): FilePaths = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], prevFileName = prevFileName.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePaths]
    }
    
    @scala.inline
    implicit class FilePathsMutableBuilder[Self <: FilePaths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevFileName(value: String): Self = StObject.set(x, "prevFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevPath(value: String): Self = StObject.set(x, "prevPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FinalDownloadInfo extends StObject {
    
    // total size of file on the disk
    var downloadedSize: Double = js.native
    
    var fileName: String = js.native
    
    // assigned name
    var filePath: String = js.native
    
    // total file size got from the server
    var onDiskSize: Double = js.native
    
    // download path
    var totalSize: Double = js.native
  }
  object FinalDownloadInfo {
    
    @scala.inline
    def apply(downloadedSize: Double, fileName: String, filePath: String, onDiskSize: Double, totalSize: Double): FinalDownloadInfo = {
      val __obj = js.Dynamic.literal(downloadedSize = downloadedSize.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], onDiskSize = onDiskSize.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalDownloadInfo]
    }
    
    @scala.inline
    implicit class FinalDownloadInfoMutableBuilder[Self <: FinalDownloadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadedSize(value: Double): Self = StObject.set(x, "downloadedSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDiskSize(value: Double): Self = StObject.set(x, "onDiskSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    // Custom HTTP Header ex: Authorization, User-Agent
    var fileName: js.UndefOr[String] = js.native
    
    // Custom filename when saved
    var forceResume: js.UndefOr[Boolean] = js.native
    
    // Request Method Verb
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    // if true it will override the file, otherwise will append '(number)' to the end of file
    var httpRequestOptions: js.UndefOr[RequestOptions] = js.native
    
    // Override the http request options
    var httpsRequestOptions: js.UndefOr[typings.node.httpsMod.RequestOptions] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    // If the server does not return the "accept-ranges" header, can be force if it does support it
    var `override`: js.UndefOr[Boolean] = js.native
    
    // remove the file when is stopped (default:true)
    var removeOnFail: js.UndefOr[Boolean] = js.native
    
    // { maxRetries: number, delay: number in ms } or false to disable (default)
    var removeOnStop: js.UndefOr[Boolean] = js.native
    
    // Override the https request options, ex: to add SSL Certs
    var retry: js.UndefOr[Delay] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setForceResume(value: Boolean): Self = StObject.set(x, "forceResume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceResumeUndefined: Self = StObject.set(x, "forceResume", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpRequestOptions(value: RequestOptions): Self = StObject.set(x, "httpRequestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpRequestOptionsUndefined: Self = StObject.set(x, "httpRequestOptions", js.undefined)
      
      @scala.inline
      def setHttpsRequestOptions(value: typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "httpsRequestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsRequestOptionsUndefined: Self = StObject.set(x, "httpsRequestOptions", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setRemoveOnFail(value: Boolean): Self = StObject.set(x, "removeOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnFailUndefined: Self = StObject.set(x, "removeOnFail", js.undefined)
      
      @scala.inline
      def setRemoveOnStop(value: Boolean): Self = StObject.set(x, "removeOnStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnStopUndefined: Self = StObject.set(x, "removeOnStop", js.undefined)
      
      @scala.inline
      def setRetry(value: Delay): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    // name of file
    var downloaded: Double = js.native
    
    // total size that needs to be downloaded in bytes
    var name: String = js.native
    
    // downloaded size in bytes
    var progress: Double = js.native
    
    // progress porcentage 0-100%
    var speed: Double = js.native
    
    var total: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(downloaded: Double, name: String, progress: Double, speed: Double, total: Double): Stats = {
      val __obj = js.Dynamic.literal(downloaded = downloaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloaded(value: Double): Self = StObject.set(x, "downloaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
