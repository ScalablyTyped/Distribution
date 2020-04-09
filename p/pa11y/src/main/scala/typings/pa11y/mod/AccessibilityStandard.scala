package typings.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pa11y.pa11yStrings.Section508
  - typings.pa11y.pa11yStrings.WCAG2A
  - typings.pa11y.pa11yStrings.WCAG2AA
  - typings.pa11y.pa11yStrings.WCAG2AAA
*/
trait AccessibilityStandard extends js.Object

object AccessibilityStandard {
  @scala.inline
  def Section508: typings.pa11y.pa11yStrings.Section508 = this.cast("Section508")
  @scala.inline
  def WCAG2A: typings.pa11y.pa11yStrings.WCAG2A = this.cast("WCAG2A")
  @scala.inline
  def WCAG2AA: typings.pa11y.pa11yStrings.WCAG2AA = this.cast("WCAG2AA")
  @scala.inline
  def WCAG2AAA: typings.pa11y.pa11yStrings.WCAG2AAA = this.cast("WCAG2AAA")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

