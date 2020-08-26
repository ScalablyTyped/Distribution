package typings.powerappsComponentFramework.ComponentFramework.NavigationApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for confirm dialog options.
  */
@js.native
trait ConfirmDialogOptions extends js.Object {
  /**
    * Height of the confirmation dialog in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *  Width of the confirmation dialog pixels.
    */
  var width: js.UndefOr[Double] = js.native
}

object ConfirmDialogOptions {
  @scala.inline
  def apply(): ConfirmDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmDialogOptions]
  }
  @scala.inline
  implicit class ConfirmDialogOptionsOps[Self <: ConfirmDialogOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

