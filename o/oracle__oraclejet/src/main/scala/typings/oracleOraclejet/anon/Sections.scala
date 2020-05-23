package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sections extends js.Object {
  var items: Boolean
  var sections: String
  var title: String
}

object Sections {
  @scala.inline
  def apply(items: Boolean, sections: String, title: String): Sections = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sections]
  }
}

