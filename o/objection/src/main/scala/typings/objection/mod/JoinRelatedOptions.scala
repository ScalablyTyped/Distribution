package typings.objection.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinRelatedOptions extends js.Object {
  var alias: js.UndefOr[String | Boolean] = js.undefined
  var aliases: js.UndefOr[Record[String, String]] = js.undefined
}

object JoinRelatedOptions {
  @scala.inline
  def apply(alias: String | Boolean = null, aliases: Record[String, String] = null): JoinRelatedOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinRelatedOptions]
  }
}

