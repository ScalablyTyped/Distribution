package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.overwatchApi.overwatchApiStrings.pc
  - typings.overwatchApi.overwatchApiStrings.xbl
  - typings.overwatchApi.overwatchApiStrings.psn
*/
trait PLATFORM extends js.Object

object PLATFORM {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pc: typings.overwatchApi.overwatchApiStrings.pc = this.cast("pc")
  @scala.inline
  def psn: typings.overwatchApi.overwatchApiStrings.psn = this.cast("psn")
  @scala.inline
  def xbl: typings.overwatchApi.overwatchApiStrings.xbl = this.cast("xbl")
}

