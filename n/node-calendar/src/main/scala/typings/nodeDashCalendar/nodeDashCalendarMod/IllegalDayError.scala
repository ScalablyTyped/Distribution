package typings.nodeDashCalendar.nodeDashCalendarMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-calendar", "IllegalDayError")
@js.native
/**
		 * @param {string} message
		 *  Optional custom error message.
		 */
class IllegalDayError () extends Error {
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

