package typings.openlayers.openlayersMod.source

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * State of the source, one of 'undefined', 'loading', 'ready' or 'error'.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.undefined
  - typings.openlayers.openlayersStrings.loading
  - typings.openlayers.openlayersStrings.ready
  - typings.openlayers.openlayersStrings.error
*/
trait State extends js.Object

object State {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.openlayers.openlayersStrings.error = this.cast("error")
  @scala.inline
  def loading: typings.openlayers.openlayersStrings.loading = this.cast("loading")
  @scala.inline
  def ready: typings.openlayers.openlayersStrings.ready = this.cast("ready")
  @scala.inline
  def undefined: typings.openlayers.openlayersStrings.undefined = this.cast("undefined")
}

