package typings
package neverbounceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentType extends js.Object {
  var `Content-Type`: js.UndefOr[java.lang.String] = js.undefined
  var `User-Agent`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContentType {
  @scala.inline
  def apply(`Content-Type`: java.lang.String = null, `User-Agent`: java.lang.String = null): Anon_ContentType = {
    val __obj = js.Dynamic.literal()
    if (`Content-Type` != null) __obj.updateDynamic("Content-Type")(`Content-Type`)
    if (`User-Agent` != null) __obj.updateDynamic("User-Agent")(`User-Agent`)
    __obj.asInstanceOf[Anon_ContentType]
  }
}

