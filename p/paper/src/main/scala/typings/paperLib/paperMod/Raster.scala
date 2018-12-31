package typings
package paperLib.paperMod

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
  extends paperLib.paperNs.Raster {
  def this(config: js.Any) = this()
  def this(source: java.lang.String) = this()
  def this(source: stdLib.HTMLCanvasElement) = this()
  def this(source: stdLib.HTMLImageElement) = this()
  def this(source: java.lang.String, position: paperLib.paperNs.Point) = this()
  def this(source: stdLib.HTMLCanvasElement, position: paperLib.paperNs.Point) = this()
  def this(source: stdLib.HTMLImageElement, position: paperLib.paperNs.Point) = this()
}

