package typings.powerappsComponentFramework.ComponentFramework.FormattingApi.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * DateTime Field Behavior options
		 * 0 - None - Unknown DateTime Behavior,
		 * 1 - UserLocal - Respect user local time. Dates stored as UTC,
		 * 3 - TimeZoneIndependent - Dates and time stored without conversion to UTC
		 */
/* Rewritten from type alias, can be one of: 
  - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0`
  - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
  - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3`
*/
trait DateTimeFieldBehavior extends js.Object

object DateTimeFieldBehavior {
  @scala.inline
  def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = this.cast(1)
  @scala.inline
  def `3`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

