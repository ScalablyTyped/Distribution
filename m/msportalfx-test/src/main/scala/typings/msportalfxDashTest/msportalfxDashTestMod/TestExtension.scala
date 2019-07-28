package typings.msportalfxDashTest.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestExtension extends js.Object {
  var name: String
  var uri: String
}

object TestExtension {
  @scala.inline
  def apply(name: String, uri: String): TestExtension = {
    val __obj = js.Dynamic.literal(name = name, uri = uri)
  
    __obj.asInstanceOf[TestExtension]
  }
}

