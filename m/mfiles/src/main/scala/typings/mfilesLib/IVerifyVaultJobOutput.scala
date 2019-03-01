package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerifyVaultJobOutput extends js.Object {
  val Errors: IStrings
}

object IVerifyVaultJobOutput {
  @scala.inline
  def apply(Errors: IStrings): IVerifyVaultJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Errors")(Errors)
    __obj.asInstanceOf[IVerifyVaultJobOutput]
  }
}

