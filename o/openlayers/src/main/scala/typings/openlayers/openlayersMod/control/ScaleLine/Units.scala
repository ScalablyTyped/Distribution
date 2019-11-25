package typings.openlayers.openlayersMod.control.ScaleLine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Units for the scale line. Supported values are `'degrees'`, `'imperial'`,
  * `'nautical'`, `'metric'`, `'us'`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.degrees
  - typings.openlayers.openlayersStrings.imperial
  - typings.openlayers.openlayersStrings.nautical
  - typings.openlayers.openlayersStrings.metric
  - typings.openlayers.openlayersStrings.us
*/
trait Units extends js.Object

object Units {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def degrees: typings.openlayers.openlayersStrings.degrees = this.cast("degrees")
  @scala.inline
  def imperial: typings.openlayers.openlayersStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typings.openlayers.openlayersStrings.metric = this.cast("metric")
  @scala.inline
  def nautical: typings.openlayers.openlayersStrings.nautical = this.cast("nautical")
  @scala.inline
  def us: typings.openlayers.openlayersStrings.us = this.cast("us")
}

