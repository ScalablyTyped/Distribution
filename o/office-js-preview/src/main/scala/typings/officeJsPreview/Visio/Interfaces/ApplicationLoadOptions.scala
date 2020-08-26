package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Application.
  *
  * [Api set:  1.1]
  */
@js.native
trait ApplicationLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Show or hide the iFrame application borders.
    *
    * [Api set:  1.1]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  /**
    *
    * Show or hide the standard toolbars.
    *
    * [Api set:  1.1]
    */
  var showToolbars: js.UndefOr[Boolean] = js.native
}

object ApplicationLoadOptions {
  @scala.inline
  def apply(): ApplicationLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationLoadOptions]
  }
  @scala.inline
  implicit class ApplicationLoadOptionsOps[Self <: ApplicationLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setShowBorders(value: Boolean): Self = this.set("showBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowBorders: Self = this.set("showBorders", js.undefined)
    @scala.inline
    def setShowToolbars(value: Boolean): Self = this.set("showToolbars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolbars: Self = this.set("showToolbars", js.undefined)
  }
  
}

