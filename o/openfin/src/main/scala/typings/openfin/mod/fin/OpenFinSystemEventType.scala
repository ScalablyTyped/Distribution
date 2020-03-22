package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openfin.openfinStrings.`application-closed`
  - typings.openfin.openfinStrings.`application-crashed`
  - typings.openfin.openfinStrings.`application-created`
  - typings.openfin.openfinStrings.`application-started`
  - typings.openfin.openfinStrings.`desktop-icon-clicked`
  - typings.openfin.openfinStrings.`idle-state-changed`
  - typings.openfin.openfinStrings.`monitor-info-changed`
  - typings.openfin.openfinStrings.`session-changed`
*/
trait OpenFinSystemEventType extends js.Object

object OpenFinSystemEventType {
  @scala.inline
  def `application-closed`: typings.openfin.openfinStrings.`application-closed` = this.cast("application-closed")
  @scala.inline
  def `application-crashed`: typings.openfin.openfinStrings.`application-crashed` = this.cast("application-crashed")
  @scala.inline
  def `application-created`: typings.openfin.openfinStrings.`application-created` = this.cast("application-created")
  @scala.inline
  def `application-started`: typings.openfin.openfinStrings.`application-started` = this.cast("application-started")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `desktop-icon-clicked`: typings.openfin.openfinStrings.`desktop-icon-clicked` = this.cast("desktop-icon-clicked")
  @scala.inline
  def `idle-state-changed`: typings.openfin.openfinStrings.`idle-state-changed` = this.cast("idle-state-changed")
  @scala.inline
  def `monitor-info-changed`: typings.openfin.openfinStrings.`monitor-info-changed` = this.cast("monitor-info-changed")
  @scala.inline
  def `session-changed`: typings.openfin.openfinStrings.`session-changed` = this.cast("session-changed")
}

