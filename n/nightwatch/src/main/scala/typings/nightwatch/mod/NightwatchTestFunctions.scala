package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchTestFunctions
  extends /* key */ StringDictionary[js.Any]
     with NightwatchTests {
  
  var `@disabled`: js.UndefOr[Boolean] = js.native
  
  var `@tags`: js.UndefOr[String | js.Array[String]] = js.native
  
  var after: js.UndefOr[NightwatchTestHook] = js.native
  
  var afterEach: js.UndefOr[NightwatchTestHook] = js.native
  
  var before: js.UndefOr[NightwatchTestHook] = js.native
  
  var beforeEach: js.UndefOr[NightwatchTestHook] = js.native
}
object NightwatchTestFunctions {
  
  @scala.inline
  def apply(): NightwatchTestFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchTestFunctions]
  }
  
  @scala.inline
  implicit class NightwatchTestFunctionsOps[Self <: NightwatchTestFunctions] (val x: Self) extends AnyVal {
    
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
    def `set@disabled`(value: Boolean): Self = this.set("@disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@disabled`: Self = this.set("@disabled", js.undefined)
    
    @scala.inline
    def `set@tagsVarargs`(value: String*): Self = this.set("@tags", js.Array(value :_*))
    
    @scala.inline
    def `set@tags`(value: String | js.Array[String]): Self = this.set("@tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `delete@tags`: Self = this.set("@tags", js.undefined)
    
    @scala.inline
    def setAfterFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("after", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfter(value: NightwatchTestHook): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAfterEachFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("afterEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterEachFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("afterEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterEach(value: NightwatchTestHook): Self = this.set("afterEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterEach: Self = this.set("afterEach", js.undefined)
    
    @scala.inline
    def setBeforeFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: NightwatchTestHook): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setBeforeEachFunction2(
      value: (/* browser */ NightwatchBrowser, /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("beforeEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeEachFunction1(value: /* done */ js.Function1[/* err */ js.UndefOr[js.Any], Unit] => Unit): Self = this.set("beforeEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeEach(value: NightwatchTestHook): Self = this.set("beforeEach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeEach: Self = this.set("beforeEach", js.undefined)
  }
}
