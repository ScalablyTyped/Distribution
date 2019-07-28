package typings.msportalfxDashTest.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var name: String
  var value: String
}

object Feature {
  @scala.inline
  def apply(name: String, value: String): Feature = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Feature]
  }
}

