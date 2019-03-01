package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICLSIDs extends js.Object {
  val PreviewerCtrl: java.lang.String
  val ShellListingCtrl: java.lang.String
}

object ICLSIDs {
  @scala.inline
  def apply(PreviewerCtrl: java.lang.String, ShellListingCtrl: java.lang.String): ICLSIDs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PreviewerCtrl")(PreviewerCtrl)
    __obj.updateDynamic("ShellListingCtrl")(ShellListingCtrl)
    __obj.asInstanceOf[ICLSIDs]
  }
}

