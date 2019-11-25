package typings.npmDashKeyword.npmDashKeywordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageDescriptor extends js.Object {
  val description: String
  val name: String
}

object PackageDescriptor {
  @scala.inline
  def apply(description: String, name: String): PackageDescriptor = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PackageDescriptor]
  }
}

