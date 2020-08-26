package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchAssertion[T, U] extends js.Object {
  var api: NightwatchAPI = js.native
  var expected: js.Function0[T] | T = js.native
  var failure: js.UndefOr[js.Function1[/* result */ U, Boolean]] = js.native
  var message: String = js.native
  def command(callback: js.Function1[/* result */ U, Unit]): this.type = js.native
  def pass(value: T): js.Any = js.native
  def value(result: U): T = js.native
}

object NightwatchAssertion {
  @scala.inline
  def apply[T, U](
    api: NightwatchAPI,
    command: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U],
    expected: js.Function0[T] | T,
    message: String,
    pass: T => js.Any,
    value: U => T
  ): NightwatchAssertion[T, U] = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], command = js.Any.fromFunction1(command), expected = expected.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], pass = js.Any.fromFunction1(pass), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[NightwatchAssertion[T, U]]
  }
  @scala.inline
  implicit class NightwatchAssertionOps[Self <: NightwatchAssertion[_, _], T, U] (val x: Self with (NightwatchAssertion[T, U])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApi(value: NightwatchAPI): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: js.Function1[/* result */ U, Unit] => NightwatchAssertion[T, U]): Self = this.set("command", js.Any.fromFunction1(value))
    @scala.inline
    def setExpectedFunction0(value: () => T): Self = this.set("expected", js.Any.fromFunction0(value))
    @scala.inline
    def setExpected(value: js.Function0[T] | T): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setPass(value: T => js.Any): Self = this.set("pass", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: U => T): Self = this.set("value", js.Any.fromFunction1(value))
    @scala.inline
    def setFailure(value: /* result */ U => Boolean): Self = this.set("failure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
  }
  
}

