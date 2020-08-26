package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriveItemVersion extends BaseItemVersion {
  // The content stream for this version of the item.
  var content: js.UndefOr[js.Any] = js.native
  // Indicates the size of the content stream for this version of the item.
  var size: js.UndefOr[Double] = js.native
}

object DriveItemVersion {
  @scala.inline
  def apply(): DriveItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemVersion]
  }
  @scala.inline
  implicit class DriveItemVersionOps[Self <: DriveItemVersion] (val x: Self) extends AnyVal {
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

