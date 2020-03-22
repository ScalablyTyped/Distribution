package typings.objection.mod

import typings.objection.objectionStrings.asc_
import typings.objection.objectionStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.objection.objectionStrings.asc_
  - typings.objection.objectionStrings.desc_
  - typings.objection.objectionStrings.ASC
  - typings.objection.objectionStrings.DESC
*/
trait OrderByDirection extends js.Object

object OrderByDirection {
  @scala.inline
  def ASC: typings.objection.objectionStrings.ASC = this.cast("ASC")
  @scala.inline
  def DESC: typings.objection.objectionStrings.DESC = this.cast("DESC")
  @scala.inline
  def asc: asc_ = this.cast("asc")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def desc: desc_ = this.cast("desc")
}

