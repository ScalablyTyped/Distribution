package typings.nodeDownloaderHelper.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.nodeDownloaderHelper.anon.Name
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.download
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.end
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.error
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.pause
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.progress
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.progressDotthrottled
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.redirected
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.renamed
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.resume
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.retry
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.skip
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.start
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.stateChanged
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.stop
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.timeout
import typings.nodeDownloaderHelper.nodeDownloaderHelperStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-downloader-helper", "DownloaderHelper")
@js.native
open class DownloaderHelper protected () extends EventEmitter {
  /**
    * Creates an instance of DownloaderHelper.
    * @param {String} url
    * @param {String} destFolder
    * @param {Object} [options={}]
    * @memberof DownloaderHelper
    */
  def this(url: String, destFolder: String) = this()
  def this(url: String, destFolder: String, options: DownloaderHelperOptions) = this()
  
  /**
    * Where the download will be saved
    *
    * @returns {String}
    * @memberof DownloaderHelper
    */
  def getDownloadPath(): String = js.native
  
  def getMetadata(): js.Object | Null = js.native
  
  def getOptions(): js.Object = js.native
  
  /**
    * Get the state required to resume the download after restart. This state
    * can be passed back to `resumeFromFile()` to resume a download
    *
    * @returns {IResumeState} Returns the state required to resume
    * @memberof DownloaderHelper
    */
  def getResumeState(): IResumeState = js.native
  
  /**
    * Current download progress stats
    *
    * @returns {Stats}
    * @memberof DownloaderHelper
    */
  def getStats(): Stats = js.native
  
  /**
    * Gets the total file size from the server
    *
    * @returns {Promise<{name:string, total:number|null}>}
    * @memberof DownloaderHelper
    */
  def getTotalSize(): js.Promise[Name] = js.native
  
  /**
    * Indicates if the download can be resumable (available after the start phase)
    *
    * @returns {Boolean}
    * @memberof DownloaderHelper
    */
  def isResumable(): Boolean = js.native
  
  /**
    * Subscribes to events
    * 
    * @memberof EventEmitter
    */
  def on[E /* <: /* keyof node-downloader-helper.node-downloader-helper.DownloadEvents */ start | skip | download | progress | progressDotthrottled | retry | end | error | timeout | pause | resume | stop | renamed | redirected | stateChanged | warning */](
    event: E,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: node-downloader-helper.node-downloader-helper.DownloadEvents[E] */ js.Any
  ): Any = js.native
  
  /**
    *
    *
    * @returns {Promise<boolean>}
    * @memberof DownloaderHelper
    */
  def pause(): js.Promise[Boolean] = js.native
  
  /**
    * Add pipes to the pipe list that will be applied later when the download starts
    * @url https://nodejs.org/api/stream.html#stream_readable_pipe_destination_options
    * @param {stream.Readable} stream https://nodejs.org/api/stream.html#stream_class_stream_readable
    * @param {Object} [options=null]
    * @returns {stream.Readable}
    * @memberof DownloaderHelper
    */
  def pipe(stream: Readable): Readable = js.native
  def pipe(stream: Readable, options: js.Object): Readable = js.native
  
  /**
    *
    *
    * @returns {Promise<boolean>}
    * @memberof DownloaderHelper
    */
  def resume(): js.Promise[Boolean] = js.native
  
  /**
    * 
    * @param {string} filePath - The path to the file to resume from ex: C:\Users\{user}\Downloads\file.txt
    * @param {IResumeState} state - (optionl) resume download state, if not provided it will try to fetch from the headers and filePath
    *
    * @returns {Promise<boolean>} - Returns the same result as `start()`
    * @memberof DownloaderHelper
    */
  def resumeFromFile(filePath: String): js.Promise[Boolean] = js.native
  def resumeFromFile(filePath: String, state: IResumeState): js.Promise[Boolean] = js.native
  
  /**
    *
    *
    * @returns {Promise<boolean>}
    * @memberof DownloaderHelper
    */
  def start(): js.Promise[Boolean] = js.native
  
  /**
    *
    *
    * @returns {Promise<boolean>}
    * @memberof DownloaderHelper
    */
  def stop(): js.Promise[Boolean] = js.native
  
  /**
    * Unpipe an stream , if a stream is not specified, then all pipes are detached.
    *
    * @url https://nodejs.org/api/stream.html#stream_readable_unpipe_destination
    * @param {stream.Readable} [stream=null]
    * @returns
    * @memberof DownloaderHelper
    */
  def unpipe(): Unit = js.native
  def unpipe(stream: Readable): Unit = js.native
  
  /**
    * Updates the options, can be use on pause/resume events
    *
    * @param {Object} [options={}]
    * @param {String} [url='']
    * @memberof DownloaderHelper
    */
  def updateOptions(): Unit = js.native
  def updateOptions(options: js.Object): Unit = js.native
  def updateOptions(options: js.Object, url: String): Unit = js.native
  def updateOptions(options: Unit, url: String): Unit = js.native
}
