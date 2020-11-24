package typings.packageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageJsonStrings {
  
  @scala.inline
  def PackageNotFoundError: PackageNotFoundError = "PackageNotFoundError".asInstanceOf[PackageNotFoundError]
  
  @scala.inline
  def VersionNotFoundError: VersionNotFoundError = "VersionNotFoundError".asInstanceOf[VersionNotFoundError]
  
  @js.native
  sealed trait PackageNotFoundError extends js.Object
  
  @js.native
  sealed trait VersionNotFoundError extends js.Object
}
