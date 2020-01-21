package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.all
  - typings.microsoftGraph.microsoftGraphStrings.businessReadyOnly
  - typings.microsoftGraph.microsoftGraphStrings.windowsInsiderBuildFast
  - typings.microsoftGraph.microsoftGraphStrings.windowsInsiderBuildSlow
  - typings.microsoftGraph.microsoftGraphStrings.windowsInsiderBuildRelease
*/
trait WindowsUpdateType extends js.Object

object WindowsUpdateType {
  @scala.inline
  def all: typings.microsoftGraph.microsoftGraphStrings.all = this.cast("all")
  @scala.inline
  def businessReadyOnly: typings.microsoftGraph.microsoftGraphStrings.businessReadyOnly = this.cast("businessReadyOnly")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
  @scala.inline
  def windowsInsiderBuildFast: typings.microsoftGraph.microsoftGraphStrings.windowsInsiderBuildFast = this.cast("windowsInsiderBuildFast")
  @scala.inline
  def windowsInsiderBuildRelease: typings.microsoftGraph.microsoftGraphStrings.windowsInsiderBuildRelease = this.cast("windowsInsiderBuildRelease")
  @scala.inline
  def windowsInsiderBuildSlow: typings.microsoftGraph.microsoftGraphStrings.windowsInsiderBuildSlow = this.cast("windowsInsiderBuildSlow")
}

