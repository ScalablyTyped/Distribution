package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredPreview[T] extends js.Object {
  var mediaType: `0`[T]
}

object RequiredPreview {
  @scala.inline
  def apply[T](mediaType: `0`[T]): RequiredPreview[T] = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPreview[T]]
  }
}

