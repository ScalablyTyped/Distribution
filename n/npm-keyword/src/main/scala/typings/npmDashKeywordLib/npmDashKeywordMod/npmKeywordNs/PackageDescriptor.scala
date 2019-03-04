package typings
package npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageDescriptor extends js.Object {
  var description: java.lang.String
  var name: java.lang.String
}

object PackageDescriptor {
  @scala.inline
  def apply(description: java.lang.String, name: java.lang.String): PackageDescriptor = {
    val __obj = js.Dynamic.literal(description = description, name = name)
  
    __obj.asInstanceOf[PackageDescriptor]
  }
}

