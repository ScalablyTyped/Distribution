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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assertions")(assertions)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("iterations")(iterations)
    __obj.updateDynamic("prerequestScripts")(prerequestScripts)
    __obj.updateDynamic("prerequests")(prerequests)
    __obj.updateDynamic("requests")(requests)
    __obj.updateDynamic("scripts")(scripts)
    __obj.updateDynamic("testScripts")(testScripts)
    __obj.updateDynamic("tests")(tests)
    __obj.asInstanceOf[Anon_Assertions]
  }
}

