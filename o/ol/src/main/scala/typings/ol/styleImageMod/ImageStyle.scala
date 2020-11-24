package typings.ol.styleImageMod

import typings.ol.imageStateMod.ImageState
import typings.ol.sizeMod.Size
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageStyle extends js.Object {
  
  /**
    * Get the anchor point in pixels. The anchor determines the center point for the
    * symbolizer.
    */
  def getAnchor(): js.Array[Double] = js.native
  
  /**
    * Get the displacement of the shape
    */
  def getDisplacement(): js.Array[Double] = js.native
  
  def getHitDetectionImage(): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  
  def getHitDetectionImageSize(): Size = js.native
  
  /**
    * Get the image element for the symbolizer.
    */
  def getImage(pixelRatio: Double): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  
  def getImageSize(): Size = js.native
  
  def getImageState(): ImageState = js.native
  
  /**
    * Get the symbolizer opacity.
    */
  def getOpacity(): Double = js.native
  
  /**
    * Get the origin of the symbolizer.
    */
  def getOrigin(): js.Array[Double] = js.native
  
  /**
    * Determine whether the symbolizer rotates with the map.
    */
  def getRotateWithView(): Boolean = js.native
  
  /**
    * Get the symoblizer rotation.
    */
  def getRotation(): Double = js.native
  
  /**
    * Get the symbolizer scale.
    */
  def getScale(): Double | Size = js.native
  
  /**
    * Get the symbolizer scale array.
    */
  def getScaleArray(): Size = js.native
  
  /**
    * Get the size of the symbolizer (in pixels).
    */
  def getSize(): Size = js.native
  
  def listenImageChange(listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]): Unit = js.native
  
  /**
    * Load not yet loaded URI.
    */
  def load(): Unit = js.native
  
  /**
    * Set the opacity.
    */
  def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * Set whether to rotate the style with the view.
    */
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
  
  /**
    * Set the rotation.
    */
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * Set the scale.
    */
  def setScale(scale: Double): Unit = js.native
  def setScale(scale: Size): Unit = js.native
  
  def unlistenImageChange(listener: js.Function1[/* p0 */ typings.ol.eventMod.default, Unit]): Unit = js.native
}
