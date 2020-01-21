package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.allAllowed
  - typings.microsoftGraph.microsoftGraphStrings.allBlocked
  - typings.microsoftGraph.microsoftGraphStrings.general
  - typings.microsoftGraph.microsoftGraphStrings.parentalGuidance
  - typings.microsoftGraph.microsoftGraphStrings.agesAbove14
  - typings.microsoftGraph.microsoftGraphStrings.agesAbove18
  - typings.microsoftGraph.microsoftGraphStrings.restricted
*/
trait RatingCanadaMoviesType extends js.Object

object RatingCanadaMoviesType {
  @scala.inline
  def agesAbove14: typings.microsoftGraph.microsoftGraphStrings.agesAbove14 = this.cast("agesAbove14")
  @scala.inline
  def agesAbove18: typings.microsoftGraph.microsoftGraphStrings.agesAbove18 = this.cast("agesAbove18")
  @scala.inline
  def allAllowed: typings.microsoftGraph.microsoftGraphStrings.allAllowed = this.cast("allAllowed")
  @scala.inline
  def allBlocked: typings.microsoftGraph.microsoftGraphStrings.allBlocked = this.cast("allBlocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def general: typings.microsoftGraph.microsoftGraphStrings.general = this.cast("general")
  @scala.inline
  def parentalGuidance: typings.microsoftGraph.microsoftGraphStrings.parentalGuidance = this.cast("parentalGuidance")
  @scala.inline
  def restricted: typings.microsoftGraph.microsoftGraphStrings.restricted = this.cast("restricted")
}

