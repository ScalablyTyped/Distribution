package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var `Content-Type`: js.UndefOr[String] = js.undefined
  var `User-Agent`: js.UndefOr[String] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(`Content-Type`: String = null, `User-Agent`: String = null): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContentType]
  }
}

