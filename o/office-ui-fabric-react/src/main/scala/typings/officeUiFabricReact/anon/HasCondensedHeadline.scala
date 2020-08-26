package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasCondensedHeadline extends js.Object {
  var hasCondensedHeadline: Boolean = js.native
  var imageProps: Height = js.native
}

object HasCondensedHeadline {
  @scala.inline
  def apply(hasCondensedHeadline: Boolean, imageProps: Height): HasCondensedHeadline = {
    val __obj = js.Dynamic.literal(hasCondensedHeadline = hasCondensedHeadline.asInstanceOf[js.Any], imageProps = imageProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasCondensedHeadline]
  }
  @scala.inline
  implicit class HasCondensedHeadlineOps[Self <: HasCondensedHeadline] (val x: Self) extends AnyVal {
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
    def setHasCondensedHeadline(value: Boolean): Self = this.set("hasCondensedHeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageProps(value: Height): Self = this.set("imageProps", value.asInstanceOf[js.Any])
  }
  
}

