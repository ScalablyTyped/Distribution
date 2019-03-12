package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowAll extends js.Object {
  def allowAll(): scala.Unit
  def disallow(): scala.Unit
  def restrictToOrigin(origin: java.lang.String): scala.Unit
}

object Anon_AllowAll {
  @scala.inline
  def apply(
    allowAll: () => scala.Unit,
    disallow: () => scala.Unit,
    restrictToOrigin: java.lang.String => scala.Unit
  ): Anon_AllowAll = {
    val __obj = js.Dynamic.literal(allowAll = js.Any.fromFunction0(allowAll), disallow = js.Any.fromFunction0(disallow), restrictToOrigin = js.Any.fromFunction1(restrictToOrigin))
  
    __obj.asInstanceOf[Anon_AllowAll]
  }
}

