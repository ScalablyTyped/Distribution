package typings.newman.anon

import typings.newman.mod.NewmanRunStat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertions extends js.Object {
  var assertions: NewmanRunStat = js.native
  var items: NewmanRunStat = js.native
  var iterations: NewmanRunStat = js.native
  var prerequestScripts: NewmanRunStat = js.native
  var prerequests: NewmanRunStat = js.native
  var requests: NewmanRunStat = js.native
  var scripts: NewmanRunStat = js.native
  var testScripts: NewmanRunStat = js.native
  var tests: NewmanRunStat = js.native
}

object Assertions {
  @scala.inline
  def apply(
    assertions: NewmanRunStat,
    items: NewmanRunStat,
    iterations: NewmanRunStat,
    prerequestScripts: NewmanRunStat,
    prerequests: NewmanRunStat,
    requests: NewmanRunStat,
    scripts: NewmanRunStat,
    testScripts: NewmanRunStat,
    tests: NewmanRunStat
  ): Assertions = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prerequestScripts = prerequestScripts.asInstanceOf[js.Any], prerequests = prerequests.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], testScripts = testScripts.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertions]
  }
  @scala.inline
  implicit class AssertionsOps[Self <: Assertions] (val x: Self) extends AnyVal {
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
    def setAssertions(value: NewmanRunStat): Self = this.set("assertions", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: NewmanRunStat): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: NewmanRunStat): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrerequestScripts(value: NewmanRunStat): Self = this.set("prerequestScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrerequests(value: NewmanRunStat): Self = this.set("prerequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequests(value: NewmanRunStat): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setScripts(value: NewmanRunStat): Self = this.set("scripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestScripts(value: NewmanRunStat): Self = this.set("testScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTests(value: NewmanRunStat): Self = this.set("tests", value.asInstanceOf[js.Any])
  }
  
}

