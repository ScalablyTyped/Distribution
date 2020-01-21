package typings.openlayers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.pixel
  - typings.openlayers.openlayersStrings.image
*/
trait RasterOperationType extends js.Object

object RasterOperationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def image: typings.openlayers.openlayersStrings.image = this.cast("image")
  @scala.inline
  def pixel: typings.openlayers.openlayersStrings.pixel = this.cast("pixel")
}

