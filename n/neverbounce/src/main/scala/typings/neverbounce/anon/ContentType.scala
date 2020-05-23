package typings.neverbounce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentType extends js.Object {
  var `Content-Type`: js.UndefOr[String] = js.undefined
  var `User-Agent`: js.UndefOr[String] = js.undefined
}

object ContentType {
  @scala.inline
  def apply(`Content-Type`: String = null, `User-Agent`: String = null): ContentType = {
    val __obj = js.Dynamic.literal()
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentType]
  }
}

