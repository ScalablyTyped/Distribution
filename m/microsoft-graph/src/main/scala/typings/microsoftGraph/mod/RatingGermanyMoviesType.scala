package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.allAllowed
  - typings.microsoftGraph.microsoftGraphStrings.allBlocked
  - typings.microsoftGraph.microsoftGraphStrings.general
  - typings.microsoftGraph.microsoftGraphStrings.agesAbove6
  - typings.microsoftGraph.microsoftGraphStrings.agesAbove12
  - typings.microsoftGraph.microsoftGraphStrings.agesAbove16
  - typings.microsoftGraph.microsoftGraphStrings.adults
*/
trait RatingGermanyMoviesType extends js.Object

object RatingGermanyMoviesType {
  @scala.inline
  def adults: typings.microsoftGraph.microsoftGraphStrings.adults = this.cast("adults")
  @scala.inline
  def agesAbove12: typings.microsoftGraph.microsoftGraphStrings.agesAbove12 = this.cast("agesAbove12")
  @scala.inline
  def agesAbove16: typings.microsoftGraph.microsoftGraphStrings.agesAbove16 = this.cast("agesAbove16")
  @scala.inline
  def agesAbove6: typings.microsoftGraph.microsoftGraphStrings.agesAbove6 = this.cast("agesAbove6")
  @scala.inline
  def allAllowed: typings.microsoftGraph.microsoftGraphStrings.allAllowed = this.cast("allAllowed")
  @scala.inline
  def allBlocked: typings.microsoftGraph.microsoftGraphStrings.allBlocked = this.cast("allBlocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def general: typings.microsoftGraph.microsoftGraphStrings.general = this.cast("general")
}

