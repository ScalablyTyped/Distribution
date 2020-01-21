package typings.nodeSqlParser.mod

import typings.nodeSqlParser.nodeSqlParserStrings.dual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dual extends js.Object {
  var `type`: dual
}

object Dual {
  @scala.inline
  def apply(`type`: dual): Dual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dual]
  }
}

