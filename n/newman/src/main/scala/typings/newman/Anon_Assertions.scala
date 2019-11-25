package typings.newman

import typings.newman.newmanMod.NewmanRunStat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assertions extends js.Object {
  var assertions: NewmanRunStat
  var items: NewmanRunStat
  var iterations: NewmanRunStat
  var prerequestScripts: NewmanRunStat
  var prerequests: NewmanRunStat
  var requests: NewmanRunStat
  var scripts: NewmanRunStat
  var testScripts: NewmanRunStat
  var tests: NewmanRunStat
}

object Anon_Assertions {
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
  ): Anon_Assertions = {
    val __obj = js.Dynamic.literal(assertions = assertions.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], prerequestScripts = prerequestScripts.asInstanceOf[js.Any], prerequests = prerequests.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], testScripts = testScripts.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Assertions]
  }
}

