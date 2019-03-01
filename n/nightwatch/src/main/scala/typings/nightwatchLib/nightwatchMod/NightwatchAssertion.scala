package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchAssertion extends js.Object {
  var api: js.UndefOr[NightwatchAPI] = js.undefined
  var expected: js.Function0[scala.Unit] | scala.Boolean
  var failure: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var message: java.lang.String
  def command(args: js.Any*): js.Any
  def pass(args: js.Any*): js.Any
  def value(args: js.Any*): js.Any
}

object NightwatchAssertion {
  @scala.inline
  def apply(
    command: js.Function1[/* repeated */ js.Any, js.Any],
    expected: js.Function0[scala.Unit] | scala.Boolean,
    message: java.lang.String,
    pass: js.Function1[/* repeated */ js.Any, js.Any],
    value: js.Function1[/* repeated */ js.Any, js.Any],
    api: NightwatchAPI = null,
    failure: js.Function1[/* repeated */ js.Any, _] = null
  ): NightwatchAssertion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("expected")(expected.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("pass")(pass)
    __obj.updateDynamic("value")(value)
    if (api != null) __obj.updateDynamic("api")(api)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    __obj.asInstanceOf[NightwatchAssertion]
  }
}

