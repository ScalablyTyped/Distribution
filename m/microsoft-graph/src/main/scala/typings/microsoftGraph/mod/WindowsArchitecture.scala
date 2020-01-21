package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.x86
  - typings.microsoftGraph.microsoftGraphStrings.x64
  - typings.microsoftGraph.microsoftGraphStrings.arm
  - typings.microsoftGraph.microsoftGraphStrings.neutral
*/
trait WindowsArchitecture extends js.Object

object WindowsArchitecture {
  @scala.inline
  def arm: typings.microsoftGraph.microsoftGraphStrings.arm = this.cast("arm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def neutral: typings.microsoftGraph.microsoftGraphStrings.neutral = this.cast("neutral")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def x64: typings.microsoftGraph.microsoftGraphStrings.x64 = this.cast("x64")
  @scala.inline
  def x86: typings.microsoftGraph.microsoftGraphStrings.x86 = this.cast("x86")
}

