package typings
package mobxLib.libApiAutorunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAutorunOptions extends js.Object {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], _]] = js.undefined
}

