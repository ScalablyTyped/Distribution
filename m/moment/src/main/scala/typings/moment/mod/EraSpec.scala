package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EraSpec extends js.Object {
  var abbr: String
  var name: String
  var narrow: String
  var offset: Double
  var since: String | Double
  var until: String | Double
}

object EraSpec {
  @scala.inline
  def apply(
    abbr: String,
    name: String,
    narrow: String,
    offset: Double,
    since: String | Double,
    until: String | Double
  ): EraSpec = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[EraSpec]
  }
}

