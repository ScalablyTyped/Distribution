package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object Feature {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Feature = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Feature]
  }
}

