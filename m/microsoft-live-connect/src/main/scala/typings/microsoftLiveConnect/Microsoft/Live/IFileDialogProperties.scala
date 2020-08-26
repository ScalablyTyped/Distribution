package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.fileDialog method.
  */
@js.native
trait IFileDialogProperties extends js.Object {
  /**
    * The color pallette to use for the file picker. Specify "white",
    * "grey", or "transparent".
    * @default "white"
    */
  var lightbox: js.UndefOr[String] = js.native
  /**
    * Specifies the type of SkyDrive file picker to display. Specify "open"
    * to display the download version of the file picker. Specify "save"
    * to display the upload version of the file picker.
    */
  var mode: String = js.native
  /**
    * Specify only if the mode property is set to "open". Specifies how
    * many files the user can select to download. Specify "single" for a
    * single file. Specify "multi" for multiple files.
    * @default "single"
    */
  var select: js.UndefOr[String] = js.native
}

object IFileDialogProperties {
  @scala.inline
  def apply(mode: String): IFileDialogProperties = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDialogProperties]
  }
  @scala.inline
  implicit class IFileDialogPropertiesOps[Self <: IFileDialogProperties] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLightbox(value: String): Self = this.set("lightbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightbox: Self = this.set("lightbox", js.undefined)
    @scala.inline
    def setSelect(value: String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
  
}

