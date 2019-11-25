package typings.openlayers.openlayersMod.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IGC altitude/z. One of 'barometric', 'gps', 'none'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.barometric
  - typings.openlayers.openlayersStrings.gps
  - typings.openlayers.openlayersStrings.none
*/
trait IGCZ extends js.Object

object IGCZ {
  @scala.inline
  def barometric: typings.openlayers.openlayersStrings.barometric = this.cast("barometric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typings.openlayers.openlayersStrings.gps = this.cast("gps")
  @scala.inline
  def none: typings.openlayers.openlayersStrings.none = this.cast("none")
}

