package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICLSIDs extends js.Object {
  val PreviewerCtrl: String
  val ShellListingCtrl: String
}

object ICLSIDs {
  @scala.inline
  def apply(PreviewerCtrl: String, ShellListingCtrl: String): ICLSIDs = {
    val __obj = js.Dynamic.literal(PreviewerCtrl = PreviewerCtrl.asInstanceOf[js.Any], ShellListingCtrl = ShellListingCtrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICLSIDs]
  }
}

