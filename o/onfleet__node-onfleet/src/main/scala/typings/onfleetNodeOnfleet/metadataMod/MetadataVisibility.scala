package typings.onfleetNodeOnfleet.metadataMod

import typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api
  - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard
  - typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.worker_
*/
trait MetadataVisibility extends js.Object

object MetadataVisibility {
  @scala.inline
  def api: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.api = this.cast("api")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashboard: typings.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.dashboard = this.cast("dashboard")
  @scala.inline
  def worker: worker_ = this.cast("worker")
}

