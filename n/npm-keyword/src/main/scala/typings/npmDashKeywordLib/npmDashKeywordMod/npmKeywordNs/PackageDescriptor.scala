package typings
package npmDashKeywordLib.npmDashKeywordMod.npmKeywordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageDescriptor extends js.Object {
  val description: java.lang.String
  val name: java.lang.String
}

object PackageDescriptor {
  @scala.inline
  def apply(description: java.lang.String, name: java.lang.String): PackageDescriptor = {
    val __obj = js.Dynamic.literal(description = description, name = name)
  
    __obj.asInstanceOf[PackageDescriptor]
  }
}

