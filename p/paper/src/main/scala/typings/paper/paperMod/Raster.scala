package typings.paper.paperMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Raster")
@js.native
/**
  * Creates a new raster item from the passed argument, and places it in the active layer. object can either be a DOM Image, a Canvas, or a string describing the URL to load the image from, or the ID of a DOM element to get the image from (either a DOM Image or a Canvas).
  * @param source [optional] - the source of the raster
  * @param position [optional] - the center position at which the raster item is placed
  */
class Raster ()
  extends typings.paper.paper.Raster {
  def this(config: js.Any) = this()
  def this(source: String) = this()
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: String, position: typings.paper.paper.Point) = this()
  def this(source: HTMLCanvasElement, position: typings.paper.paper.Point) = this()
  def this(source: HTMLImageElement, position: typings.paper.paper.Point) = this()
}

