package typings.packageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object packageJsonStrings {
  @js.native
  sealed trait PackageNotFoundError extends js.Object
  
  @js.native
  sealed trait VersionNotFoundError extends js.Object
  
  @scala.inline
  def PackageNotFoundError: PackageNotFoundError = "PackageNotFoundError".asInstanceOf[PackageNotFoundError]
  @scala.inline
  def VersionNotFoundError: VersionNotFoundError = "VersionNotFoundError".asInstanceOf[VersionNotFoundError]
}

