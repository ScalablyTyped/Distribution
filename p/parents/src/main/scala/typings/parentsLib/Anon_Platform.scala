package typings
package parentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Platform extends js.Object {
  var platform: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Platform {
  @scala.inline
  def apply(platform: java.lang.String = null): Anon_Platform = {
    val __obj = js.Dynamic.literal()
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Anon_Platform]
  }
}

