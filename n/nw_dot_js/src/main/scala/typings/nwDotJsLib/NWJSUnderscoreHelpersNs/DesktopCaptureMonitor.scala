package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This API behaves similar functions as Screen.chooseDesktopMedia. But it doesn"t have GUI.
  */
@js.native
trait DesktopCaptureMonitor extends EventEmitter {
  /**
    * Boolean of whether the DesktopCaptureMonitor is started.
    */
  var started: scala.Boolean = js.native
  /**
    * Emit when a new source was added.
    *
    * @param event {string} Event name
    * @param listener {Function(id?,name?,order?,type?,primary?)} The callback that handles the `added` event.
    * - (optional) id {string} Is the media id.
    * - (optional) name {string} Is the title of the window or screen.
    * - (optional) order {number} Is the z-order of the windows, if screens are selected they will appear first.
    * - (optional) type {string} Type of the stream: "screen", "window", "other" or "unknown".
    * - (optional) primary {boolean} This will be true if the source is the primary monitor. (Windows OS only)
    */
  @JSName("on")
  def on_added(
    event: nwDotJsLib.nwDotJsLibStrings.added,
    listener: js.Function5[
      /* id */ js.UndefOr[java.lang.String], 
      /* name */ js.UndefOr[java.lang.String], 
      /* order */ js.UndefOr[scala.Double], 
      /* type */ js.UndefOr[java.lang.String], 
      /* primary */ js.UndefOr[scala.Boolean], 
      _
    ]
  ): this.type = js.native
  /**
    * Emit when the name of the source has changed. This can happen when a window changes title.
    *
    * @param event {string} Event name
    * @param listener {Function(id?,new_order?,old_order?)} The callback that handles the `namechanged ` event.
    * - (optional) id {string} Is the media id of the screen or window that has a name changed.
    * - (optional) name {string} Is the new name of the screen or window.
    */
  @JSName("on")
  def on_namechanged(
    event: nwDotJsLib.nwDotJsLibStrings.namechanged,
    listener: js.Function2[/* id */ js.UndefOr[java.lang.String], /* name */ js.UndefOr[java.lang.String], _]
  ): this.type = js.native
  /**
    * Emit when the Z-order of a source changed (this may change for windows as others are focused).
    *
    * @param event {string} Event name
    * @param listener {Function(id?,new_order?,old_order?)} The callback that handles the `orderchanged` event.
    * - (optional) id {string} Is the media id of the screen or window that has changed z-order.
    * - (optional) new_order {number} Is the new z-order.
    * - (optional) old_order {number} Is the old z-order.
    */
  @JSName("on")
  def on_orderchanged(
    event: nwDotJsLib.nwDotJsLibStrings.orderchanged,
    listener: js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* new_order */ js.UndefOr[scala.Double], 
      /* old_order */ js.UndefOr[scala.Double], 
      _
    ]
  ): this.type = js.native
  /**
    * Emit when a source was removed.
    *
    * @param event {string} Event name
    * @param listener {Function(order?)} The callback that handles the `remove` event.
    * - (optional) order {number} Is the order of the media source that is no longer capturable.
    */
  @JSName("on")
  def on_removed(
    event: nwDotJsLib.nwDotJsLibStrings.removed,
    listener: js.Function1[/* order */ js.UndefOr[scala.Double], _]
  ): this.type = js.native
  /**
    * Emit when the thumbnail of a source changed.
    *
    * @param event {string} Event name
    * @param listener {Function(id?,new_order?,old_order?)} The callback that handles the `thumbnailchanged ` event.
    * - (optional) id {string} Is the media id of the screen or window that has an updated thumbnail.
    * - (optional) name {string} Is the base64 encoded png of the thumbnail.
    */
  @JSName("on")
  def on_thumbnailchanged(
    event: nwDotJsLib.nwDotJsLibStrings.thumbnailchanged,
    listener: js.Function2[
      /* id */ js.UndefOr[java.lang.String], 
      /* thumbnail */ js.UndefOr[java.lang.String], 
      _
    ]
  ): this.type = js.native
  /**
    * Register and return a valid stream id passed into chromeMediaSourceId in getUserMedia constraints.
    *
    * @param id {string} valid stream id.
    */
  def registerStream(id: java.lang.String): scala.Unit = js.native
  /**
    * The DesktopCaptureMonitor will start monitoring the system and trigger the the events.
    *
    * @param should_include_screens {boolean} Whether should include screens
    * @param should_include_windows {boolean} Whether should include windows
    */
  def start(should_include_screens: scala.Boolean, should_include_windows: scala.Boolean): scala.Unit = js.native
  /**
    * The DesktopCaptureMonitor will stop monitoring the system.
    */
  def stop(): scala.Unit = js.native
}

