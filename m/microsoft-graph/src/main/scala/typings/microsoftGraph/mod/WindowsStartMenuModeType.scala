package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.fullScreen
  - typings.microsoftGraph.microsoftGraphStrings.nonFullScreen
*/
trait WindowsStartMenuModeType extends js.Object

object WindowsStartMenuModeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fullScreen: typings.microsoftGraph.microsoftGraphStrings.fullScreen = this.cast("fullScreen")
  @scala.inline
  def nonFullScreen: typings.microsoftGraph.microsoftGraphStrings.nonFullScreen = this.cast("nonFullScreen")
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

