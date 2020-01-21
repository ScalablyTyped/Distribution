package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.productKey
  - typings.microsoftGraph.microsoftGraphStrings.licenseFile
*/
trait EditionUpgradeLicenseType extends js.Object

object EditionUpgradeLicenseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def licenseFile: typings.microsoftGraph.microsoftGraphStrings.licenseFile = this.cast("licenseFile")
  @scala.inline
  def productKey: typings.microsoftGraph.microsoftGraphStrings.productKey = this.cast("productKey")
}

