package typings
package photoswipeLib.photoswipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
  */
@js.native
trait PhotoSwipe[T /* <: photoswipeLib.photoswipeMod.PhotoSwipeNs.Options */] extends js.Object {
  /**
    * The background element (with class .pswp__bg).
    */
  var bg: stdLib.HTMLElement = js.native
  /**
    * The container element (with class .pswp__container).
    */
  var container: stdLib.HTMLElement = js.native
  /**
    * Current slide object.
    */
  var currItem: photoswipeLib.photoswipeMod.PhotoSwipeNs.Item = js.native
  /**
    * The Framework. Holds utility methods.
    */
  var framework: photoswipeLib.photoswipeMod.PhotoSwipeNs.UIFramework = js.native
  /**
    * Items in this gallery. PhotoSwipe will (almost) dynamically respond to changes in this array.
    * To add, edit, or remove slides after PhotoSwipe is opened, you just need to modify the items array.
    *
    * For example, you can push new slide objects into the items array:
    *
    * pswp.items.push({
    *     src: "path/to/image.jpg",
    *     w:1200,
    *     h:500
    * });
    *
    * If you changed slide that is CURRENT, NEXT or PREVIOUS (which you should try to avoid) – you need to call method that will update their content:
    *
    * // sets a flag that slides should be updated
    * pswp.invalidateCurrItems();
    * // updates the content of slides
    * pswp.updateSize(true);
    *
    * If you're using the DefaultUI, call pswp.ui.update() to update that as well. Also note:
    *
    * (1) You can't reassign whole array, you can only modify it (e.g. use splice to remove elements).
    * (2) If you're going to remove current slide – call goTo method before.
    * (3) There must be at least one slide.
    * (4) This technique is used to serve responsive images.
    */
  var items: js.Array[photoswipeLib.photoswipeMod.PhotoSwipeNs.Item] = js.native
  /**
    * Options for this PhotoSwipe. This object is a copy of the options parameter passed into the constructor.
    * Some properties in options are dynamically modifiable.
    */
  var options: T = js.native
  /**
    * The ui instance constructed by PhotoSwipe.
    */
  var ui: photoswipeLib.photoswipeMod.PhotoSwipeNs.UI[T] = js.native
  /**
    * Size of the current viewport.
    */
  var viewportSize: photoswipeLib.Anon_X = js.native
  /**
    * Apply zoom and pan to the current slide
    *
    * @param   {number} `zoomLevel`
    * @param   {int}    `panX`
    * @param   {int}    `panY`
    *
    * For example: `pswp.applyZoomPan(1, 0, 0)`
    * will zoom current image to the original size
    * and will place it on top left corner.
    *
    */
  def applyZoomPan(zoomLevel: scala.Double, panX: scala.Double, panY: scala.Double): scala.Unit = js.native
  /**
    * Close gallery. Calls destroy() after closing.
    */
  def close(): scala.Unit = js.native
  /**
    * Destroy gallery (unbind listeners, free memory). Automatically called after close().
    */
  def destroy(): scala.Unit = js.native
  /**
    * Current item index.
    */
  def getCurrentIndex(): scala.Double = js.native
  /**
    * Current zoom level.
    */
  def getZoomLevel(): scala.Double = js.native
  /**
    * Go to slide by index.
    */
  def goTo(index: scala.Double): scala.Unit = js.native
  /**
    * Initialize and open gallery (you can bind events before this method).
    */
  def init(): scala.Unit = js.native
  /**
    * Call this method after dynamically modifying the current, next, or previous slide in the items array.
    */
  def invalidateCurrItems(): scala.Unit = js.native
  /**
    * Whether one (or more) pointer is used.
    */
  def isDragging(): scala.Boolean = js.native
  /**
    * true wehn transition between is running (after swipe).
    */
  def isMainScrollAnimating(): scala.Boolean = js.native
  /**
    * Whether two (or more) pointers are used.
    */
  def isZooming(): scala.Boolean = js.native
  /**
    * PhotoSwipe uses very simple Event/Messaging system.
    * It has two methods shout (triggers event) and listen (handles event).
    * For now there is no method to unbind listener, but all of them are cleared when PhotoSwipe is closed.
    */
  def listen(eventName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Called after slides change (after content has changed).
    */
  @JSName("listen")
  def listen_afterChange(eventName: photoswipeLib.photoswipeLibStrings.afterChange, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Called before slides change (before the content is changed ,but after navigation). Update UI here.
    */
  @JSName("listen")
  def listen_beforeChange(eventName: photoswipeLib.photoswipeLibStrings.beforeChange, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Called when the gallery starts closing.
    */
  @JSName("listen")
  def listen_close(eventName: photoswipeLib.photoswipeLibStrings.close, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Called after the gallery is closed and the closing animation finishes.
    * Clean up your stuff here.
    */
  @JSName("listen")
  def listen_destroy(eventName: photoswipeLib.photoswipeLibStrings.destroy, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Triggers when PhotoSwipe reads slide object data, which happens before content is set, or before lazy-loading is initiated.
    * Use it to dynamically change properties of the slide object.
    */
  @JSName("listen")
  def listen_gettingData(
    eventName: photoswipeLib.photoswipeLibStrings.gettingData,
    callback: js.Function2[
      /* index */ scala.Double, 
      /* item */ photoswipeLib.photoswipeMod.PhotoSwipeNs.Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Called when an image is loaded.
    */
  @JSName("listen")
  def listen_imageLoadComplete(
    eventName: photoswipeLib.photoswipeLibStrings.imageLoadComplete,
    callback: js.Function2[
      /* index */ scala.Double, 
      /* item */ photoswipeLib.photoswipeMod.PhotoSwipeNs.Item, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Called when opening zoom in animation starting.
    */
  @JSName("listen")
  def listen_initialZoomIn(eventName: photoswipeLib.photoswipeLibStrings.initialZoomIn, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Called when opening zoom in animation finished.
    */
  @JSName("listen")
  def listen_initialZoomInEnd(eventName: photoswipeLib.photoswipeLibStrings.initialZoomInEnd, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Called when closing zoom out animation started.
    */
  @JSName("listen")
  def listen_initialZoomOut(eventName: photoswipeLib.photoswipeLibStrings.initialZoomOut, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Called when closing zoom out animation finished.
    */
  @JSName("listen")
  def listen_initialZoomOutEnd(
    eventName: photoswipeLib.photoswipeLibStrings.initialZoomOutEnd,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Called when mouse is first used (triggers only once).
    */
  @JSName("listen")
  def listen_mouseUsed(eventName: photoswipeLib.photoswipeLibStrings.mouseUsed, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Allows overriding vertical margin for individual items.
    *
    * Example:
    *
    * pswp.listen('parseVerticalMargin', function(item) {
    *     var gap = item.vGap;
    *
    *     gap.top = 50; // There will be 50px gap from top of viewport
    *     gap.bottom = 100; // and 100px gap from the bottom
    * });
    */
  @JSName("listen")
  def listen_parseVerticalMargin(
    eventName: photoswipeLib.photoswipeLibStrings.parseVerticalMargin,
    callback: js.Function1[/* item */ photoswipeLib.photoswipeMod.PhotoSwipeNs.Item, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Allow to call preventDefault on down and up events.
    */
  @JSName("listen")
  def listen_preventDragEvent(
    eventName: photoswipeLib.photoswipeLibStrings.preventDragEvent,
    callback: js.Function3[
      /* e */ stdLib.MouseEvent, 
      /* isDown */ scala.Boolean, 
      /* preventObj */ photoswipeLib.Anon_Prevent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Called when the viewport size changes.
    */
  @JSName("listen")
  def listen_resize(eventName: photoswipeLib.photoswipeLibStrings.resize, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Gallery unbinds events (triggers before closing animation).
    */
  @JSName("listen")
  def listen_unbindEvents(eventName: photoswipeLib.photoswipeLibStrings.unbindEvents, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Go to the next slide.
    */
  def next(): scala.Unit = js.native
  /**
    * Go to the previous slide.
    */
  def prev(): scala.Unit = js.native
  /**
    * Triggers eventName event with args passed through to listeners.
    */
  def shout(eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
    * Update gallery size
    * @param  {boolean} `force` If you set it to `true`, size of the gallery will be updated even if viewport size hasn't changed.
    */
  def updateSize(force: scala.Boolean): scala.Unit = js.native
  /**
    * Zoom in/out the current slide to a specified zoom level, optionally with animation.
    *
    * @param  {number}   `destZoomLevel` Destination scale number. Set to 1 for unzoomed.
    *                                    Use `pswp.currItem.fitRatio - image` to zoom the image to perfectly fit into the viewport.
    * @param  {object}   `centerPoint`   The center of the zoom, relative to viewport.
    * @param  {number}   `speed`         Animation duration in milliseconds. Can be 0.
    * @param  {function} `easingFn`      Easing function (optional). Set to false to use default easing.
    *                                    This method is passed in the percentage that the animation is finished (from 0 to 1) and should return an eased value (which should be 0 at the start and 1 at the end).
    * @param  {function} `updateFn`      Function will be called on each update frame (optional).
    *                                    This method is passed the eased zoom level.
    *
    * Example below will 2x zoom to center of slide:
    *
    * pswp.zoomTo(2, {x:pswp.viewportSize.x/2,y:pswp.viewportSize.y/2}, 2000, false, function(now) {});
    *
    */
  def zoomTo(destZoomLevel: scala.Double, centerPoint: photoswipeLib.Anon_X, speed: scala.Double): scala.Unit = js.native
  def zoomTo(
    destZoomLevel: scala.Double,
    centerPoint: photoswipeLib.Anon_X,
    speed: scala.Double,
    easingFn: js.Function1[/* k */ scala.Double, scala.Double]
  ): scala.Unit = js.native
  def zoomTo(
    destZoomLevel: scala.Double,
    centerPoint: photoswipeLib.Anon_X,
    speed: scala.Double,
    easingFn: js.Function1[/* k */ scala.Double, scala.Double],
    updateFn: js.Function1[/* now */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
}

