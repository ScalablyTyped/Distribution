package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestSuite extends js.Object {
  var group: java.lang.String
  var module: java.lang.String
  var name: java.lang.String
  var results: js.Any
}

object NightwatchTestSuite {
  @scala.inline
  def apply(group: java.lang.String, module: java.lang.String, name: java.lang.String, results: js.Any): NightwatchTestSuite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[NightwatchTestSuite]
  }
}

