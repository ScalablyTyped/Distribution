package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateResponseOutput extends js.Object {
  var summary: java.lang.String
  var text: java.lang.String
  var title: java.lang.String
}

object ChecksCreateResponseOutput {
  @scala.inline
  def apply(summary: java.lang.String, text: java.lang.String, title: java.lang.String): ChecksCreateResponseOutput = {
    val __obj = js.Dynamic.literal(summary = summary, text = text, title = title)
  
    __obj.asInstanceOf[ChecksCreateResponseOutput]
  }
}

