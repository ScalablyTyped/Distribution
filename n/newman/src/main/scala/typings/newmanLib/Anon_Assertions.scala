package typings
package newmanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assertions extends js.Object {
  var assertions: newmanLib.newmanMod.NewmanRunStat
  var items: newmanLib.newmanMod.NewmanRunStat
  var iterations: newmanLib.newmanMod.NewmanRunStat
  var prerequestScripts: newmanLib.newmanMod.NewmanRunStat
  var prerequests: newmanLib.newmanMod.NewmanRunStat
  var requests: newmanLib.newmanMod.NewmanRunStat
  var scripts: newmanLib.newmanMod.NewmanRunStat
  var testScripts: newmanLib.newmanMod.NewmanRunStat
  var tests: newmanLib.newmanMod.NewmanRunStat
}

object Anon_Assertions {
  @scala.inline
  def apply(
    assertions: newmanLib.newmanMod.NewmanRunStat,
    items: newmanLib.newmanMod.NewmanRunStat,
    iterations: newmanLib.newmanMod.NewmanRunStat,
    prerequestScripts: newmanLib.newmanMod.NewmanRunStat,
    prerequests: newmanLib.newmanMod.NewmanRunStat,
    requests: newmanLib.newmanMod.NewmanRunStat,
    scripts: newmanLib.newmanMod.NewmanRunStat,
    testScripts: newmanLib.newmanMod.NewmanRunStat,
    tests: newmanLib.newmanMod.NewmanRunStat
  ): Anon_Assertions = {
    val __obj = js.Dynamic.literal(assertions = assertions, items = items, iterations = iterations, prerequestScripts = prerequestScripts, prerequests = prerequests, requests = requests, scripts = scripts, testScripts = testScripts, tests = tests)
  
    __obj.asInstanceOf[Anon_Assertions]
  }
}

