package typings.openlayers.mod.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Icon anchor units. One of 'fraction', 'pixels'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.fraction
  - typings.openlayers.openlayersStrings.pixels
*/
trait IconAnchorUnits extends js.Object

object IconAnchorUnits {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fraction: typings.openlayers.openlayersStrings.fraction = this.cast("fraction")
  @scala.inline
  def pixels: typings.openlayers.openlayersStrings.pixels = this.cast("pixels")
}

