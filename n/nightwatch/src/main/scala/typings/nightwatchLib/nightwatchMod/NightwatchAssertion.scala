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

