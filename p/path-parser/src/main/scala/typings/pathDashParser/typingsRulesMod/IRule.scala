package typings.pathDashParser.typingsRulesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRule extends js.Object {
  var name: String
  var pattern: RegExp
  var regex: js.UndefOr[RegExp | RegExpFactory] = js.undefined
}

object IRule {
  @scala.inline
  def apply(name: String, pattern: RegExp, regex: RegExp | RegExpFactory = null): IRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRule]
  }
}

