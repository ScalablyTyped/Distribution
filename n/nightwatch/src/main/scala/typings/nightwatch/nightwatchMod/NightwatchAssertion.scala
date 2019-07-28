package typings.nightwatch.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchAssertion[T, U] extends js.Object {
  var api: NightwatchAPI
  var expected: js.Function0[T] | T
  var failure: js.UndefOr[js.Function1[/* result */ U, Boolean]] = js.undefined
  var message: String
  def command(callback: js.Function1[/* result */ U, Unit]): this.type
  def pass(value: T): js.Any
  def value(result: U): T
}

object NightwatchAssertion {
  @scala.inline
  def apply[T, U](
    api: NightwatchAPI,
    command: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U],
    expected: js.Function0[T] | T,
    message: String,
    pass: T => js.Any,
    value: U => T,
    failure: /* result */ U => Boolean = null
  ): NightwatchAssertion[T, U] = {
    val __obj = js.Dynamic.literal(api = api, command = js.Any.fromFunction1(command), expected = expected.asInstanceOf[js.Any], message = message, pass = js.Any.fromFunction1(pass), value = js.Any.fromFunction1(value))
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction1(failure))
    __obj.asInstanceOf[NightwatchAssertion[T, U]]
  }
}

