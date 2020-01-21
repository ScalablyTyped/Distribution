package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestSuite extends js.Object {
  var group: String
  var module: String
  var name: String
  var results: js.Any
}

object NightwatchTestSuite {
  @scala.inline
  def apply(group: String, module: String, name: String, results: js.Any): NightwatchTestSuite = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NightwatchTestSuite]
  }
}

