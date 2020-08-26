package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICLSIDs extends js.Object {
  val PreviewerCtrl: String = js.native
  val ShellListingCtrl: String = js.native
}

object ICLSIDs {
  @scala.inline
  def apply(PreviewerCtrl: String, ShellListingCtrl: String): ICLSIDs = {
    val __obj = js.Dynamic.literal(PreviewerCtrl = PreviewerCtrl.asInstanceOf[js.Any], ShellListingCtrl = ShellListingCtrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICLSIDs]
  }
  @scala.inline
  implicit class ICLSIDsOps[Self <: ICLSIDs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreviewerCtrl(value: String): Self = this.set("PreviewerCtrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setShellListingCtrl(value: String): Self = this.set("ShellListingCtrl", value.asInstanceOf[js.Any])
  }
  
}

