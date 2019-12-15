package typings.paper.paper

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Raster item represents an image in a Paper.js project.
  */
@JSGlobal("paper.Raster")
@js.native
/** 
  * Creates a new raster item from the passed argument, and places it in the
  * active layer. `source` can either be a DOM Image, a Canvas, or a string
  * describing the URL to load the image from, or the ID of a DOM element to
  * get the image from (either a DOM Image or a Canvas).
  * 
  * @param source - the source of
  *     the raster
  * @param position - the center position at which the raster item is
  *     placed
  */
class Raster () extends Item {
  /** 
    * Creates a new empty raster of the given size, and places it in the
    * active layer.
    * 
    * @param size - the size of the raster
    * @param position - the center position at which the raster item is
    *     placed
    */
  def this(size: Size) = this()
  def this(source: String) = this()
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(size: Size, position: Point) = this()
  def this(source: String, position: Point) = this()
  def this(source: HTMLCanvasElement, position: Point) = this()
  def this(source: HTMLImageElement, position: Point) = this()
  /** 
    * The Canvas object of the raster. If the raster was created from an image,
    * accessing its canvas causes the raster to try and create one and draw the
    * image into it. Depending on security policies, this might fail, in which
    * case `null` is returned instead.
    */
  var canvas: HTMLCanvasElement = js.native
  /** 
    * The Canvas 2D drawing context of the raster.
    */
  var context: CanvasRenderingContext2D = js.native
  /** 
    * The crossOrigin value to be used when loading the image resource, in
    * order to support CORS. Note that this needs to be set before setting the
    * {@link #source} property in order to always work (e.g. when the image is
    * cached in the browser).
    */
  var crossOrigin: String = js.native
  /** 
    * The height of the raster in pixels.
    */
  var height: Double = js.native
  /** 
    * The HTMLImageElement or Canvas element of the raster, if one is
    * associated.
    * Note that for consistency, a {@link #onLoad} event will be triggered on
    * the raster even if the image has already finished loading before, or if
    * we are setting the raster to a canvas.
    */
  var image: HTMLImageElement | HTMLCanvasElement = js.native
  /** 
    * The loading state of the raster image.
    */
  val loaded: Boolean = js.native
  /** 
    * The event handler function to be called when there is an error loading
    * the underlying image.
    */
  var onError: js.Function | Null = js.native
  /** 
    * The event handler function to be called when the underlying image has
    * finished loading and is ready to be used. This is also triggered when
    * the image is already loaded, or when a canvas is used instead of an
    * image.
    */
  var onLoad: js.Function | Null = js.native
  /** 
    * The resolution of the raster at its current size, in PPI (pixels per
    * inch).
    */
  val resolution: Size = js.native
  /** 
    * The size of the raster in pixels.
    */
  var size: Size = js.native
  /** 
    * Specifies if the raster should be smoothed when scaled up or if the
    * pixels should be scaled up by repeating the nearest neighboring pixels.
    */
  var smoothing: Boolean = js.native
  /** 
    * The source of the raster, which can be set using a DOM Image, a Canvas,
    * a data url, a string describing the URL to load the image from, or the
    * ID of a DOM element to get the image from (either a DOM Image or a
    * Canvas). Reading this property will return the url of the source image or
    * a data-url.
    * Note that for consistency, a {@link #onLoad} event will be triggered on
    * the raster even if the image has already finished loading before.
    */
  var source: HTMLImageElement | HTMLCanvasElement | String = js.native
  /** 
    * The width of the raster in pixels.
    */
  var width: Double = js.native
  /** 
    * Clears the image, if it is backed by a canvas.
    */
  def clear(): Unit = js.native
  def createImageData(size: Size): ImageData = js.native
  def drawImage(image: HTMLCanvasElement, point: Point): Unit = js.native
  /** 
    * Draws an image on the raster.
    * 
    * @param point - the offset of the image as a point in pixel
    * coordinates
    */
  def drawImage(image: HTMLImageElement, point: Point): Unit = js.native
  /** 
    * Calculates the average color of the image within the given path,
    * rectangle or point. This can be used for creating raster image
    * effects.
    * 
    * @return the average color contained in the area covered by the
    * specified path, rectangle or point
    */
  def getAverageColor(`object`: Path): Color = js.native
  def getAverageColor(`object`: Point): Color = js.native
  def getAverageColor(`object`: Rectangle): Color = js.native
  def getImageData(rect: Rectangle): ImageData = js.native
  /** 
    * Gets the color of a pixel in the raster.
    * 
    * @param point - the offset of the pixel as a point in pixel
    *     coordinates
    * 
    * @return the color of the pixel
    */
  def getPixel(point: Point): Color = js.native
  /** 
    * Gets the color of a pixel in the raster.
    * 
    * @param x - the x offset of the pixel in pixel coordinates
    * @param y - the y offset of the pixel in pixel coordinates
    * 
    * @return the color of the pixel
    */
  def getPixel(x: Double, y: Double): Color = js.native
  /** 
    * Extracts a part of the Raster's content as a sub image, and returns it as
    * a Canvas object.
    * 
    * @param rect - the boundaries of the sub image in pixel
    * coordinates
    * 
    * @return the sub image as a Canvas object
    */
  def getSubCanvas(rect: Rectangle): HTMLCanvasElement = js.native
  /** 
    * Extracts a part of the raster item's content as a new raster item, placed
    * in exactly the same place as the original content.
    * 
    * @param rect - the boundaries of the sub raster in pixel
    * coordinates
    * 
    * @return the sub raster as a newly created raster item
    */
  def getSubRaster(rect: Rectangle): Raster = js.native
  def setImageData(data: ImageData, point: Point): Unit = js.native
  /** 
    * Sets the color of the specified pixel to the specified color.
    * 
    * @param point - the offset of the pixel as a point in pixel
    *     coordinates
    * @param color - the color that the pixel will be set to
    */
  def setPixel(point: Point, color: Color): Unit = js.native
  /** 
    * Sets the color of the specified pixel to the specified color.
    * 
    * @param x - the x offset of the pixel in pixel coordinates
    * @param y - the y offset of the pixel in pixel coordinates
    * @param color - the color that the pixel will be set to
    */
  def setPixel(x: Double, y: Double, color: Color): Unit = js.native
  /** 
    * Returns a Base 64 encoded `data:` URL representation of the raster.
    */
  def toDataURL(): String = js.native
}

