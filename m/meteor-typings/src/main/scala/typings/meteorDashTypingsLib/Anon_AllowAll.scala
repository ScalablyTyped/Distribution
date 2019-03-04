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
    allowAll: js.Function0[scala.Unit],
    disallow: js.Function0[scala.Unit],
    restrictToOrigin: js.Function1[java.lang.String, scala.Unit]
  ): Anon_AllowAll = {
    val __obj = js.Dynamic.literal(allowAll = allowAll, disallow = disallow, restrictToOrigin = restrictToOrigin)
  
    __obj.asInstanceOf[Anon_AllowAll]
  }
}

