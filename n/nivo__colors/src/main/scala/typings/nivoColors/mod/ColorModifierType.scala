package typings.nivoColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoColors.nivoColorsStrings.brighter
  - typings.nivoColors.nivoColorsStrings.darker
  - typings.nivoColors.nivoColorsStrings.opacity
*/
trait ColorModifierType extends js.Object

object ColorModifierType {
  @scala.inline
  def brighter: typings.nivoColors.nivoColorsStrings.brighter = this.cast("brighter")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def darker: typings.nivoColors.nivoColorsStrings.darker = this.cast("darker")
  @scala.inline
  def opacity: typings.nivoColors.nivoColorsStrings.opacity = this.cast("opacity")
}

