package typings
package oauthDashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb extends js.Object {
  @JSName("get")
  def get_false(
    query: js.Any,
    cb: js.Function1[
      /* success */ oauthDashShimLib.oauthDashShimLibNumbers.`false` | js.Object, 
      scala.Unit
    ]
  ): scala.Unit
}

object Anon_Cb {
  @scala.inline
  def apply(
    get_false: (js.Any, js.Function1[
      /* success */ oauthDashShimLib.oauthDashShimLibNumbers.`false` | js.Object, 
      scala.Unit
    ]) => scala.Unit
  ): Anon_Cb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2(get_false))
    __obj.asInstanceOf[Anon_Cb]
  }
}

