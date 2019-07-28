package typings.openidDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IntrospectBody extends js.Object {
  val introspectBody: js.UndefOr[js.Object] = js.undefined
}

object Anon_IntrospectBody {
  @scala.inline
  def apply(introspectBody: js.Object = null): Anon_IntrospectBody = {
    val __obj = js.Dynamic.literal()
    if (introspectBody != null) __obj.updateDynamic("introspectBody")(introspectBody)
    __obj.asInstanceOf[Anon_IntrospectBody]
  }
}

