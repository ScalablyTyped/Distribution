package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NightwatchTestHooks
  extends NightwatchGlobals
     with NightwatchTests {
  var after: js.UndefOr[GlobalNightwatchTestHook] = js.native
  var afterEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.native
  var before: js.UndefOr[GlobalNightwatchTestHook] = js.native
  var beforeEach: js.UndefOr[GlobalNightwatchTestHookEach] = js.native
}

object NightwatchTestHooks {
  @scala.inline
  def apply(): NightwatchTestHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestHooks]
  }
  @scala.inline
  implicit class NightwatchTestHooksOps[Self <: NightwatchTestHooks] (val x: Self) extends AnyVal {
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
    def setAfter(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    @scala.inline
    def setAfterEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("afterEach", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAfterEach: Self = this.set("afterEach", js.undefined)
    @scala.inline
    def setBefore(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setBeforeEach(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("beforeEach", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeEach: Self = this.set("beforeEach", js.undefined)
  }
  
}

