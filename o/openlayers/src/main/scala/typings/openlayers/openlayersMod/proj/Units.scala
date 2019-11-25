package typings.openlayers.openlayersMod.proj

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Projection units: `'degrees'`, `'ft'`, `'m'`, `'pixels'`, `'tile-pixels'` or
  * `'us-ft'`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.degrees
  - typings.openlayers.openlayersStrings.ft
  - typings.openlayers.openlayersStrings.m
  - typings.openlayers.openlayersStrings.pixels
  - typings.openlayers.openlayersStrings.`tile-pixels`
  - typings.openlayers.openlayersStrings.`us-ft`
*/
trait Units extends js.Object

object Units {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degrees: typings.openlayers.openlayersStrings.degrees = this.cast("degrees")
  @scala.inline
  def ft: typings.openlayers.openlayersStrings.ft = this.cast("ft")
  @scala.inline
  def m: typings.openlayers.openlayersStrings.m = this.cast("m")
  @scala.inline
  def pixels: typings.openlayers.openlayersStrings.pixels = this.cast("pixels")
  @scala.inline
  def `tile-pixels`: typings.openlayers.openlayersStrings.`tile-pixels` = this.cast("tile-pixels")
  @scala.inline
  def `us-ft`: typings.openlayers.openlayersStrings.`us-ft` = this.cast("us-ft")
}

