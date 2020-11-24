package typings.nodeDownloaderHelper.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
