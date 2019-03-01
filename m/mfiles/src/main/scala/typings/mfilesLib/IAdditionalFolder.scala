package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdditionalFolder extends js.Object {
  var Folder: java.lang.String
  var Impersonation: IImpersonation
  var LimitInMB: scala.Double
  def Clone(): IAdditionalFolder
}

object IAdditionalFolder {
  @scala.inline
  def apply(
    Clone: js.Function0[IAdditionalFolder],
    Folder: java.lang.String,
    Impersonation: IImpersonation,
    LimitInMB: scala.Double
  ): IAdditionalFolder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Folder")(Folder)
    __obj.updateDynamic("Impersonation")(Impersonation)
    __obj.updateDynamic("LimitInMB")(LimitInMB)
    __obj.asInstanceOf[IAdditionalFolder]
  }
}

