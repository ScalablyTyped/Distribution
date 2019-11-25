package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.overwatchDashApi.overwatchDashApiStrings.pc
  - typings.overwatchDashApi.overwatchDashApiStrings.xbl
  - typings.overwatchDashApi.overwatchDashApiStrings.psn
*/
trait PLATFORM extends js.Object

object PLATFORM {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pc: typings.overwatchDashApi.overwatchDashApiStrings.pc = this.cast("pc")
  @scala.inline
  def psn: typings.overwatchDashApi.overwatchDashApiStrings.psn = this.cast("psn")
  @scala.inline
  def xbl: typings.overwatchDashApi.overwatchDashApiStrings.xbl = this.cast("xbl")
}

