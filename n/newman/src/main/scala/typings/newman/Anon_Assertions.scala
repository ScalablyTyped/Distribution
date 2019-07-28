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
    val __obj = js.Dynamic.literal(assertions = assertions, items = items, iterations = iterations, prerequestScripts = prerequestScripts, prerequests = prerequests, requests = requests, scripts = scripts, testScripts = testScripts, tests = tests)
  
    __obj.asInstanceOf[Anon_Assertions]
  }
}

