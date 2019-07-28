package typings.phaser.PhaserNs.TypesNs.RendererNs.SnapshotNs

import typings.phaser.PhaserNs.DisplayNs.Color
import typings.phaser.integer
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotState extends js.Object {
  /**
    * The function to call after the snapshot is taken.
    */
  @JSName("callback")
  var callback_Original: SnapshotCallback = js.native
  /**
    * The image quality, between 0 and 1. Used for image formats with lossy compression, such as `image/jpeg`.
    */
  var encoderOptions: js.UndefOr[Double] = js.native
  /**
    * Is this a snapshot to get a single pixel, or an area?
    */
  var getPixel: js.UndefOr[Boolean] = js.native
  /**
    * The height of the snapshot.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * The format of the image to create, usually `image/png` or `image/jpeg`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The width of the snapshot.
    */
  var width: js.UndefOr[integer] = js.native
  /**
    * The x coordinate to start the snapshot from.
    */
  var x: js.UndefOr[integer] = js.native
  /**
    * The y coordinate to start the snapshot from.
    */
  var y: js.UndefOr[integer] = js.native
  /**
    * The function to call after the snapshot is taken.
    */
  def callback(snapshot: Color): Unit = js.native
  def callback(snapshot: HTMLImageElement): Unit = js.native
}

