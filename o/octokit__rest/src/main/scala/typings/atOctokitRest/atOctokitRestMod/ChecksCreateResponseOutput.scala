package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponseOutput extends js.Object {
  var summary: String
  var text: String
  var title: String
}

object ChecksCreateResponseOutput {
  @scala.inline
  def apply(summary: String, text: String, title: String): ChecksCreateResponseOutput = {
    val __obj = js.Dynamic.literal(summary = summary, text = text, title = title)
  
    __obj.asInstanceOf[ChecksCreateResponseOutput]
  }
}

