package typings
package nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-downloader-helper", "DownloaderHelper")
@js.native
class DownloaderHelper protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(url: java.lang.String, destFolder: java.lang.String) = this()
  def this(url: java.lang.String, destFolder: java.lang.String, options: Options) = this()
  def on(event: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_download(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.download,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_end(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.end,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.error,
    callback: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pause(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.pause,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.progress,
    callback: js.Function1[/* stats */ Stats, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_resume(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.resume,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_start(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.start,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stateChanged(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.stateChanged,
    callback: js.Function1[/* state */ DH_STATES, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_stop(
    event: nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperLibStrings.stop,
    callback: js.Function0[scala.Unit]
  ): this.type = js.native
  def pause(): js.Promise[scala.Boolean] = js.native
  def resume(): js.Promise[scala.Boolean] = js.native
  def start(): js.Promise[scala.Boolean] = js.native
  def stop(): js.Promise[scala.Boolean] = js.native
}

