package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredPreview[T] extends js.Object {
  var mediaType: `0`[T] = js.native
}

object RequiredPreview {
  @scala.inline
  def apply[T](mediaType: `0`[T]): RequiredPreview[T] = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPreview[T]]
  }
  @scala.inline
  implicit class RequiredPreviewOps[Self <: RequiredPreview[_], T] (val x: Self with RequiredPreview[T]) extends AnyVal {
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
    def setMediaType(value: `0`[T]): Self = this.set("mediaType", value.asInstanceOf[js.Any])
  }
  
}

