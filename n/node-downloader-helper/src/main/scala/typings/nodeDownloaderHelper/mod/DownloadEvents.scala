package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadEvents extends StObject {
  
  /** Emitted when the download starts */
  def download(stats: DownloadInfoStats): Any = js.native
  
  /** Emitted when the downloading has finished */
  def end(stats: DownloadEndedStats): Any = js.native
  
  /** Emitted when there is any error */
  def error(stats: ErrorStats): Any = js.native
  
  /** Emitted when the .pause method is called */
  def pause(): Any = js.native
  
  /**	Emitted every time gets data from the server */
  def progress(stats: Stats): Any = js.native
  
  /** The same as progress but emits every 1 second while is downloading */
  @JSName("progress.throttled")
  def progressDotthrottled(stats: Stats): Any = js.native
  
  /** Emitted when an url redirect happened `callback(newUrl, oldUrl)` NOTE: this will be triggered during getTotalSize() as well */
  def redirected(newUrl: String, oldUrl: String): Any = js.native
  
  /** Emitted when '(number)' is appended to the end of file, this requires override:false opt, callback(filePaths) */
  def renamed(stats: FileRenamedStats): Any = js.native
  
  /** Emitted when the .resume method is called */
  def resume(isResume: Boolean): Any = js.native
  
  /** Emitted when the download fails and retry is enabled */
  def retry(attempt: Any, retryOptions: RetryOptions): Any = js.native
  def retry(attempt: Any, retryOptions: RetryOptions, error: js.Error): Any = js.native
  
  /** Emitted when the download is skipped because the file already exists */
  def skip(stats: BaseStats): Any = js.native
  
  /** Emitted when the .start method is called */
  def start(): Any = js.native
  
  /** Emitted when the state changes */
  def stateChanged(state: DH_STATES): Any = js.native
  
  /** Emitted when the .stop method is called */
  def stop(): Any = js.native
  
  /**	Emitted when the underlying socket times out from inactivity. */
  def timeout(): Any = js.native
  
  /** Emitted when an error occurs that was not thrown intentionally  */
  def warning(error: js.Error): Any = js.native
}
